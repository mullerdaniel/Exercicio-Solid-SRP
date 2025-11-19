package View;

import model.Funcionario;
import org.example.Service.FuncionarioService;

public class FuncionarioView {

    public void imprimir(Funcionario funcionario, FuncionarioService funcionarioService) {

        double salarioLiquido =  funcionarioService.calcularSalarioLiquido(funcionario);


        System.out.println("--- Relatório de Funcionário ---");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salário Base: R$ " + funcionario.getSalarioBase());
        System.out.println("Salário Líquido: R$ " + salarioLiquido);
        System.out.println("--------------------------------");
    }

}