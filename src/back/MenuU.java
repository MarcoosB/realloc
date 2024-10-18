package back;

import Main.GameManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuU {
    private JPanel panel1;
    private JButton logrosButton;
    private JButton administrarUsuarioButton;
    private JButton nuevaPartidaButton;
    private JButton cargarPartidaButton;
    public MenuU(Admin admin,String key) {
        JFrame window = new JFrame();
        window.setTitle("Login");
        window.setContentPane(panel1);
        window.setSize(1250, 750);
        window.setResizable(false);
        window.setVisible(true);
        nuevaPartidaButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                window.dispose();
                GameManager gm= new GameManager(admin,key);
                gm.nuevaPartida();
                }
        });
        logrosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                window.dispose();
                new VentanaLogros(admin,key);
            }
        });
        cargarPartidaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                window.dispose();
                GameManager gm= new GameManager(admin,key);
                gm.cargarPartida();
            }
        });
        administrarUsuarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                window.dispose();
                new ModificarUsuario(admin, key);
            }
        });
    }
}