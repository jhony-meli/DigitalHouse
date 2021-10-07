package entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Vendedores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private String cpf;
    private String nome;
    @OneToMany(mappedBy = "vendedores", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Endereco> endereco;

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

    public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }
}
