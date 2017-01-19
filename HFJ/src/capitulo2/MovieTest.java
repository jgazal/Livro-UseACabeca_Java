package capitulo2;

public class MovieTest {
    public static void main(String[] args) {
        System.out.println("Filme 1");
        Movie one = new Movie();
        one.titulo = "Gone with the stock";
        one.genero = "Tragic"; //Tragic
        one.classificacao = -2;
        one.playIt();
        System.out.println("_______________________");

        System.out.println("Filme 2");
        Movie two = new Movie();
        two.titulo = "Lost in Cubicle Space";
        two.genero = "Comedy";
        two.classificacao = 5;
        two.playIt();
        System.out.println("_______________________");

        System.out.println("Filme 3");
        Movie three = new Movie();
        three.titulo = "Byte Club";
        three.genero = "Tragic but ultimately uplifting";
        three.classificacao = 127;
        three.playIt();
    }
}
