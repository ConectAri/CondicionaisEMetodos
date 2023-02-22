/*...

4 - Altere o programa do exercício 3 para
 que ele processe os dados de 2 alunos ao invés de apenas 1;

..*/


import java.util.Scanner;

public class Exercício04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nome;
        String nomeB;

        System.out.println("========================================");
        System.out.println("Informe os pesos das provas do Aluno A: ");
        System.out.println("========================================");

        System.out.println("Qual o peso de sua prova 1:");
        int peso1A = input.nextInt();
        System.out.println("Qual o peso de sua prova 2:");
        int peso2A = input.nextInt();


        System.out.println("========================================");
        System.out.println("Informe os pesos das provas do Aluno B: ");
        System.out.println("========================================");

        System.out.println("Qual o peso de sua prova 1: ");
        int peso1B = input.nextInt();
        System.out.println("Qual o peso de sua prova 2: ");
        int peso2B = input.nextInt();


        System.out.println("=====================================");
        System.out.println("    Informações do aluno A e B:      ");
        System.out.println("=====================================");


        System.out.println(" Informe o nome do alunoA ");
       nome = input.nextLine();
        input.nextLine(); // consome a quebra de linha deixada no buffer

        System.out.println(" Informe o nome do alunoB ");
        nomeB = input.nextLine();


        System.out.println(" Informe a matrícula com 6 dígitos aluno: " + nome);
        int matriculaA = input.nextInt();

        System.out.println(" Informe a matrícula com 6 dígitos aluno: " + nomeB);
        int matriculaB = input.nextInt();




        System.out.println(" Informe a nota da primeira prova de:" + nome );
        double nota1A = input.nextInt();

        System.out.println(" Informe a nota da primeira prova de:" + nomeB );
        double nota1B = input.nextInt();

        System.out.println(" Informe a nota da segunda prova de: " + nome );
        double nota2A = input.nextInt();

        System.out.println(" Informe a nota da segunda prova de: " + nomeB );
        double nota2B = input.nextInt();



        double calculaMediaPonderadaA = (calcula_produto(nota1A,  peso1A) +
                calcula_produto(nota2A, peso2A) / (peso1A + peso2A));

        System.out.println(" A matrícula do aluno(a) A " + nome + " é: " + matriculaA);

        System.out.println(" O calculo da média ponderada do aluno A é: " + calculaMediaPonderadaA);

        double calculaMediaPonderadaB = (calcula_produto(nota1B,  peso1B) +
                calcula_produto(nota2B, peso2B) / (peso1B + peso2B));

        System.out.println(" A matrícula do aluno(a) B " + nomeB + " é: " + matriculaB);
        System.out.println(" O calculo da média ponderada do aluno B é: " + calculaMediaPonderadaB);

    }

    public static double calcula_produto(double a, double b){
        return a*b;
    }
}
