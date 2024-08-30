package Condicionais;
import java.util.*;

public class ExemploIf {
    public static void main(String Args[]){
        Scanner input = new Scanner(System.in);
        final int DIAS_ANO = 360, DIAS_MES = 30;
        double valor1, valor2, resultado;
        int opcoes, idadeAnos, idadeMeses, idadeDias;

        System.out.println("Menu de opções");
        System.out.println("1. Operações Matematicas");
        System.out.println("2. Conversão de anos em dias");
        System.out.println("3. Calculo de Salário Mínimo");
        System.out.println("4. ");
        System.out.println("5. Sair");

        System.out.println("Digite uma opção: ");
        opcoes = input.nextInt();

        if(opcoes == 1){
            System.out.println("Digite dois valores: ");
            valor1 = input.nextDouble();
            valor2 = input.nextDouble();

            resultado = valor1 + valor2;
            System.out.printf("A soma dos valores é: %.2f\n", resultado);

            resultado = valor1 - valor2;
            System.out.printf("A subtração dos valores é: %.2f\n", resultado);

            resultado = valor1 * valor2;
            System.out.printf("A multiplicação dos valores é: %.2f\n", resultado);

            resultado = valor1 / valor2;
            System.out.printf("A divisão dos valores é: %.2f\n", resultado);

        }else if(opcoes == 2) {
            System.out.println("Digite a sua idade em (anos, meses, dias): ");
            idadeAnos = input.nextInt();
            idadeMeses = input.nextInt();
            idadeDias = input.nextInt();
            resultado = (idadeAnos * DIAS_ANO) + (idadeMeses * DIAS_MES) + idadeDias;
            System.out.println("A sua idade expressada em dias é: " + resultado);

        }else if(opcoes == 5){
            System.exit(0);

        }else{
            System.out.println("A opção escolhida não existe!");

        }
    }
}