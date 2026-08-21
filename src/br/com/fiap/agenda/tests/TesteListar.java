package br.com.fiap.agenda.tests;

import br.com.fiap.agenda.dao.ContatoDAO;
import br.com.fiap.agenda.models.Contato;

import java.util.ArrayList;
import java.util.List;

public class TesteListar {
    static void main() {
        Contato contato = new Contato();
        ContatoDAO dao = new ContatoDAO();
        List<Contato> contatos = new ArrayList<>();

        contatos = dao.Listar();
        System.out.println("agenda");
        System.out.println("bla bla bla");
        contatos.forEach(System.out::println);
    }
}
