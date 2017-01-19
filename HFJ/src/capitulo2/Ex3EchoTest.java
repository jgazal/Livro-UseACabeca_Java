package capitulo2;

public class Ex3EchoTest {

    public static void main(String[] args) {

        Ex3Echo e1 = new Ex3Echo();
        Ex3Echo e2 = new Ex3Echo(); //ou Ex3Echo e2 = e1 da segunda pergunta. Com essa linha, o resultado mostra 10
        //Ex3Echo e2 = e1; // Com essa linha o resultado mostra 24

        int x = 0;
        while (x<4){
            e1.hello();
            e1.count = e1.count + 1;

            if(x==3){
                e2.count = e2.count + 1;
            }
            if (x>0){
                e2.count = e2.count + e1.count;
            }
            x = x + 1;
        }
        System.out.println(e2.count);
    }
}
