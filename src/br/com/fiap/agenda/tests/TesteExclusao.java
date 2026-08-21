package br.com.fiap.agenda.tests;

import br.com.fiap.agenda.dao.ContatoDAO;
import br.com.fiap.agenda.models.Contato;

public class TesteExclusao {
    static void main() {
        ContatoDAO dao = new ContatoDAO();
        Contato  contato = new Contato();

        dao.excluir(contato.getId());
        System.out.println("Registro excluido!");
    }
}
