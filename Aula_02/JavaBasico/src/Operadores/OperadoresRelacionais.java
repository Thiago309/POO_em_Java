package Operadores;

public class OperadoresRelacionais {
    public static void main(String[] args){
        //int n1 = 7, n2 = 9;
        int n1 = 1, n2 = 9;
        boolean result, result1;

        result = n1 == n2;
        result1 = n1 <= n2;

        System.out.println("Iguais? " + result);
        System.out.println("n1 maior n2? " + result1);
    }
}
