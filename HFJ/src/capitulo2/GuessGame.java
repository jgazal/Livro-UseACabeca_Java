package capitulo2;

public class GuessGame {
    GuessGamePlayer p1;
    GuessGamePlayer p2;
    GuessGamePlayer p3;

    public void startGame(){
        p1 = new GuessGamePlayer();
        p2 = new GuessGamePlayer();
        p3 = new GuessGamePlayer();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random()*10);
        System.out.println("Estou pensando em um número entre 0 e 9...");

        while(true){
            System.out.println("O número a adivinhar é: " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("O jogaor 1 forneceu o palpite " + guessp1);

            guessp2 = p2.number;
            System.out.println("O jogaor 2 forneceu o palpite " + guessp2);

            guessp3 = p3.number;
            System.out.println("O jogaor 3 forneceu o palpite " + guessp3);

            if(guessp1==targetNumber){
                p1isRight = true;
            }
            if(guessp2==targetNumber){
                p2isRight = true;
            }
            if(guessp3==targetNumber){
                p3isRight = true;
            }
            if(p1isRight || p2isRight || p3isRight){
                System.out.println("Temos um vencedor!");
                System.out.println("O jagador 1 acertou: " + p1isRight);
                System.out.println("O jogador 2 acertou: " + p2isRight);
                System.out.println("O jogador 3 acertou: " + p3isRight);
                System.out.println("Fim do jogo");
                break;
            }else{
                System.out.println("Os jogadores terão que tentar novamente");
            }

        }
    }
}
