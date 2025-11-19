package org.example.Repository;

import model.Funcionario;

public class FuncionarioRepository {
    public void salvarNoBancoDeDados(Funcionario funcionario) {
        // Simula a lógica de conexão e escrita no banco
        System.out.println("Funcionario " + funcionario.getNome() + " salvo no banco de dados.");
        // ... (código JDBC ou JPA aqui)
    }
}