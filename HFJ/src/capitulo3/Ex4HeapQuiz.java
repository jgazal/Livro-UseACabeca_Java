package capitulo3;

public class Ex4HeapQuiz {

    int id=0;

    public static void main(String[] args) {

        int x = 0;

        Ex4HeapQuiz[] hq = new Ex4HeapQuiz[5];

        while(x < 3){
            hq[x] = new Ex4HeapQuiz();
            hq[x].id = x;
            x = x + 1;
        }
        hq[3] = hq[1];
        hq[4] = hq[1];
        hq[3] = null;
        hq[4] = hq[0];
        hq[0] = hq[3];
        hq[3] = hq[2];
        hq[2] = hq[0];

    }
}
