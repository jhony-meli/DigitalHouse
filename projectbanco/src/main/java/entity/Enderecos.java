package entity;

import javax.persistence.*;

@Entity
@Table(name = "enderecos")
public class Enderecos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "vendedores_codigo")
    private Vendedores vendedores;
    private String cep;
    private String logradouro;
    private String complemento;
    private int numero;
    private String uf;
    private String cidade;

    public Enderecos() {

    }

//    public Endereco(Long id, String cep, String logradouro, String complemento, int numero, String uf, String cidade, Vendedores vendedores) {
//        super();
//        this.id = id;
//        this.cep = cep;
//        this.logradouro = logradouro;
//        this.complemento = complemento;
//        this.numero = numero;
//        this.uf = uf;
//        this.cidade = cidade;
//        this.vendedores = vendedores;
//    }

    public Enderecos(String cep, String logradouro, String complemento, int numero, String uf, String cidade, Vendedores vendedores) {
        super();
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.numero = numero;
        this.uf = uf;
        this.cidade = cidade;
        this.vendedores = vendedores;
    }

    public Enderecos(String cep, String logradouro, String complemento, int numero, String uf, String cidade) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.numero = numero;
        this.uf = uf;
        this.cidade = cidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public Vendedores getVendedor() {
        return vendedores;
    }
    public void setVendedor(Vendedores vendedores) {
        this.vendedores = vendedores;
    }
}
