
/*

Faça um programa em java para o cálculo de uma folha de pagamento,

Sabendo que os descontos são do Imposto de Renda e do INNS (10%),
que depende do salário bruto (conforme tabela abaixo) e que o FGTS corresponde a
11% do Salário Bruto, mas não é descontado (é a empresa que deposita).

O Salário Líquido corresponde ao Salário Bruto menos os descontos.

O programa deverá pedir ao usuário o valor da sua hora e a quantidade de
horas trabalhadas no mês.

Desconto do IR:

Salário Bruto até 900 (inclusive) - isento;
Salário Bruto até 1500 (inclusive) - desconto de 5%;
Salário Bruto até 2500 (inclusive) - desconto de 10%;
Salário Bruto acima de 2500 - desconto de 20%

Imprima na tela as informações, dispostas conforme o exemplo abaixo.
No exemplo o valor da hora é 5 e a quantidade de hora é 220.

Salário Bruto: (5 * 220)        : R$ 1100,00
(-) IR (5%)                     : R$   55,00
(-) INSS ( 10%)                 : R$  110,00
FGTS (11%)                      : R$  121,00
Total de descontos              : R$  165,00
Salário Liquido                 : R$  935,00

*/

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercício08 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("============FOLHA DE PAGAMENTO ================");
        System.out.println("");

        System.out.print(" Informe o valor (R$) de sua hora de trabalho: R$");
        double valorHora = ler.nextDouble();

        System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
        int horasTrabalhadas = ler.nextInt();

        System.out.println(" Atenção colaborador, segue abaixo tabela " +
                "de acordo com seu salário para que saiba sua remuneração:       ");
        System.out.println("================TABELA===============================    ");
        System.out.println(" Salário Bruto até R$ 900 (inclusive) - isento;          ");
        System.out.println(" Salário Bruto até R$ 1500 (inclusive) - desconto de 5%; ");
        System.out.println(" Salário Bruto até R$ 2500 (inclusive) - desconto de 10%;");
        System.out.println(" Sa o lário Bruto acima deR$ 2500 - desconto de 20%;        ");
        System.out.println("=========================================================");

        double salarioBruto = valorHora * horasTrabalhadas;
        double inss = salarioBruto * 0.1; // é utilizado o valor decimal 0.1 para representar a alíquota de 10% do INSS.
        double fgts = salarioBruto * 0.11;

        double ir = 0;

        if (salarioBruto > 2500) {
            ir = salarioBruto * 0.2;
        } else if (salarioBruto > 1500) {
            ir = salarioBruto * 0.1;
        } else if (salarioBruto > 900) {
            ir = salarioBruto * 0.05;
        }

        double totalDescontos = inss + ir;
        double salarioLiquido = salarioBruto - totalDescontos;

        final double ALIQUOTA_INSS = 0.1;
        final double ALIQUOTA_FGTS = 0.11;



        String IR_PERCENTUAL = (ir == 0 ? "Isento" : String.format("%.0f%%", (ir / salarioBruto) * 100));

        String salarioBrutoMsg = String.format("Salário Bruto: (%.2f * %d)  : R$ %.2f", valorHora, horasTrabalhadas, salarioBruto);

        String irMsg = String.format("(-) IR (%s)                           : R$ %.2f", IR_PERCENTUAL, ir);

        String inssMsg = String.format("(-) INSS (%.0f%%)                   : R$ %.2f", ALIQUOTA_INSS * 100, inss);

        String fgtsMsg = String.format("FGTS (%.0f%%)                       : R$ %.2f", ALIQUOTA_FGTS * 100, fgts);

        String totalDescontosMsg = String.format("Total de descontos        : R$ %.2f", totalDescontos);

        String salarioLiquidoMsg = String.format("Salário Líquido           : R$ %.2f", salarioLiquido);

        System.out.println(salarioBrutoMsg);
        System.out.println(irMsg);
        System.out.println(inssMsg);
        System.out.println(fgtsMsg);
        System.out.println(totalDescontosMsg);
        System.out.println(salarioLiquidoMsg);


    }

}


/*..
ANOTAÇÕES DE ESTUDO PARA QUE EU POSSA COMPREENDER MELHOR O CÓDIGO AO VÊ-LO NO FUTURO E LEMBRAR O QUE EU FIZ:

Desenhando o código:  String IR_PERCENTUAL = (ir == 0 ? "Isento" : String.format("%.0f%%", (ir / salarioBruto) * 100));

Esse código cria uma string chamada IR_PERCENTUAL que representa a porcentagem de desconto do Imposto de Renda (IR) no salário bruto.

Ele utiliza um operador ternário para verificar se o valor do IR é igual a zero. Se for igual a zero, a string "Isento" é atribuída à variável IR_PERCENTUAL, indicando que não há desconto de IR no salário bruto. Se o valor do IR não for zero, a string é construída utilizando o método String.format() para formatar a porcentagem com uma casa decimal e o símbolo de percentagem (%). O valor da porcentagem é calculado dividindo o valor do IR pelo salário bruto e multiplicando por 100.

No final, a variável IR_PERCENTUAL é usada para exibir a porcentagem de desconto de IR no salário bruto, seja na forma de "Isento" ou na forma de uma porcentagem calculada.





explique o código:  String salarioBrutoMsg = String.format("Salário Bruto: (%.2f * %d)  : R$ %.2f", valorHora, horasTrabalhadas, salarioBruto);

Esse código cria uma string salarioBrutoMsg que contém uma mensagem formatada para exibir o valor do salário bruto.

O método String.format() é usado para criar a string formatada, que contém quatro placeholders que serão substituídos pelos valores correspondentes:

%.2f representa um número de ponto flutuante com duas casas decimais, que será substituído pelo valor da variável valorHora.
%d representa um número inteiro, que será substituído pelo valor da variável horasTrabalhadas.
%.2f representa outro número de ponto flutuante com duas casas decimais, que será substituído pelo valor da variável salarioBruto.
Os dois pontos e os espaços entre eles são apenas caracteres literais que serão exibidos na string.
Ao final, a string salarioBrutoMsg conterá a mensagem "Salário Bruto: (valorHora * horasTrabalhadas) : R$ salarioBruto", onde os valores de valorHora, horasTrabalhadas e salarioBruto serão substituídos pelos seus respectivos valores. Essa mensagem será usada para exibir o salário bruto no programa.









...*/




