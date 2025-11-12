package org.example.Service;

import org.example.Model.Funcionario;

public class FuncionarioService {

    // RESPONSABILIDADE 1: Cálculo de Regra de Negócio
    public double calcularSalarioLiquido(Funcionario funcionario) {
        // Lógica de negócio complexa:
        // 10% de imposto se o salário for acima de 5000, senão 5%.

        double salarioBase = funcionario.getSalarioBase();

        if (salarioBase > 5000.00) {
            return salarioBase * 0.90; // 10% de imposto
        } else {
            return salarioBase * 0.95; // 5% de imposto
        }
    }
}
