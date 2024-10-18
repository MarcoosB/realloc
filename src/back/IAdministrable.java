package back;

public interface IAdministrable {
    void borrarCuenta(Player player);
    Player cargarUsuario(String nick,String password);
    boolean cambiarNick(String nick,String nuevoNick,Player player);
    Player crearPlayer(String nick,String password,String confirmacionPassword);
}
