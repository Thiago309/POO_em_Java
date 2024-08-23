import java.util.*;
public class OperadoresUnarios {
    public static void main(String[] arg){
        int valor = 15;
        final int percentagemFixa = 15;

        System.out.println("Original: " + valor);
        System.out.println("Pré-fixado: " + ++valor);
        System.out.println();
        System.out.println("Pós-fixado: " + valor++);
        System.out.println("Valor Atualizado: " + valor);

    }
}
