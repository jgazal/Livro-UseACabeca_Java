package capitulo4;

class GoodDogTest {

    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setTamanho(70);

        GoodDog two = new GoodDog();
        two.setTamanho(8);

        System.out.println("Cachorro 1: " + "tamanho " + one.getTamanho());
        System.out.println("Cachorro 2: " + "tamanho " + two.getTamanho());

        one.latir();
        two.latir();
    }
}
