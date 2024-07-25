package Prova.Domain;

public class CalcularDescontos {
    public static double descontoINSS(double salarioBruto) {
        double salarioComINSS = 0;

        if (salarioBruto <= 1212.00) {
            salarioComINSS = salarioBruto * 0.075;
        } else if (salarioBruto <= 2427.35) {
            salarioComINSS = salarioBruto * 0.09;
        } else if (salarioBruto <= 3641.03) {
            salarioComINSS = salarioBruto * 0.12;
        } else if (salarioBruto <= 7087.22) {
            salarioComINSS = salarioBruto * 0.14;
        } else {
            salarioComINSS = 7087.22 * 0.14;
        }
        return salarioComINSS;
    }

    public static double descontoImpRenda(double salarioBase) {
        double descontoImpRenda = 0;

        if (salarioBase <= 1903.98) {
            descontoImpRenda = 0;
        } else if (salarioBase <= 2826.65) {
            descontoImpRenda = salarioBase * 0.075;
        } else if (salarioBase <= 3751.05) {
            descontoImpRenda = salarioBase * 0.15;
        } else if (salarioBase <= 4664.68) {
            descontoImpRenda = salarioBase * 0.225;
        } else if (salarioBase >= 4664.68) {
            descontoImpRenda = salarioBase + 0.275;
        }

        return descontoImpRenda;
    }
}
