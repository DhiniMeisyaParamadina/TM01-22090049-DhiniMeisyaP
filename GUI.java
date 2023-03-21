package Netbook;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JPanel GUI;
    private JTextField tfmasseger;
    private JTextField tfstatus;
    private JTextField tfcomment;
    private JButton submitButton;
    private JTextField textField4;
    private JButton closesButton;
public GUI() {
    submitButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //membuat variabel
            double masseger,status,comment;

            //mengambil inputan dari text field
            masseger = Double.parseDouble(tfmasseger.getText());
            status = Double.parseDouble(tfstatus.getText());
            comment = Double.parseDouble(tfcomment.getText());

        }
    });

    closesButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });
}
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        frame.setContentPane(new GUI().GUI);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
