package capitulo2;

class Ex1BDvdPlayerTes {

    public static void main(String[] args) {

        Ex1BDvdPlayer d = new Ex1BDvdPlayer();
        d.canRecord = true;
        d.playDVD();

        if(d.canRecord==true){
            d.recordDVD();
        }
    }
}
