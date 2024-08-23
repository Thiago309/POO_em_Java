package Operadores;

import java.util.Scanner;

public class OperadoresTernarios {
    public static void main(String[] arg){

        Scanner digite = new Scanner(System.in);
        double mediaFinal;
        // String situacao;
        Boolean situacao;
        System.out.print("Digite a media do aluno: ");
        mediaFinal = digite.nextDouble();

        //situacao = (mediaFinal >= 7.0)? "Aprovado" : "Reprovado";
        situacao = (mediaFinal >= 7.0)? Boolean.TRUE: Boolean.FALSE;
        System.out.println("O aluno foi: " + situacao);
    }
}