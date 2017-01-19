package capitulo2;

class Ex1ATapeDeckTest {
    public static void main(String[] args) {

        Ex1ATapeDeck t = new Ex1ATapeDeck(); // Faltou criar o objeto

        t.canRecord = true;
        t.playTape();

        if(t.canRecord==true){
            t.recordTape();
        }
    }
}
