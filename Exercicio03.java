
//3 - Altere o programa do exercício 2 para que ele utilize a função
// calcula_produto do exercício 1 no cálculo da média ponderada;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("Informe os pesos das provas: ");
        System.out.println("=============================");

        System.out.println("Qual o peso de sua prova 1:");
        int peso1 = ler.nextInt();
        System.out.println("Qual o peso de sua prova 2:");
        int peso2 = ler.nextInt();


        System.out.println("=============================");
        System.out.println("    Informações do aluno:    ");
        System.out.println("=============================");

        System.out.println("Informe sua matrícula com 6 dígitos:  ");
        int matricula = ler.nextInt();

        System.out.println("Informe o nome do aluno: ");
        String nome = ler.nextLine();
        ler.nextLine(); // consome a quebra de linha deixada no buffer

        System.out.println("Informe a nota de sua prova 1: ");
        double nota1 = ler.nextInt();

        System.out.println("Informe a nota de sua prova 2: ");
        double nota2 = ler.nextInt();



        double calculaMediaPonderada = (calcula_produto(nota1,  peso1) +
                calcula_produto(nota2, peso2) / (peso1 + peso2));

        System.out.println(" A matrícula do aluno(a)" + nome + " é: " + matricula);
        System.out.println("O calculo da média ponderada do aluno é: " + calculaMediaPonderada);

    }

    public static double calcula_produto(double a, double b){
        return a*b;
    }

    }
