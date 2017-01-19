package capitulo12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoButtons {

    JFrame frame;
    JLabel label;

    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.go();
    }
    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("Mudar texto");
        labelButton.addActionListener(new LabelListener());

        JButton colorButton = new JButton("Mudar cor do circulo");
        colorButton.addActionListener(new ColorListener());

        label = new JLabel("Sou um texto");
        MyDrawPanel3c drawPanel = new MyDrawPanel3c();

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(500,300);
        frame.setVisible(true);
    }
    class LabelListener implements ActionListener {

        public void actionPerformed(ActionEvent event){
            label.setText("OK!");
        }
    }
    class ColorListener implements ActionListener{

        public void actionPerformed(ActionEvent event){
            frame.repaint();
        }
    }

}
