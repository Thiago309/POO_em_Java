public class ComandosBasicos {
    public static void main(String[] args) {
        /* System.out.println("Olá Turma!");
        System.out.printf("Olá Turma!");
        */

        //Declaração de Variaveis.
        byte menorValor = -128;
        byte maiorValor = 127;
        boolean verdadeiro = true;
        boolean falso = false;
        char letra = 'a';
        String nome = "Lenin StarWars";
        int n1 = 10;
        int n2 = 30;
        double salario = 1595.232;

        System.out.printf(nome + "\n");
        System.out.print(nome.length() + "\n");
        System.out.println("Nome: " + "\"" + nome + "\"");


        int result = n1 + n2;
        System.out.printf("Imprimindo o valor inteiro %d", result);
        System.out.println(" Imprimindo o valor inteiro " + result);
        System.out.print(result);
        System.out.printf("Imprimindo o valor inteiro %.2f", salario);
        System.out.println(" Imprimindo o valor inteiro " + menorValor);
    }
}