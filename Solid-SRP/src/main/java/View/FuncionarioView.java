package View;

import org.example.Model.Funcionario;
import org.example.Service.FuncionarioService;

public class FuncionarioView {

    // RESPONSABILIDADE 3: Apresentação (Formatação de Relatório)

        private FuncionarioService calculadora;

        public void RelatorioFuncionario(FuncionarioService calculadora) {
            this.calculadora = calculadora;
        }

    public void imprimirRelatorio(Funcionario funcionario) {
        // Lógica de formatação para impressão ou exportação
        System.out.println("--- Relatório de Funcionário ---");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário Base: R$ " + funcionario.getSalarioBase());
        System.out.println("Salário Líquido Calculado: R$ " + calculadora.calcularSalarioLiquido(funcionario));
        System.out.println("--------------------------------");
    }
}
