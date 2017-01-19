package capitulo6;

import java.util.ArrayList;

public class DotComBust {

    private DotComGameHelper helper = new DotComGameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame(){
        DotCom one = new DotCom();
        one.setName("Pets.com");

        DotCom two = new DotCom();
        two.setName("eToys.com");

        DotCom three = new DotCom();
        three.setName("Go2.com");

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Seu objetivo é eliminar três dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Tente eliminar todas com o menor número de palpites");

        for(DotCom dotComToSet : dotComsList){
            ArrayList<String> newLocation = helper.placeDotCom(3);

            dotComToSet.setLocationCells(newLocation);
        }
    }
    private void startPLaying(){
        while(!dotComsList.isEmpty()){
            String userGuess = helper.getUserInput("Insira um palpite");
            checkUserGuess(userGuess);
        }
    }
    private void checkUserGuess(String userGuess){
        numOfGuesses++;

        String result = "errado";

        for(DotCom dotComToTest : dotComsList){
            result = dotComToTest.checkYourself(userGuess);

            if(result.equals ("correto")){
                break;
            }
            if (result.equals ("eliminar")){
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }
    private void finishGame(){
        System.out.println("Todas as DotCom foram eliminadas! Agora seu conjunto está vazio.");

        if(numOfGuesses <=18){
            System.out.println("Você só usou " + numOfGuesses + "palpites");
            System.out.println("Você saiu antes de eliminar suas opções.");
        }else{
            System.out.println("Demorou demais. " + numOfGuesses + "palpites");
            System.out.println("Não haverá pesca com essas opções");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPLaying();
    }
}
