package back;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

public class VentanaLogros {
    private JPanel panel1;
    private JButton salirButton;
    private JScrollPane Logro;
    private JTextArea textArea1;


    public VentanaLogros(Admin admin, String key) {
        JFrame window = new JFrame();
        window.setTitle("Logros desbloqueados");
        window.setContentPane(panel1);
        window.setSize(1250, 750);
        window.setResizable(false);
        window.setVisible(true);




        List<Logro> a = new ArrayList<>(admin.getPlayer(key).verLogros());
        textArea1.setEditable(false);
        textArea1.setRows(a.size());

        StringBuilder sb = new StringBuilder();
        for (Logro elemento : a) {
             sb.append("Titulo: ").append(elemento.getLogrosTitle()).append("\n").append("Descripcion: ").append(elemento.getDescripcion()).append("\n\n");
        }

        // Mostrar el texto en el JTextArea
        textArea1.setText(sb.toString());



        if (sb.isEmpty()) textArea1.setText("Todavia no has desbloqueado logros.");



        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                window.dispose();
                new MenuU(admin, key);
            }
        });

    }

}










