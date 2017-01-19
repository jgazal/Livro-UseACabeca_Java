package capitulo1;

public class PhraseOMatic {

    public static void main (String[] args){

        // Criar três conuntos de palavras onde será feita a seleção. Adicione o que quiser
        String[] wordListOne = {"24/7", "várias camadas", "30.000 pés", "B-to-B",
                "todos ganham", "front-end", "baseado na web", "difundido", "inteligente",
                "seis sigma", "caminho crítico", "dinâmico"};

        String[] wordListTwo = {"habilitado", "adesivo", "valor agregado", "orientado",
                "central", "distribuído", "agrupado", "solidificado", "independente da máquina",
                "posicionado", "em rede", "dedicado", "alavancado", "alinhado", "destinado",
                "compartilhado", "cooperativo", "acelerado"};

        String[] wordListThree = {"processado", "ponto máximo", "solução", "arquitetura",
                "habilitação no núcleo", "estratégia", "mindshare", "portal", "espaço",
                "visão", "paradigma", "missão"};

        //Descubra quantas palavras existem em cada lista
        int oneLenght = wordListOne.length;
        System.out.println("A lista 1 possui "+ oneLenght + " palavras");

        int twoLenght = wordListTwo.length;
        System.out.println("A lista 2 possui " + twoLenght + " palavras");

        int threeLenght = wordListThree.length;
        System.out.println("A lista 3 possui " + threeLenght + " palavras");

        //gere três números aleatórios
        int rand1 = (int) (Math.random()*oneLenght);
        System.out.println("Número aleatório da lista 1: " + rand1);

        int rand2 = (int) (Math.random()*twoLenght);
        System.out.println("Número aleatório da lista 2: " + rand2);

        int rand3 = (int) (Math.random()*threeLenght);
        System.out.println("Número aleatório da lista 3: " + rand3);

        //construa a frase
        String frase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        //exiba a frase
        System.out.println("Frase Aleatória: " + frase);

    }
}
