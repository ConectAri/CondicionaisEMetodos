import java.util.Scanner;

public class Exercicio8B {


    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("============FOLHA DE PAGAMENTO ================");
        System.out.println("");

        System.out.print(" Informe o valor (R$) de sua hora de trabalho: R$ ");
        double valorHora = ler.nextDouble();

        System.out.print(" Informe a quantidade de horas trabalhadas no mês: ");
        int horasTrabalhadas = ler.nextInt();

        System.out.println(" Atenção colaborador, segue abaixo tabela " +
                "de acordo com seu salário para que saiba sua remuneração:       ");

        System.out.println("================TABELA===============================    ");
        System.out.println(" Salário Bruto até R$ 900 (inclusive) - isento;          ");
        System.out.println(" Salário Bruto até R$ 1500 (inclusive) - desconto de 5%; ");
        System.out.println(" Salário Bruto até R$ 2500 (inclusive) - desconto de 10%;");
        System.out.println(" Sa o lário Bruto acima deR$ 2500 - desconto de 20%;      ");
        System.out.println("=========================================================");

        double salarioBruto = valorHora * horasTrabalhadas;
        double inss = salarioBruto * 0.1;
        double fgts = salarioBruto * 0.11;
        double totalDescontos = inss;

        if (salarioBruto <= 900) {
            totalDescontos = 0;
        } else if (salarioBruto <= 1500) {
            totalDescontos += salarioBruto * 0.05;
        } else if (salarioBruto <= 2500) {
            totalDescontos += salarioBruto * 0.1;
        } else {
            totalDescontos += salarioBruto * 0.2;
        }

        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.printf("Salário Bruto: (%.2f * %d)         : R$ %.2f%n", valorHora, horasTrabalhadas, salarioBruto);
        System.out.printf("(-) IR                             : R$ %.2f%n", totalDescontos - inss);
        System.out.printf("(-) INSS ( 10%%)                   : R$ %.2f%n", inss);
        System.out.printf("FGTS (11%%)                        : R$ %.2f%n", fgts);
        System.out.printf("Total de descontos                 : R$ %.2f%n", totalDescontos);
        System.out.printf("Salário Liquido                    : R$ %.2f%n", salarioLiquido);

        ler.close();
    }
}


