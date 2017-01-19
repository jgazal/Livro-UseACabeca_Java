package capitulo3;

public class Ex1BHobbits {

    String name;

    public static void main(String[] args) {

        Ex1BHobbits[] h = new Ex1BHobbits[3];
        int z = -1; // As matrizes começam com o elemento 0, por isso z deve ser -1

        while(z<2){
            z = z + 1;
            h[z] = new Ex1BHobbits();
            h[z].name = "Bilbo";

            if(z==1){
                h[z].name = "Frodo";
            }
            if(z==2){
                h[z].name = "Sam";
            }
            System.out.print(h[z].name + " é um ");
            System.out.println(" bom nome para um Hobbit");
        }
    }
}
