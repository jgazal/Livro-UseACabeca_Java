package capitulo1;

public class Ex2Test {

    public static void main(String[] args) {

        int x=0;
        int y=0;

        while (x<5){

            //y = x - y;
            //Saída 00 11 21 32 42
            //------------------------

            //y = y + x;
            //Saída 00 11 23 36 410
            //------------------------

            //y = y + 2;
            //if(y>4){
            //    y = y-1;
            //}
            //Saída 02 14 25 36 47
            //------------------------

            //x = x + 1;
            //y = y + x;
            //Saída 11 34 59
            //------------------------

            if (y<5){
                x = x+1;
                if(y<3){
                    x = x-1;
                }
            }
            y = y+2;
            //Saída 02 14 36 48
            //------------------------

            System.out.print(x + " " + y + " ");
            x = x + 1;
        }
    }
}
