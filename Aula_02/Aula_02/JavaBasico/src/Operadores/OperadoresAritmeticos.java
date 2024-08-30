package Operadores;

import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main (String args[]){
        Scanner leia = new Scanner(System.in);
        double resto, n1, n2, soma, sub, mult, div;

        System.out.println("Digite dois números: ");
        n1 = leia.nextDouble();
        n2 = leia.nextDouble();

        soma = n1 + n2;
        sub = n1 - n2;
        mult = n1 * n2;
        div = n1 / n2;
        resto = n1 % n2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("mult: " + mult);
        System.out.println("div: " + div);
        System.out.println("resto: " + resto);

        leia.close();
    }
}
