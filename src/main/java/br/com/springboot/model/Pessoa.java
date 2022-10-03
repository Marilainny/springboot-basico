package br.com.springboot.model;
/**
 * Model é a ponte entre as camadas Visão (View) e Controle (Controller),
 * consiste na parte lógica da aplicação
 */
import java.math.BigDecimal;
import java.util.List;

public class Pessoa {

    private String nome;
    private Integer idade;
    private BigDecimal altura;
    private List<Telefone> telefone; //Usando uma lista de telefone
    private List<Endereco> endereco; //Usando uma lista de endereço


    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    public void setAltura(BigDecimal altura) {
        this.altura = altura;
    }

    public List<Telefone> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<Telefone> telefone) {
        this.telefone = telefone;
    }

    public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                ", telefone=" + telefone +
                ", endereco=" + endereco +
                '}';
    }
}
