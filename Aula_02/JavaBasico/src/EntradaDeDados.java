import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String nome;
        int idade;
        Double salario;
        Boolean existe;

        System.out.println("Digite o seu nome: ");
        nome = input.nextLine();
        System.out.println("Digite a sua idade: ");
        idade = input.nextInt();
        System.out.println("Digite o seu salario: ");
        salario = input.nextDouble();
        System.out.println("Voce existe?: ");
        existe = input.nextBoolean();

        System.out.println("Seu nome é: " + nome + " a sua idade é: "+ idade +" anos e você ganha: R$"+ salario +" " +
                            " voce existe? " + existe);

        input.close();
    }
}