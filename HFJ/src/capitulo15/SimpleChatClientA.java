package capitulo15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleChatClientA {

    JTextField outgoing;
    PrintWriter writer;
    Socket sock;

    public static void main(String[] args) {
        new SimpleChatClientA().go();
    }
    public void go(){
        JFrame frame = new JFrame("Client de chat simples");
        JPanel mainPanel = new JPanel();
        outgoing = new JTextField(20);
        JButton sendButton = new JButton("send");
        sendButton.addActionListener(new SendButtonListener());
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        setUpNetworking();
        frame.setSize(400,500);
        frame.setVisible(true);
    }
    private void setUpNetworking(){
        try{
            sock = new Socket("127.0.0.1",5000);
            writer = new PrintWriter(sock.getOutputStream());
            System.out.println("Conexão Estabelecida");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
    public class SendButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            try{
                writer.println(outgoing.getText());
                writer.flush();
            }catch (Exception ex){
                ex.printStackTrace();
            }
            outgoing.setText(" ");
            outgoing.requestFocus();
        }
    }
}
