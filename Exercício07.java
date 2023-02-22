
/*..

7 - A empresa X resolveu dar um aumento de salário aos seus colaboradores
 e lhe contraram para desenvolver o programa que calculará os reajustes.

Faça um programa que recebe o salário de um colaborador e use a tabela
 abaixo para identificar o percentual de aumento baseado no salário atual:

salários até R$ 280,00 (incluindo) : aumento de 20%

salários entre R$ 280,00 e R$ 700,00 : aumento de 15%

salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%

salários de R$ 1500,00 em diante : aumento de 5%

Após o aumento ser realizado, informe na tela:
O salário antes do reajuste;

O percentual de aumento aplicado;

O valor do aumento;

O novo salário, após o aumento.
...*/

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercício07 {

    public static void main(String[] args) {

        Scanner ler = new Scanner (System.in);

        double salario, aumento, novoSalario;
        int percentualAumento;


        System.out.println("============================================");
        System.out.println("Calculo de aumento salarial da empresa XPTO: ");
        System.out.println("============================================");

        System.out.print(" Informe o salário do colaborador: R$ ");
        salario = ler.nextDouble();
        System.out.println(" ");

        // percentual de aumento baseado no salário informado.

        if(salario <= 280){
            percentualAumento = 20;
        } else if (salario <= 700) {
            percentualAumento = 15;
        } else if (salario <= 1500) {
            percentualAumento = 10;
        } else  {
            percentualAumento = 5;
        }

        aumento = salario * percentualAumento/100.0;
        novoSalario = salario + aumento;

        System.out.println(" Apenas para comparar, dados SEM a  formatação %.2f\n ");
        System.out.println(" Salário antes do reajuste: R$ " + salario);
        System.out.println(" Percentual de aumento aplicado: " + percentualAumento + " % ");
        System.out.println(" O valor do aumento: R$ " + aumento);
        System.out.println(" Novo salário após o aumento: R$ " + novoSalario);

        System.out.println("=============================================================");
        System.out.println("=============================================================");

        System.out.println(" Apenas para comparar, dados com a formação %.2f\n ");
        System.out.printf(" Salário antes do reajuste: R$ %.2f\n", salario);
        System.out.printf(" Percentual de aumento aplicado:  %d%%\n", percentualAumento);
        System.out.printf(" O valor do aumento: R$ %.2f\n", aumento);
        System.out.printf(" Novo salário após o aumento R$ %.2f\n", novoSalario );
    }


}
