package br.com.models.vo;
// Generated 19/06/2015 12:08:25 by Hibernate Tools 4.3.1


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

/**
 * Endereco generated by hbm2java
 */
@Entity
@Table(name="endereco"
    ,catalog="dbloja"
)
public class Endereco  implements java.io.Serializable {


     private Long idEndereco;
     private String enderecoEndereco;
     private String cepEndereco;
     private String complementoEndereco;
     private String numeroEndereco;
     private String cidadeEndereco;
     private String bairroEndereco;
     private String estadoEndereco;
     private Set<Cliente> clientes = new HashSet<Cliente>(0);
     private Set<Funcionario> funcionarios = new HashSet<Funcionario>(0);
     private Set<Fornecedor> fornecedors = new HashSet<Fornecedor>(0);

    public Endereco() {
    }

    public Endereco(String enderecoEndereco, String cepEndereco, String complementoEndereco, String numeroEndereco, String cidadeEndereco, String bairroEndereco, String estadoEndereco, Set<Cliente> clientes, Set<Funcionario> funcionarios, Set<Fornecedor> fornecedors) {
       this.enderecoEndereco = enderecoEndereco;
       this.cepEndereco = cepEndereco;
       this.complementoEndereco = complementoEndereco;
       this.numeroEndereco = numeroEndereco;
       this.cidadeEndereco = cidadeEndereco;
       this.bairroEndereco = bairroEndereco;
       this.estadoEndereco = estadoEndereco;
       this.clientes = clientes;
       this.funcionarios = funcionarios;
       this.fornecedors = fornecedors;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idEndereco", unique=true, nullable=false)
    public Long getIdEndereco() {
        return this.idEndereco;
    }
    
    public void setIdEndereco(Long idEndereco) {
        this.idEndereco = idEndereco;
    }

    
    @Column(name="enderecoEndereco", length=100)
    public String getEnderecoEndereco() {
        return this.enderecoEndereco;
    }
    
    public void setEnderecoEndereco(String enderecoEndereco) {
        this.enderecoEndereco = enderecoEndereco;
    }

    
    @Column(name="cepEndereco", length=10)
    public String getCepEndereco() {
        return this.cepEndereco;
    }
    
    public void setCepEndereco(String cepEndereco) {
        this.cepEndereco = cepEndereco;
    }

    
    @Column(name="complementoEndereco", length=20)
    public String getComplementoEndereco() {
        return this.complementoEndereco;
    }
    
    public void setComplementoEndereco(String complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }

    
    @Column(name="numeroEndereco", length=10)
    public String getNumeroEndereco() {
        return this.numeroEndereco;
    }
    
    public void setNumeroEndereco(String numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    
    @Column(name="cidadeEndereco", length=20)
    public String getCidadeEndereco() {
        return this.cidadeEndereco;
    }
    
    public void setCidadeEndereco(String cidadeEndereco) {
        this.cidadeEndereco = cidadeEndereco;
    }

    
    @Column(name="bairroEndereco", length=20)
    public String getBairroEndereco() {
        return this.bairroEndereco;
    }
    
    public void setBairroEndereco(String bairroEndereco) {
        this.bairroEndereco = bairroEndereco;
    }

    
    @Column(name="estadoEndereco", length=20)
    public String getEstadoEndereco() {
        return this.estadoEndereco;
    }
    
    public void setEstadoEndereco(String estadoEndereco) {
        this.estadoEndereco = estadoEndereco;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="endereco")
    public Set<Cliente> getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="endereco")
    public Set<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }
    
    public void setFuncionarios(Set<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="endereco")
    public Set<Fornecedor> getFornecedors() {
        return this.fornecedors;
    }
    
    public void setFornecedors(Set<Fornecedor> fornecedors) {
        this.fornecedors = fornecedors;
    }




}

