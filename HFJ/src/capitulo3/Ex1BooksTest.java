package capitulo3;

class Ex1BooksTest {

    public static void main(String[] args) {

        Ex1Books[] myBooks = new Ex1Books[3];

        int x = 0;

        myBooks[0] = new Ex1Books(); //O objeto Book deve ser criado
        myBooks[1] = new Ex1Books(); //O objeto Book deve ser criado
        myBooks[2] = new Ex1Books(); //O objeto Book deve ser criado

        myBooks[0].titulo = "Java vol.1";
        myBooks[1].titulo = "Java vol.2";
        myBooks[2].titulo = "Java vol.3";

        myBooks[0].autor = "Bob";
        myBooks[1].autor = "Ian";
        myBooks[2].autor = "Sue";

        while(x<3){
            System.out.print(myBooks[x].titulo);
            System.out.print(" por ");
            System.out.println(myBooks[x].autor);
            x = x+1;
        }


    }

}
