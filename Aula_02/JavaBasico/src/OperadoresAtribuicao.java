import java.util.*;
public class OperadoresAtribuicao {
    public static void main(String[] arg){
        int total = 10, valor = 15;

        /*
        System.out.println("Original: " + valor);
        System.out.println("Pré-fixado: " + ++valor);
        System.out.println();
        System.out.println("Pós-fixado: " + valor++);
        System.out.println("Valor Atualizado: " + valor);
        */

        //total = total + 15;
        /*
        total += 15;
        total *= 15;
        total -= 15;
        total /= 15;*/
        total %= 15;

        System.out.println(total);
    }
}
