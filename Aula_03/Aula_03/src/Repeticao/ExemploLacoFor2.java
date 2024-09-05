package Repeticao;

import java.util.Random;
import java.util.Scanner;

public class ExemploLacoFor2 {
    public static void main(String[] args) {
        final int DIAS_ANO = 365, DIAS_MES = 30;
        Scanner leia = new Scanner(System.in);
        double valor1, valor2, resultado;
        int opcoes, idadeAnos, idadeMeses, idadeDias;
        String continua = "sim";

        while(continua.equals("sim")){
            System.out.println("Menu de Opções");
            System.out.println("1. Operações Matemáticas");
            System.out.println("2. Conversor de Anos em Dias");
            System.out.println("3. Encontrar um valor");
            System.out.println("4. Converter String para Double");
            System.out.println("5. Sair");

            System.out.print("Digite uma opção: ");
            opcoes = leia.nextInt();

            switch (opcoes){
                case 1:
                    System.out.println("Digite dois valores: ");
                    valor1 = leia.nextDouble();
                    valor2 = leia.nextDouble();
                    resultado = valor1 + valor2;
                    System.out.println("A soma dos valores é: " + resultado);
                    resultado = valor1 - valor2;
                    System.out.println("A subtração dos valores é: " + resultado);
                    resultado = valor1 * valor2;
                    System.out.println("A multiplicação dos valores é: " + resultado);
                    resultado = valor1 / valor2;
                    System.out.println("A Divisão dos valores é: " + resultado);
                    break;
                case 2:
                    System.out.println("Digite a sua idade em (anos, meses, dias): ");
                    idadeAnos = leia.nextInt();
                    idadeMeses = leia.nextInt();
                    idadeDias = leia.nextInt();
                    resultado = (idadeAnos*DIAS_ANO) + (idadeMeses*DIAS_MES) + idadeDias;
                    System.out.println("A sua idade expressada em dias é: " + resultado);
                    break;
                case 3:
                    Random geradorNumero = new Random();
                    int valor, valorGerado, posicao=0;
                    System.out.println("Digite um valor a ser encontrado: ");
                    valor = leia.nextInt();
                    boolean achou = false;
                    for (int i = 1; i <= 10; i++){
                        valorGerado = geradorNumero.nextInt(0,5);
                        System.out.println("valor gerado: " + valorGerado);
                        if (valorGerado == valor){
                            achou = true;
                            posicao = i;
                        }
                        if (achou){
                            System.out.println("O nummero " + valor
                                    + " se encontra na posição: " + posicao);
                            break;
                        }
                    }
                    break;
                case 4:
                    String preco,quantidade, total;
                    double precoD, totalD;
                    int quantidadeI;
                    System.out.print("Digite o valor do produto: ");
                    preco = leia.next();
                    System.out.print("Digite o a quantidade do produto: ");
                    quantidade = leia.next();
//                    precoD = Double.parseDouble(preco);
//                    quantidadeI = Integer.parseInt(quantidade);
//                    totalD = precoD * quantidadeI;
//                    total = String.valueOf(totalD);
                    System.out.println("Mostrando no Front");
                    System.out.println("O Valor total a pagar é: " + String.valueOf(Double.parseDouble(preco) * Integer.parseInt(quantidade)));
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção escolhida não existe!");
            }

            System.out.println("Deseja Continuar? (sim/nao)");
            continua = leia.next();
        }
    }
}