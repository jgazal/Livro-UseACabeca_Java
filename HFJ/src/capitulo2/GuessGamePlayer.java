package capitulo2;

public class GuessGamePlayer {

    int number = 0;

    public void guess(){
        number = (int) (Math.random()*10);
        System.out.println("Estou pensando em: " + number);
    }
}
