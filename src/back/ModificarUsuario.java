package back;

import Main.Login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModificarUsuario {
    private JPanel panelModificar;
    private JTextField nuevoNombre;
    private JButton cambiarNombreDeUsuarioButton;
    private JButton ELIMINARButton;

    public ModificarUsuario(Admin admin, String key){
        JFrame window = new JFrame();
        window.setTitle("Login");
        window.setContentPane(panelModificar);
        window.setSize(1250, 750);
        window.setResizable(false);
        window.setVisible(true);
        cambiarNombreDeUsuarioButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean cambio;
                String nombreNuevo = nuevoNombre.getText();
                cambio= admin.cambiarNick(key,nombreNuevo, admin.getPlayer(key));
                if(cambio) {
                    window.dispose();
                    new MenuU(admin, nombreNuevo);
                }
            }
        });
        ELIMINARButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Player player= admin.getPlayer(key);
                admin.borrarCuenta(player);
                window.dispose();
                new Login();
            }
        });
    }
}
