package capitulo15;

public class RyanAndMonicaJob implements Runnable{

    private BankAccount account = new BankAccount();

    public static void main(String[] args) {
        RyanAndMonicaJob theJob = new RyanAndMonicaJob();

        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);
        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();
    }
    public void run(){
        for(int x=0; x<10; x++){
            makeWithdrawal(10);
            if(account.getBalance()<0){
                System.out.println("Estourou!");
            }
        }
    }
    private synchronized void makeWithdrawal(int amount){   //synchronized - Altera um método de modo que só um segmento de cada vez possa acessá-lo
        if(account.getBalance() >= amount){
            System.out.println(Thread.currentThread().getName() + " vai fazer uma retirada");
            try{
                System.out.println(Thread.currentThread().getName() + " vai dormir");
                Thread.sleep(500);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " acordou");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " concluiu a retirada");
        }else{
            System.out.println("Desculpe, não tem o suficiente para " + Thread.currentThread().getName());
        }
    }
}
