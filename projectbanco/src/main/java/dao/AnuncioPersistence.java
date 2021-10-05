package dao;

import entity.Anuncio;
import util.BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AnuncioPersistence {

    private Connection cnx;

    public AnuncioPersistence() {
        try {
            cnx = BancoDeDados.getConection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Anuncio get(String titulo) {
        try {
            PreparedStatement ps = cnx.prepareStatement("select * from anuncios where titulo = ?");
            ps.setString(1, titulo);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                return new Anuncio(rs.getString(2), rs.getInt(3), rs.getBigDecimal(4), rs.getDate(5), rs.getInt(6));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void atualiza(Anuncio anuncioExistente) {
    }

    public void insere(Anuncio anuncio) {

        try {
            Connection cnx = BancoDeDados.getConection();
            PreparedStatement ps = cnx.prepareStatement("insert into anuncios (titulo, codigo_vendedor, preco, data_anuncio, num_vendas)"
                    + " values (?,?,?,?,?)");
            ps.setString(1, anuncio.getTitulo());
            ps.setInt(2, anuncio.getCodigo_vendedor());
            ps.setBigDecimal(3, anuncio.getPreco());
            ps.setDate(4, anuncio.getData_anuncio());
            ps.setInt(5, anuncio.getNum_vendas());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
