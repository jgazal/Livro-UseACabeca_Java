package capitulo1;

public class Ex3PollPuzzleOne {

    // A saída deve ser:
    // a noise
    //annoys
    //an oyster

    public static void main(String[] args) {

        int x =0;

        while(x<4){
            System.out.print("a");

            if(x<1){
                System.out.print(" ");
            }
            System.out.print("n");
            if(x>1){
                System.out.print("oyster");
                x = x+2;
            }
            if(x==1){
                System.out.print("noys");
            }
            if(x<1){
                System.out.print("oise");
            }
            System.out.print(" ");
            x= x+1;
        }
    }
}
