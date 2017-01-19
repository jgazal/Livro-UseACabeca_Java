package capitulo10;

import java.util.Date;

public class TestFormats {

    public static void main(String[] args) {
        //String s = String.format("%,d",1000000000); //Decimal

        //String s = String.format("%,2f", 476578.09876); //Ponto Flutuante

        //String s = String.format("%,.2f", 476578.09876); //Ponto Flutuante

        //String s = String.format("%x", 42); //Hexadecimal

        //String s = String.format("%c", 42); //Caractere

        /*int one = 20456654;
        double two = 100567890.248907;
        String s = String.format("A posição é a de número %,d entre as %,.2f existentes", one, two);*/

        //DATA E HORA
        //String s = String.format("%tc", new Date()); //Data e Hora completos
        //String s = String.format("%tr", new Date()); //Apenas a Hora

        /*Date hoje = new Date();
        String s = String.format("%tA, %td, %tB", hoje, hoje, hoje);*/ //Dia da semana(%tA), Dia do mês(%td), Mês(%tB)

        Date hoje = new Date();
        String s = String.format("%tA, %<td %<tB", hoje); //Mesmo exemplo anterior, evitando repetição usando o sinal <
        System.out.println(s);
    }
}
