package br.itau.spring02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // diz que esta classe vai ser armazenada no BD
@Table(name = "tb_produto")

public class Produto {

    @Id // chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 1, 2, 3, 4...
    @Column(name = "cod")
    private long codigo;

    @Column(name = "nome", length = 200, nullable = false)
    private String nome;

    @Column(name = "valor")
    private double valor;

    @ManyToOne
    @JoinColumn(name = "cod_fornecedor")
    @JsonIgnoreProperties("produtos")// não quero a lista de produtos do fornecedor
    private Fornecedor fornecedor;

    public long getCodigo() {
        return codigo;
    }
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public Fornecedor getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

}
