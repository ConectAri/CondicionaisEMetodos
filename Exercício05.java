/*.

5 -

Implemente, utilizando funções, um programa que receba do usuário o valor
do salário bruto de um funcionário e imprima o valor com descontos de INSS,
FGTS e Plano de Saúde. O programa deve utilizar uma função para calcular
cada um dos descontos, sendo que estas funções devem receber o valor do
salário bruto e retornar o valor a ser descontado. Os valores descontados devem ser:

INSS: 10% do valor bruto; FGTS: 8%; Plano de Saúde: R$100,00.

....*/

import java.util.Scanner;

public class Exercício05 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = ler.nextLine();

        System.out.println("Digite seu salário bruto: ");
        double salarioBruto = ler.nextDouble();

        System.out.println("Informações importantes:");
        System.out.println("INSS: 10% do valor bruto.");
        System.out.println("FGTS: 8% do valor bruto. ");
        System.out.println("Plano de saúde: R$ 100,00 ");

        double inss = calcularInss(salarioBruto);
        double fgts = calcularFGTS(salarioBruto);
        double planoSaude = calcularPlanoDeSaude();

        double salarioLiquido = salarioBruto - inss - fgts - planoSaude;

        System.out.printf("\nSalário Bruto: R$%.2f", salarioBruto);
        System.out.println(" Salário Bruto: R$ " + salarioBruto);

        System.out.println(" =================================");
        System.out.println(" =================================");

        System.out.printf("\nDesconto INSS: R$%.2f", inss);
        System.out.println("  Desconto INSS: R$ " + inss);

        System.out.println(" =================================");
        System.out.println(" =================================");

        System.out.printf("\nDesconto FGTS: R$%.2f", fgts);
        System.out.println("  Desconto FGTS: R$  " + fgts);

        System.out.println(" =================================");
        System.out.println(" =================================");

        System.out.printf("\nDesconto Plano de Saúde: R$%.2f", planoSaude);
        System.out.println("  Desconto Plano de Saúde: R$   " + planoSaude);

        System.out.println(" =================================");
        System.out.println(" =================================");

        System.out.printf("\nSalário Líquido: R$%.2f", salarioLiquido);
        System.out.println("  Salário Líquido: R$  " + salarioLiquido);






    }

    public static double calcularInss(double salarioBruto) {

        double inss = salarioBruto * 0.1;
        return inss;

    }

    public static double calcularFGTS(double salarioBruto) {

        double fgts = salarioBruto * 0.08;

        return fgts;
    }


    public static double calcularPlanoDeSaude() {

        double planoDeSaude = 100.00;

        return planoDeSaude;
    }

}
