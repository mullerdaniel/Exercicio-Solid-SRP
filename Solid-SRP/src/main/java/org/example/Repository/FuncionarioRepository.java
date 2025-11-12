package org.example.Repository;

import org.example.Model.Funcionario;

public class FuncionarioRepository {

    // RESPONSABILIDADE 2: Gestão de Dados (Persistência)
    public void salvarNoBancoDeDados(Funcionario funcionario) {

        String nome = funcionario.getNome();

        // Simula a lógica de conexão e escrita no banco
        System.out.println("Funcionario " + nome + " salvo no banco de dados.");
        // ... (código JDBC ou JPA aqui)
    }
}
