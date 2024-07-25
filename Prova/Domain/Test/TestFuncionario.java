package Prova.Domain.Test;

import Prova.Domain.CalcularDescontos;

import java.util.Scanner;

public class TestFuncionario {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o salario do funcionario " + i + ": ");
            double salarioBruto = scanner.nextDouble();
            double salarioLiquidoTotal = 0;

            double salarioDescontoINSS = Desconto.descontoINSS(salarioBruto);
            double salarioDescontoIR = Desconto.descontoImpRenda(salarioBruto - salarioDescontoINSS);
            double salarioLiquido = salarioBruto - salarioDescontoIR;

            salarioLiquidoTotal += salarioLiquido;

            System.out.println("Salário bruto: R$ " + salarioBruto);
            System.out.println("Desconto INSS: R$ " + salarioDescontoINSS);
            System.out.println("Desconto IR: R$ " + salarioDescontoIR);
            System.out.println("Salário líquido: R$ " + salarioLiquido);

            if(i == 5) { System.out.println(" ## Salário liquido total: " + salarioLiquidoTotal); }
        }
    }
}
