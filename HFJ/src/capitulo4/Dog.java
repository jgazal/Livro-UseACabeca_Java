package capitulo4;

class Dog {

    int tamanho;
    String nome;

    void latir(){

        if (tamanho > 60){
            System.out.println("Woof! Woof!");

        }else if (tamanho > 14){
            System.out.println("Ruff! Ruff!");

        }else{
            System.out.println("Yip! Yip!");
        }
    }

    void latido(int numLatidos){
        while (numLatidos > 0){
            numLatidos = numLatidos -1;
            System.out.println("Au!Au!Au!");
        }
    }
}
