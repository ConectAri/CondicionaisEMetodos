
/*.

Outra forma de fazer o exercício01

....*/

import java.util.Scanner;

public class Exercício01B {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        int numero01 = ler.nextInt();

        System.out.println("Informe o segundo número:");
        int numero02 = ler.nextInt();

        int media = calculamedia(numero01 , numero02);
        int produto = calculaproduto(numero01, numero02);

        System.out.println("A media dos números são: " + calculamedia(numero01, numero02));

        System.out.println("O produto dos números são:" + calculaproduto(numero01, numero02));
}


    private static int calculaproduto(int numero01, int numero02) {

        int produto = numero01* numero02;
        return produto;
    }

    private static int calculamedia(int numero01, int numero02) {

        int soma = numero01 + numero01;
        int media = soma /2;
        return media;
    }


    }
