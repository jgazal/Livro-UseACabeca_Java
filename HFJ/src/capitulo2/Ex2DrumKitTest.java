package capitulo2;

class Ex2DrumKitTest {

    public static void main(String[] args) {

        Ex2DrumKit d = new Ex2DrumKit();
        d.playSnare();
        d.snare = false;
        d.playTopHat();

        if(d.snare==true){
            d.playSnare();
        }
    }
}
