package capitulo12;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanelB extends JPanel{

    public static void main(String[] args){
        MyDrawPanelB mpb = new MyDrawPanelB();
        JFrame frame = new JFrame();

        frame.getContentPane().add(mpb);
        frame.setSize(470,370);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paintComponent (Graphics g){
        Image image = new ImageIcon("/home/jgazal/IdeaProjects/HFJ/src/Capitulo12/catzilla.jpg").getImage(); //caminho da imagem
        g.drawImage(image,3,4,this);    //3 e 4 são as coordenadas x,y onde a imagem deve ficar
    }
}
