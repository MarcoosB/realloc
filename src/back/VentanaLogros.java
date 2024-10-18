package back;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;
import java.util.Map;

public class VentanaLogros {
    private JPanel panel1;
    private JButton salirButton;
    private JTextArea textArea1;

    public VentanaLogros(Admin admin,String key) {
        JFrame window = new JFrame();
        window.setTitle("Logros desbloqueados");
        window.setContentPane(panel1);
        window.setSize(1250, 750);
        window.setResizable(false);
        window.setVisible(true);

       HashMap hashMap = admin.getPlayer(key).getLogros().getHashMap();

        JTextArea textArea = new JTextArea();
        hashMap.forEach((clave, value) -> textArea.append(clave + ": " + value + "\n"));

        JScrollPane scrollPane = new JScrollPane(textArea);
        window.add(scrollPane, BorderLayout.CENTER);


        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                window.dispose();
                new MenuU(admin, key);
            }
        });

    }


        /*
        List<Logro> a= new ArrayList<>(admin.getPlayer(key).verLogros());
        textArea1=new JTextArea();
        textArea1.setEditable(false);

        System.out.println(a.toString());

        if(a.isEmpty())textArea1.setText("Todavia no has desbloqueado logros.");
        else textArea1.setText(a.toString());



    }
   */

}
