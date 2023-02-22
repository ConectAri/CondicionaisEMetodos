
/*..

 Outra forma de fazer o exercício 02

...*/

import java.util.Scanner;

public class Exercicio02B {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o peso da prova 01:");
        int peso1 = Integer.parseInt(ler.nextLine());
        // Integer.parseInt() é um método da classe Integer que
        // converte uma string que representa um número inteiro
        // em um valor do tipo int.
        System.out.println("Informe o peso da prova 02:");
        int peso2 = Integer.parseInt(ler.nextLine());

        System.out.println("==============================");
        System.out.println("        Dados do aluno:       ");
        System.out.println("==============================");
        System.out.println(" Informe a matrícula do aluno:");
        int matricula = Integer.parseInt(ler.nextLine());

        System.out.print("Digite a nota da primeira prova: ");
        double nota1 = Double.parseDouble(ler.nextLine());

        System.out.print("Digite a nota da segunda prova:  ");
        double nota2 = Double.parseDouble(ler.nextLine());


        double media = calculaMediaPonderada(nota1,peso1, nota2, peso2);

        System.out.println("A matrícula é: " + matricula);
        System.out.println("A média ponderada é: " + media);
    }

    public static double calculaMediaPonderada(double nota1, int peso1, double nota2, int peso2) {

        double media = ((nota1*peso1)+(nota2 * peso2)/peso1 + peso2);
        return media;

    }

}

