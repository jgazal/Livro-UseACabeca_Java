package capitulo12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui1B implements ActionListener{ //Implementa a interface. O botão fornecerá eventos somente para quem implementar ActionListener

    JButton button;

    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        button = new JButton("Clique");
        button.addActionListener(this);     //Adiciona o botão a lista de ouvintes

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent event){ //Implementa o método ActionPerformed da interface ActionListener
        button.setText("Fui clicado");
    }
}
