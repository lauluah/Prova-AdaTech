# Prova do Coding Tank

## Descrição

Este programa recebe 5 salários brutos de funcionários e calcula o total do salário líquido para o mês, considerando os descontos de Imposto de Renda e INSS.

### Fórmula
Salário Líquido = Salário Bruto - Descontos

### Saída do Programa

Para cada salário, o programa exibe:

- Salário Bruto
- Valor descontado para o INSS
- Valor descontado para o Imposto de Renda
- Salário Líquido

Além disso, o programa exibe o total do salário líquido para o mês.

### Tabelas de Desconto

**Desconto INSS:**

| Salário                  | % Desconto INSS |
|--------------------------|-----------------|
| Até R$ 1.212,00          | 7,5%            |
| De R$ 1.212,01 até R$ 2.427,35 | 9%         |
| De R$ 2.427,36 até R$ 3.641,03 | 12%        |
| De R$ 3.641,04 até R$ 7.087,22 | 14%        |

**Desconto Imposto de Renda:**

| Salário                  | % Desconto Imposto de Renda |
|--------------------------|-----------------------------|
| Até R$ 1.903,98          | 0%                          |
| De R$ 1.903,99 até R$ 2.826,65 | 7,5%                    |
| De R$ 2.826,66 até R$ 3.751,05 | 15%                     |
| De R$ 3.751,06 até R$ 4.664,68 | 22,5%                   |
| Acima de R$ 4.664,68     | 27,5%                       |
