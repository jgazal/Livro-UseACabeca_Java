package capitulo15;

public class RunThreads implements Runnable{

    public static void main(String[] args) {
        RunThreads runner = new RunThreads();
        Thread alpha = new Thread(runner);
        Thread beta = new Thread(runner);

        alpha.setName("segmento Alpha");
        beta.setName("segmento Beta");

        alpha.start();
        beta.start();
    }
    public void run(){
        for(int i=0; i<25; i++){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " está sendo executado");
        }
    }
}
