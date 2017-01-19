package capitulo1;

public class Main {

    public static void main(String[] args) {
        System.out.println("Eu Governo");
        System.out.println("O Mundo");

        int x=3;
        String name = "Dirk";
        x = x*17;
        System.out.println("x é "+x);
        double d = Math.random();

        while(x>12){
            x = x-1;
        }
        for (x = 0; x<10; x=x+1){
            System.out.println("x agora é "+x);
        }
        if(x==10){
            System.out.println("x deve ser 10");
        }else{
            System.out.println("x não é 10");
        }
        if ((x<3) & (name.equals("Dirk"))){
            System.out.println("Gently");
        }
        System.out.println("não importa o que é executado nessa linha");
    }

}
