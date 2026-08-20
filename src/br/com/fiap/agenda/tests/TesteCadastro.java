package br.com.fiap.agenda.tests;

import br.com.fiap.agenda.dao.ContatoDAO;
import br.com.fiap.agenda.models.Contato;

import java.util.Scanner;

public class TesteCadastro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitornum = new Scanner(System.in);

        Contato contato = new Contato();
        ContatoDAO dao = new ContatoDAO();
        System.out.println("Digite o códido do contato");
        contato.setId(leitornum.nextInt());
        System.out.println("Digite o nome do contato");
        contato.setNome(leitor.nextLine());
        System.out.println("Digite o celular do contato");
        contato.setCelular(leitor.nextLine());
        System.out.println("Digite o email do contato");
        contato.setEmail(leitor.nextLine());
        System.out.println("Digite o instagram");
        contato.setInstagram(leitor.nextLine());
        System.out.println("tipo do contato");
        contato.setTipo(leitornum.nextLine());

        dao.cadastrar(contato);
        System.out.println("Contato foi adicionado com sucesso");


    }
}
