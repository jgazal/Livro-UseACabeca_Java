package capitulo5;

public class SimpleDotComGame {

    public static void main(String[] args) {
        int numOfGuess = 0;

        SimpleDotComGameHelper helper = new SimpleDotComGameHelper ();

        SimpleDotCom theDotCom = new SimpleDotCom();

        int randomNum = (int) (Math.random())*5;

        int[] locations = {randomNum, randomNum+1, randomNum+2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while(isAlive==true){
            String guess = helper.getUserInput("Insira um número");
            String result = theDotCom.checkYourself(guess);

            numOfGuess++;

            if(result.equals("kill")){
                isAlive = false;
            }
        }
    }
}
