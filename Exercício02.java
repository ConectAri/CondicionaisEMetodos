
/* Exercício 02

 Faça um programa que calcule e imprima a média ponderada de um aluno.
 Inicialmente, o programa deverá ler o peso da primeira prova e o peso
 da segunda prova (ambos inteiros). A seguir, o programa deverá ler os
 seguintes dados do aluno: matrícula (inteiro), nota da primeira prova
 e nota da segunda prova (ambas reais). Por último, o programa deve mostrar
 a matricula do aluno seguida da sua média. O seu programa deve, obrigatoriamente,
 utilizar a seguinte função feita por você:

calculaMediaPonderada(): recebe 2 notas (reais) e seus respectivos pesos
(inteiros) como parâmetros e retorna a média ponderada dos valores;

* */

import java.util.Scanner;
import java.util.Scanner;

public class Exercício02 {

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

        System.out.println("Informe a nota de sua prova 1:");
        double nota1 = ler.nextInt();

        System.out.println("Informe a nota de sua prova 2:");
        double nota2 = ler.nextInt();

        double calculaMediaPonderada = (nota1*peso1 + nota2*peso2)/peso1+peso2;

        System.out.println(" A matrícula do aluno(a)" + nome+ "é" + matricula);
        System.out.println("O calculo da média ponderada do aluno é:" + calculaMediaPonderada);


    }

}
