package capitulo12;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {

    public static void main(String[] args){
        MyDrawPanel drawPanel = new MyDrawPanel();
        JFrame frame = new JFrame();

        frame.getContentPane().add(drawPanel);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paintComponent(Graphics g){
        g.setColor(Color.orange);
        g.fillRect(20, 50, 100, 100);
    }
}
