package br.com.fiap.agenda.dao;

import br.com.fiap.agenda.models.Contato;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Classe responsável pelo CRUD de contato
public class ContatoDAO {
    private Connection conexao;
    public void cadastrar(Contato contato){
        conexao = ConnectionFactory.obterConexao();
        PreparedStatement comandoSQL = null;
        try{
            String sql="insert into tbl_contato(ID_CONTATO, NOME_CONTATO, CELULAR_CONTATO,EMAIL_CONTATO, INSTAGRAM, TIPO)" +
                    "values(?,?,?,?,?,?)";
            comandoSQL = conexao.prepareStatement(sql);
            comandoSQL.setInt(1,contato.getId());
            comandoSQL.setString(2,contato.getNome());
            comandoSQL.setString(3,contato.getCelular());
            comandoSQL.setString(4,contato.getEmail());
            comandoSQL.setString(5,contato.getInstagram());
            comandoSQL.setString(6,contato.getTipo());
            comandoSQL.executeUpdate();
            comandoSQL.close();
            conexao.close();


        public Contato buscarPorId(int id){
            conexao = ConnectionFactory.obterConexao();
            PreparedStatement ps = null;
            Contato contato new Contato();
            try{
                ps = conexao.preparedStatement("select* fromTBL_CONTATO where ID_CONTATO");
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();

                 if (rs.next()){
                     contato.setId(rs.getInt(1);
                     contato.setNome(rs.getString(2));
                     contato.setCelular(rs.getString(3));
                     contato.setEmail(rs.getString(4));
                     contato.setInstagram(rs.getString(5));
                     contato.setTipo(rs.getString(6));
                 }
                 ps.close();

            }
        }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
