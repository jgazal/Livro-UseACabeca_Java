package capitulo12;

import javax.swing.*;

public class SimpleGui1 {

    public static void main(String[] args) {

        JFrame frame = new JFrame();    //Cria moldura

        JButton button = new JButton("Clique");   //Cria botão

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //Encerra o programa quando fechar a janela

        frame.getContentPane().add(button); //Adiciona o botão na moldura

        frame.setSize(300,300); //Tamanho da moldura(em pixels)

        frame.setVisible(true); //Torna visivel
    }
}
