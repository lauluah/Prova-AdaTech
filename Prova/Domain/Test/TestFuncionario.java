package Prova.Domain.Test;

import Prova.Domain.CalcularDescontos;

import java.util.Scanner;

public class TestFuncionario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o salário bruto do funcionário " + i + " =" );
            double salarioSemDesconto = scanner.nextDouble();

            double descontoINSS = CalcularDescontos.descontoDeInss(salarioSemDesconto);
            double salarioBaseComImpRenda = salarioSemDesconto - descontoINSS;
            double descontoImpRenda = CalcularDescontos.descontoImpRenda(salarioBaseComImpRenda);
            double salarioLiquido = salarioBaseComImpRenda - descontoImpRenda;

            System.out.println("Salário bruto: R$ " + salarioSemDesconto);
            System.out.println("Desconto INSS: R$ " + descontoINSS);
            System.out.println("Desconto IR: R$ " + descontoImpRenda);
            System.out.println("Salário líquido: R$ " + salarioLiquido);

        }

        scanner.close();
    }
}
