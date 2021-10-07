package entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "vendedores")
public class Vendedores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private String cpf;
    private String nome;
    @OneToMany(mappedBy = "vendedores", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Enderecos> enderecos;

    public Vendedores() {
    }

    public Vendedores(int codigo, String cpf, String nome) {
        this.codigo = codigo;
        this.cpf = cpf;
        this.nome = nome;
    }

    public Vendedores(String cpf, String nome) {
        //this.codigo = codigo;
        this.cpf = cpf;
        this.nome = nome;
        //this.endereco = endereco;
    }

    public Vendedores(String cpf, String nome, List<Enderecos> enderecos) {
        this.cpf = cpf;
        this.nome = nome;
        this.enderecos = enderecos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Enderecos> getEndereco() {
        return enderecos;
    }

    public void setEndereco(List<Enderecos> enderecos) {
        this.enderecos = enderecos;
    }
}
