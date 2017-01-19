package capitulo15;

public class MyRunnable implements Runnable {

    public void run(){
        go();
    }
    public void go(){

        try{
            Thread.sleep(2000); //2000 = 2s
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }

        doMore();
    }
    public void doMore(){
        System.out.println("Topo da pilha");
    }
}
