# CondicionaisEMetodos

<h1>Exercícios realizados:</h1>

1 - Faça um programa que leia 2 números inteiros, calcule e exiba a média aritmética e o produto dos números. O seu programa deve, obrigatoriamente, utilizar as seguintes funções feitas por você:

calculaMedia(): recebe 2 números inteiros como parâmetros e retorne a média dos números; calculaProduto(): recebe 2 números inteiros como parâmetros e retorna o produto dos números;

OBSERVAÇÃO:

Retornar o produto de um número significa calcular o resultado da multiplicação desse número por outro número. Em outras palavras, se você tiver um número x e outro número y, o produto de x e y seria x vezes y, ou seja, xy.

Por exemplo, se você quiser retornar o produto de 3 e 4, o resultado seria 12, pois 3 vezes 4 é igual a 12. Em notação matemática, isso seria escrito como 3 x 4 = 12.

===========================================================================================



2 - Faça um programa que calcule e imprima a média ponderada de um aluno. Inicialmente, o programa deverá ler o peso da primeira prova e o peso da segunda prova (ambos inteiros). A seguir, o programa deverá ler os seguintes dados do aluno: matrícula (inteiro), nota da primeira prova e nota da segunda prova (ambas reais). Por último, o programa deve mostrar a matricula do aluno seguida da sua média. O seu programa deve, obrigatoriamente, utilizar a seguinte função feita por você:

calculaMediaPonderada(): recebe 2 notas (reais) e seus respectivos pesos (inteiros) como parâmetros e retorna a média ponderada dos valores;

OBSERVAÇÃO:

Neste exercício aproveitei para mostrar a diferença dos métodos: <h2> input.nextLine()  e  Integer.parseInt() </h2>

Integer.parseInt(input.nextLine()) é uma expressão em Java que converte uma string que representa um número inteiro em um valor do tipo int.

Vamos entender essa expressão em partes:

input.nextLine() é um método da classe Scanner que lê uma linha de entrada do usuário a partir do teclado e a retorna como uma string.
Integer.parseInt() é um método da classe Integer que converte uma string que representa um número inteiro em um valor do tipo int.
Dessa forma, Integer.parseInt(input.nextLine()) realiza a leitura de uma linha de entrada do usuário e a converte em um valor do tipo int.

Essa expressão é comumente usada para fazer a leitura de valores inteiros digitados pelo usuário a partir do teclado

===========================================================================================

3 - Altere o programa do exercício 2 para que ele utilize a função calcula_produto do exercício 1 no cálculo da média ponderada;

===========================================================================================

4 - Altere o programa do exercício 3 para que ele processe os dados de 2 alunos ao invés de apenas 1;

===========================================================================================

5 - Implemente, utilizando funções, um programa que receba do usuário o valor do salário bruto de um funcionário e imprima o valor com descontos de INSS, FGTS e Plano de Saúde. O programa deve utilizar uma função para calcular cada um dos descontos, sendo que estas funções devem receber o valor do salário bruto e retornar o valor a ser descontado. Os valores descontados devem ser:

INSS: 10% do valor bruto; FGTS: 8%; Plano de Saúde: R$100,00.

===========================================================================================

6 - Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar: -> A mensagem "Aprovado", se a média alcançada for maior ou igual a sete; -> A mensagem "Reprovado", se a média for menor do que sete; -> A mensagem "Aprovado com Distinção", se a média for igual a dez.

===========================================================================================

7 - A empresa X resolveu dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes.

Faça um programa que recebe o salário de um colaborador e use a tabela abaixo para identificar o percentual de aumento baseado no salário atual:

salários até R$ 280,00 (incluindo) : aumento de 20%

salários entre R$ 280,00 e R$ 700,00 : aumento de 15%

salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%

salários de R$ 1500,00 em diante : aumento de 5%

Após o aumento ser realizado, informe na tela:
O salário antes do reajuste;

O percentual de aumento aplicado;

O valor do aumento;

O novo salário, após o aumento.

===========================================================================================

8 - Faça um programa para o cálculo de uma folha de pagamento,

Sabendo que os descontos são do Imposto de Renda e do INNS (10%), que depende do salário bruto (conforme tabela abaixo) e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita).

O Salário Líquido corresponde ao Salário Bruto menos os descontos.

O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.

Desconto do IR:

Salário Bruto até 900 (inclusive) - isento;

Salário Bruto até 1500 (inclusive) - desconto de 5%;

Salário Bruto até 2500 (inclusive) - desconto de 10%;

Salário Bruto acima de 2500 - desconto de 20% 

Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.


Salário Bruto: (5 * 220)        : R$ 1100,00

(-) IR (5%)                     : R$   55,00 

(-) INSS ( 10%)                 : R$  110,00

FGTS (11%)                      : R$  121,00

Total de descontos              : R$  165,00

Salário Liquido                 : R$  935,00

