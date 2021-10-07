package entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
//@Table(name = "anuncios")
public class Anuncios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private String titulo;
    private int codigo_vendedor;
    private BigDecimal preco;
    private Date data_anuncio;
    private int num_vendas;

    public Anuncios() {
    }

    public Anuncios(String titulo, int codigo_vendedor, BigDecimal preco, java.sql.Date data_anuncio, int num_vendas) {
        this.titulo = titulo;
        this.codigo_vendedor = codigo_vendedor;
        this.preco = preco;
        this.data_anuncio = data_anuncio;
        this.num_vendas = num_vendas;
    }

    public Anuncios(int codigo, String titulo, int codigo_vendedor, BigDecimal preco, Date data_anuncio, int num_vendas) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.codigo_vendedor = codigo_vendedor;
        this.preco = preco;
        this.data_anuncio = data_anuncio;
        this.num_vendas = num_vendas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Date getData_anuncio() {
        return data_anuncio;
    }

    public void setData_anuncio(Date data_anuncio) {
        this.data_anuncio = data_anuncio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo_vendedor() {
        return codigo_vendedor;
    }

    public void setCodigo_vendedor(int codigo_vendedor) {
        this.codigo_vendedor = codigo_vendedor;
    }



    public int getNum_vendas() {
        return num_vendas;
    }

    public void setNum_vendas(int num_vendas) {
        this.num_vendas = num_vendas;
    }
}
