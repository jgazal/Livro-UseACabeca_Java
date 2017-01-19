package capitulo4;

public class DogTest {

    public static void main(String[] args) {
        Dog one = new Dog();
        one.nome = "Bob ";
        one.tamanho = 70;

        Dog two = new Dog();
        two.nome = "Totó ";
        two.tamanho = 8;

        Dog three = new Dog();
        three.nome = "Fido ";
        three.tamanho = 35;

        Dog d = new Dog();
        d.nome = "D ";

        System.out.print(one.nome);
        one.latir();

        System.out.print(two.nome);
        two.latir();

        System.out.print(three.nome);
        three.latir();

        System.out.println(d.nome);
        d.latido(3); //faz repetir 3 vezes o método latido
    }
}
