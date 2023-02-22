
/*

Exercicio 01:

1 - Faça um programa que leia 2 números inteiros, calcule e exiba a média aritmética e
o produto dos números. O seu programa deve, obrigatoriamente, utilizar as seguintes
 funções feitas por você:

calculaMedia(): recebe 2 números inteiros como parâmetros e retorne a média dos números;
 calculaProduto(): recebe 2 números inteiros como parâmetros e retorna o produto dos números


..*/


import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner ler = new Scanner (System.in);

        int numero01;
        int numero02;

        System.out.println("Informe o primeiro número inteiro:");
        numero01 = ler.nextInt();
        System.out.println("Informe o segundo número inteiro:");
        numero02 = ler.nextInt();

        int calculamedia = (numero01 + numero02)/2;
        int calculaproduto = numero01 * numero02;

        System.out.println("========================================");
        System.out.println(" O resultado da média e do produto são: ");
        System.out.println("========================================");

        System.out.println(" A média do primeiro número e do segundo número:" + calculamedia);
        System.out.println(" O produto do primeiro número e do segundo número:" + calculaproduto);
    }

}
