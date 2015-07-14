package br.com.models.vo;
// Generated 25/06/2015 16:48:08 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Fornecedor generated by hbm2java
 */
@Entity
@Table(name="fornecedor"
    ,catalog="dbloja"
)
public class Fornecedor  implements java.io.Serializable {


     private Long idFornecedor;
     private Contato contato;
     private Endereco endereco;
     private Pessoa pessoa;
     private String nomeFornecedor;
     private Date criacaoFornecedor;
     private Date atualizacaoFornecedor;
     private Set<Compra> compras = new HashSet<Compra>(0);
     private Set<Produto> produtos = new HashSet<Produto>(0);

    public Fornecedor() {
    }

    public Fornecedor(Contato contato, Endereco endereco, Pessoa pessoa, String nomeFornecedor, Date criacaoFornecedor, Date atualizacaoFornecedor, Set<Compra> compras, Set<Produto> produtos) {
       this.contato = contato;
       this.endereco = endereco;
       this.pessoa = pessoa;
       this.nomeFornecedor = nomeFornecedor;
       this.criacaoFornecedor = criacaoFornecedor;
       this.atualizacaoFornecedor = atualizacaoFornecedor;
       this.compras = compras;
       this.produtos = produtos;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idFornecedor", unique=true, nullable=false)
    public Long getIdFornecedor() {
        return this.idFornecedor;
    }
    
    public void setIdFornecedor(Long idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="contatoFornecedor")
    public Contato getContato() {
        return this.contato;
    }
    
    public void setContato(Contato contato) {
        this.contato = contato;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="enderecoFornecedor")
    public Endereco getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="pessoaFornecedor")
    public Pessoa getPessoa() {
        return this.pessoa;
    }
    
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    
    @Column(name="nomeFornecedor", length=50)
    public String getNomeFornecedor() {
        return this.nomeFornecedor;
    }
    
    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="criacaoFornecedor", length=19)
    public Date getCriacaoFornecedor() {
        return this.criacaoFornecedor;
    }
    
    public void setCriacaoFornecedor(Date criacaoFornecedor) {
        this.criacaoFornecedor = criacaoFornecedor;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="atualizacaoFornecedor", length=19)
    public Date getAtualizacaoFornecedor() {
        return this.atualizacaoFornecedor;
    }
    
    public void setAtualizacaoFornecedor(Date atualizacaoFornecedor) {
        this.atualizacaoFornecedor = atualizacaoFornecedor;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="fornecedor")
    public Set<Compra> getCompras() {
        return this.compras;
    }
    
    public void setCompras(Set<Compra> compras) {
        this.compras = compras;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="fornecedor")
    public Set<Produto> getProdutos() {
        return this.produtos;
    }
    
    public void setProdutos(Set<Produto> produtos) {
        this.produtos = produtos;
    }




}


