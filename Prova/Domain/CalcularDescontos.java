package Prova.Domain;

public class CalcularDescontos {

    public static double descontoDeInss(double salarioBruto) {
        double descontoINSS = 0;

        if (salarioBruto <= 1212.00) {
            descontoINSS = salarioBruto * 0.075;
        } else if (salarioBruto <= 2427.35) {
            descontoINSS = (1212.00 * 0.075) + ((salarioBruto - 1212.00) * 0.09);
        } else if (salarioBruto <= 3641.03) {
            descontoINSS = (1212.00 * 0.075) + ((2427.35 - 1212.00) * 0.09) + ((salarioBruto - 2427.35) * 0.12);
        } else if (salarioBruto <= 7087.22) {
            descontoINSS = (1212.00 * 0.075) + ((2427.35 - 1212.00) * 0.09) + ((3641.03 - 2427.35) * 0.12) + ((salarioBruto - 3641.03) * 0.14);
        } else {
            descontoINSS = (1212.00 * 0.075) + ((2427.35 - 1212.00) * 0.09) + ((3641.03 - 2427.35) * 0.12) + ((7087.22 - 3641.03) * 0.14);
        }

        return descontoINSS;
    }

    public static double descontoImpRenda(double salarioBase) {
        double descontoImpRenda = 0;

        if (salarioBase <= 1903.98) {
            descontoImpRenda = 0;
        } else if (salarioBase <= 2826.65) {
            descontoImpRenda = (salarioBase - 1903.98) * 0.075;
        } else if (salarioBase <= 3751.05) {
            descontoImpRenda = (2826.65 - 1903.98) * 0.075 + (salarioBase - 2826.65) * 0.15;
        } else if (salarioBase <= 4664.68) {
            descontoImpRenda = (2826.65 - 1903.98) * 0.075 + (3751.05 - 2826.65) * 0.15 + (salarioBase - 3751.05) * 0.225;
        } else {
            descontoImpRenda = (2826.65 - 1903.98) * 0.075 + (3751.05 - 2826.65) * 0.15 + (4664.68 - 3751.05) * 0.225 + (salarioBase - 4664.68) * 0.275;
        }

        return descontoImpRenda;
    }
}
