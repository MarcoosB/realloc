package back;

import com.google.gson.reflect.TypeToken;

import javax.swing.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Admin extends User implements IAdministrable{
    private HashmapHandler<String,Player> players=new HashmapHandler<>();
    private HashmapHandler<String, Player>playersBorrados=new HashmapHandler<>();
    public Admin(){
        setNick("Admin");
        setPassword("Admin");
        setPlayers();
    }
    public Player crearPlayer(String nombre,String password,String confirmacionPassword){
        Player player=new Player();
            try {
                setNickPrivado(nombre, player);
                setPasswordPrivado(password, confirmacionPassword, player);
                agregarPlayer(player);
                guardarPLayers();
            }
            catch(RuntimeException e){
                Icon iconoError= UIManager.getIcon("OptionPane.errorIcon");
                JOptionPane.showMessageDialog(null, e.getMessage(),"Error creando usuario", JOptionPane.ERROR_MESSAGE, iconoError);
               return null;
            }
        return player;
    }
    private void setPlayers(){
        players=new HashmapHandler<>(players.recibirHashmapDesdeJson(ARCHIVO_JUGADORES,new TypeToken<HashMap<String, Player>>() {}.getType()));
    }
    public void guardarPLayers(){players.cargarHashmapAJson(ARCHIVO_JUGADORES);}
    private void setNickPrivado(String nombre,Player player){//ESTE SET NICK SE USA PARA VALIDAR EL NICK
        if(players.existe(nombre)) {
           throw new UsuarioExistenteException(nombre);
        }
        else setNick(nombre,player);//EL SET NICK QUE PIDE UN PLAYER LE SETEA ESE NICK A ESE PLAYER
    }
    private void setPasswordPrivado(String password,String confirmacionPassword,Player player){//ESTE SET PASSWORD VERIFICA LA PASSWORD
        if(password.equals(confirmacionPassword))setPassword(password,player);//EL SET PASSWORD QUE PIDE UN PLAYER LE SETEA ESA PASSWORD A ESE PLAYER
        else{throw new ContraseniaNoCoincideException();}
    }
    private void setNick(String nick,Player player){player.setNick(nick);}
    public boolean cambiarNick(String nick,String nuevoNick,Player player){
        try{
            Player player1=new Player();
            player1.setPuntoGuardado(players.getHashMap().get(nick).getPuntoGuardado());
            player1.setLogros(players.getHashMap().get(nick).getLogros());
            player1.setPassword(players.getHashMap().get(nick).getPassword());
            players.getHashMap().remove(nick);
            borrarCuenta(player);
            setNickPrivado(nuevoNick,player1);
            players.agregarElemento(nuevoNick,player1);
            guardarPLayers();
            return true;
        }catch (UsuarioExistenteException e){
            Icon iconoError= UIManager.getIcon("OptionPane.errorIcon");
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error creando usuario", JOptionPane.ERROR_MESSAGE, iconoError);
            return false;
        }
    }
    private void borrarCuentaParaCambiarNick(Player player){
        players.getHashMap().remove(player.getNick());
        players.cargarHashmapAJson(ARCHIVO_JUGADORES);
    }
    public Player getPlayer(String nick){return players.devolverValue(nick);}
    private void setPassword(String password,Player player){player.setPassword(password);}
    private void agregarPlayer(Player player){players.agregarElemento(player.getNick(),player);}
    public void mostrarPlayers(){players.getHashMap().forEach(( s,player)-> System.out.println(s+" "+ player.verPlayer()));}
    public void desbloquearLogro(String nick,LogrosTitle logrosTitle) {
        try{
            if(players.existe(nick)){
                if(players.devolverValue(nick).logros.devolverValue(logrosTitle).getEstadoDeAcceso().equals(EstadoDeAcceso.BLOQUEADO)){
                    ReproducirMusica reproducirMusica= new ReproducirMusica();
                    reproducirMusica.cargarSonido("SoundFX/LogroDesbloqueado.wav");
                    reproducirMusica.reproducirSonido();
                    JOptionPane.showMessageDialog(null,logrosTitle,"LOGRO DESBLOQUEADO",JOptionPane.INFORMATION_MESSAGE);
                    players.devolverValue(nick).logros.devolverValue(logrosTitle).setEstadoDeAcceso(EstadoDeAcceso.DESBLOQUEADO);

                }
                players.cargarHashmapAJson(ARCHIVO_JUGADORES);
            }
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }//MODIFICA EL ESTADO DE ACCESO DE UN LOGRO ESPECIFICO DEL PLAYER
    public void borrarCuenta(Player player){
        player.setEstadoDeAcceso(EstadoDeAcceso.BLOQUEADO);
        players.getHashMap().remove(player.getNick());
        players.cargarHashmapAJson(ARCHIVO_JUGADORES);
        playersBorrados.agregarElemento(player.getNick(),player);
        playersBorrados.cargarHashmapAJson(PAPELERA_JUGADORES);
    }
    private void recuperarCuentaPrivado(String nombre)throws RuntimeException{
        if(playersBorrados.existe(nombre)){
            playersBorrados.getHashMap().get(nombre).setEstadoDeAcceso(EstadoDeAcceso.DESBLOQUEADO);
            players.agregarElemento(nombre,playersBorrados.getHashMap().get(nombre));
            players.cargarHashmapAJson(ARCHIVO_JUGADORES);
            playersBorrados.getHashMap().remove(nombre);
            playersBorrados.cargarHashmapAJson(PAPELERA_JUGADORES);
        }
        else throw new RuntimeException("El jugador no se encontro en la papelera");
    }
    public void recuperarCuenta(String nombre){
        try {
            recuperarCuentaPrivado(nombre);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
    private Player cargarUsuarioPrivado(String nombre,String password)throws RuntimeException{
        if(players.existe(nombre)) {
            if (players.getHashMap().get(nombre).getPassword().equals(password)) {
                return players.devolverValue(nombre);
            } else throw new ContraseñaIncorrectaException("Contraseña incorrecta");
        }else throw new UsuarioNoEncontradoException("Jugador no encontrado");
    }
    public Player cargarUsuario(String nombre,String password){
        try{
            return cargarUsuarioPrivado(nombre,password);
        }catch (ContraseñaIncorrectaException|UsuarioNoEncontradoException e){
            Icon iconoError= UIManager.getIcon("OptionPane.errorIcon");
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error de Login", JOptionPane.ERROR_MESSAGE, iconoError);
        }
        return null;
    }
    @Override
    public String toString() {
        return "Admin{" +
                "players=" + players +
                ", playersBorrados=" + playersBorrados +
                '}';
    }
}