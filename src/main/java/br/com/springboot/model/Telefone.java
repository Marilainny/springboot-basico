package br.com.springboot.model;

public class Telefone {

    private String tipoTelefone;
    private String telefone;
    private Pessoa pessoa; //relacionamento Telefone com Pessoa


    public Telefone(String tipoTelefone, String telefone) {
        this.tipoTelefone = tipoTelefone;
        this.telefone = telefone;
    }

    public String getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(String tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "tipoTelefone='" + tipoTelefone + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
