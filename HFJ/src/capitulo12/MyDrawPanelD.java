package capitulo12;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanelD extends JPanel {

    public static void main(String[] args){
        MyDrawPanelD mpd = new MyDrawPanelD();
        JFrame frame = new JFrame();

        frame.getContentPane().add(mpd);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

/*    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        GradientPaint gradient = new GradientPaint(70,70,Color.blue,150,150,Color.orange);

        g2d.setPaint(gradient);
        g2d.fillOval(70,70,100,100);
    }*/
    //Mesmo código acima, exceto que cria cores aleatórias para o início e fim do gradiente
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        int red = (int) (Math.random()*255);
        int green = (int) (Math.random()*255);
        int blue = (int) (Math.random()*255);
        Color startColor = new Color(red, green, blue);

        red = (int) (Math.random()*255);
        green = (int) (Math.random()*255);
        blue = (int) (Math.random()*255);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradient = new GradientPaint(70,70,startColor,150,150,endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70,70,100,100);
    }
}
