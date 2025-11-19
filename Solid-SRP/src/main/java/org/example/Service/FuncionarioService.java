package org.example.Service;

import model.Funcionario;

public class FuncionarioService {

    public double calcularSalarioLiquido(Funcionario funcionario) {
        // Lógica de negócio complexa:
        // 10% de imposto se o salário for acima de 5000, senão 5%
        double salarioBase = funcionario.getSalarioBase();

        if (salarioBase > 5000.00) {
            return salarioBase * 0.90; // 10% de imposto
        } else {
            return salarioBase * 0.95; // 5% de imposto
        }
    }
}