package capitulo13;

import javax.swing.*;
import java.awt.*;

public class Button1B {

    public static void main(String[] args) {
        Button1B gui = new Button1B();
        gui.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        JButton button = new JButton("Cique");

        frame.getContentPane().add(BorderLayout.NORTH, button);
        Font bigFont = new Font("serif", Font.BOLD, 28);
        button.setFont(bigFont);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}
