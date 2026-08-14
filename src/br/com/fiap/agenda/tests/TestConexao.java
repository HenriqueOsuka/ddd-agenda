package br.com.fiap.agenda.tests;

import br.com.fiap.agenda.dao.ConnectionFactory;

public class TestConexao {
    static void main() {
        System.out.println("Teste Teste");
        if(ConnectionFactory.obterConexao()==null){
            System.out.println("aqui deu errado");
        }
        else {
            System.out.println("graças a Deus, funcionou");
        }
    }
}
