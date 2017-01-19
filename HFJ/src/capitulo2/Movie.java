package capitulo2;

class Movie {

    String titulo; //title
    String genero; //genre
    int classificacao; //rating

    void playIt(){
        System.out.println("Assistindo o filme: "   + titulo);
        System.out.println("Genero: "+ genero);
        System.out.println("Classificação: " + classificacao);
    }
}
