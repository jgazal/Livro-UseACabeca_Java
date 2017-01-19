package capitulo15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class DailyAdviceClient {

    public static void main(String[] args) {
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }
    public void go(){
        try{
            Socket s = new Socket("127.0.0.1",4242);

            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);

            String advice = reader.readLine();
            System.out.println("Mensagem do servidor: " + advice);

            reader.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
