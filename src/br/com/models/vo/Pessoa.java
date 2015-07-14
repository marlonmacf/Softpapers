package br.com.models.vo;
// Generated 24/06/2015 14:14:02 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Pessoa generated by hbm2java
 */
@Entity
@Table(name="pessoa"
    ,catalog="dbloja"
)
public class Pessoa  implements java.io.Serializable {


     private Long idPessoa;
     private String tipoPessoa;
     private Date criacaoPessoa;
     private Date atualizacaoPessoa;
     private Set<Funcionario> funcionarios = new HashSet<Funcionario>(0);
     private Set<Pessoajuridica> pessoajuridicas = new HashSet<Pessoajuridica>(0);
     private Set<Pessoafisica> pessoafisicas = new HashSet<Pessoafisica>(0);
     private Set<Fornecedor> fornecedors = new HashSet<Fornecedor>(0);
     private Set<Cliente> clientes = new HashSet<Cliente>(0);

    public Pessoa() {
    }

    public Pessoa(String tipoPessoa, Date criacaoPessoa, Date atualizacaoPessoa, Set<Funcionario> funcionarios, Set<Pessoajuridica> pessoajuridicas, Set<Pessoafisica> pessoafisicas, Set<Fornecedor> fornecedors, Set<Cliente> clientes) {
       this.tipoPessoa = tipoPessoa;
       this.criacaoPessoa = criacaoPessoa;
       this.atualizacaoPessoa = atualizacaoPessoa;
       this.funcionarios = funcionarios;
       this.pessoajuridicas = pessoajuridicas;
       this.pessoafisicas = pessoafisicas;
       this.fornecedors = fornecedors;
       this.clientes = clientes;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idPessoa", unique=true, nullable=false)
    public Long getIdPessoa() {
        return this.idPessoa;
    }
    
    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    
    @Column(name="tipoPessoa", length=20)
    public String getTipoPessoa() {
        return this.tipoPessoa;
    }
    
    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="criacaoPessoa", length=19)
    public Date getCriacaoPessoa() {
        return this.criacaoPessoa;
    }
    
    public void setCriacaoPessoa(Date criacaoPessoa) {
        this.criacaoPessoa = criacaoPessoa;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="atualizacaoPessoa", length=19)
    public Date getAtualizacaoPessoa() {
        return this.atualizacaoPessoa;
    }
    
    public void setAtualizacaoPessoa(Date atualizacaoPessoa) {
        this.atualizacaoPessoa = atualizacaoPessoa;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="pessoa")
    public Set<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }
    
    public void setFuncionarios(Set<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="pessoa")
    public Set<Pessoajuridica> getPessoajuridicas() {
        return this.pessoajuridicas;
    }
    
    public void setPessoajuridicas(Set<Pessoajuridica> pessoajuridicas) {
        this.pessoajuridicas = pessoajuridicas;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="pessoa")
    public Set<Pessoafisica> getPessoafisicas() {
        return this.pessoafisicas;
    }
    
    public void setPessoafisicas(Set<Pessoafisica> pessoafisicas) {
        this.pessoafisicas = pessoafisicas;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="pessoa")
    public Set<Fornecedor> getFornecedors() {
        return this.fornecedors;
    }
    
    public void setFornecedors(Set<Fornecedor> fornecedors) {
        this.fornecedors = fornecedors;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="pessoa")
    public Set<Cliente> getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }




}


