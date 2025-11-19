package org.example;

import View.FuncionarioView;
import model.Funcionario;
import org.example.Repository.FuncionarioRepository;
import org.example.Service.FuncionarioService;


class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Daniel", 10000.00, "Desenvolvedor");

        FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
        FuncionarioView funcionarioView = new FuncionarioView();
        FuncionarioService funcionarioService = new FuncionarioService();

        funcionarioRepository.salvarNoBancoDeDados(funcionario);
        funcionarioView.imprimir(funcionario, funcionarioService);
    }
}
