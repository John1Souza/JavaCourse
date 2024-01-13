package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Observer {
    public static void main(String[] args) {
        JFrame window = new JFrame("Observer");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(600, 200);
        window.setLayout(new FlowLayout());
        window.setLocationRelativeTo(null); // Centralizar na tela do PC

        JButton button = new JButton("Click!");
        window.add(button);

        button.addActionListener(event -> {
            System.out.println("An event occurred!");
        });

        window.addFocusListener(new FocusListener() {

            public void focusGained(FocusEvent e) {

            }

            public void focusLost(FocusEvent e) {

            }
        });
        window.setVisible(true);
    }
}
