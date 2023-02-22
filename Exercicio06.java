
//Faça um programa para a leitura de duas notas parciais de um aluno.
// O programa deve calcular a média alcançada por aluno e
// apresentar: -> A mensagem "Aprovado", se a média alcançada
// for maior ou igual a sete; -> A mensagem "Reprovado", se a média for menor
// do que sete; -> A mensagem "Aprovado com Distinção", se a média for igual a dez.


import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println(" Informe a primeira nota:");
        double nota1 = ler.nextDouble();

        System.out.println(" Informe a segunda nota:");
        double nota2 = ler.nextDouble();

        double media = (nota1+nota2)/2;

        System.out.println(" A média do aluno é : " + media);

        System.out.println(" =============RESULTADO ======================");

        if(media == 10){
            System.out.println(" Aluno aprovado com Distinção!!!Parabéns!");
        }else if (media >=7.0){
            System.out.println(" Aluno aprovado!!!!");
        }else{
            System.out.println(" Aluno reprovado, precisa estudar mais!!!!!");
        }

        System.out.println(" ===============================================");
    }

}
