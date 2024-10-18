
package Main;
import back.Admin;


public class GameManager {

    ControladorDeAcciones ControladorA = new ControladorDeAcciones(this);
    ControladorDeAcciones2 ControladorB = new ControladorDeAcciones2(this);

    public UI ui = new UI(this);
    public Historia h;
    public Admin admin;
    public String key;

    public GameManager(Admin admin,String key) {
        this.admin=admin;
        this.key=key;
         h= new Historia(this, admin,key);
    }
    public void nuevaPartida() {
        admin.getPlayer(key).setPuntoGuardado(1);
        h.menu(1);
        ui.window.setVisible(true); // ESTO HACE QUE LA VENTANA SE MUESTRE DESPUES DE CREAR LA VIÑETA CON LA HISTORIA.
    }
    public void cargarPartida() {
        int checkpoint= admin.getPlayer(key).getPuntoGuardado();
        h.menu(checkpoint);
        ui.window.setVisible(true); // ESTO HACE QUE LA VENTANA SE MUESTRE DESPUES DE CREAR LA VIÑETA CON LA HISTORIA.
    }
}
