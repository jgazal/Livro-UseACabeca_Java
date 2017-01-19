package capitulo1;

public class Loopy {

    public static void main (String[] args){

        int x=1;
        System.out.println("Antes do loop");
        while(x<4){
            System.out.println("Em loop");
            System.out.println("o valor de x é "+ x);
            x = x+1;
        }
        System.out.println("Fim do loop");
    }
}
