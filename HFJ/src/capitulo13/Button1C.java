package capitulo13;

import javax.swing.*;
import java.awt.*;

public class Button1C {

    public static void main(String[] args) {
        Button1C gui = new Button1C();
        gui.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        JButton east = new JButton("Leste");
        JButton west = new JButton("Oeste");
        JButton north = new JButton("Norte");
        JButton south = new JButton("Sul");
        JButton center = new JButton("Centro");

        frame.getContentPane().add(BorderLayout.EAST, east);
        frame.getContentPane().add(BorderLayout.WEST, west);
        frame.getContentPane().add(BorderLayout.NORTH, north);
        frame.getContentPane().add(BorderLayout.SOUTH, south);
        frame.getContentPane().add(BorderLayout.CENTER, center);

        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
