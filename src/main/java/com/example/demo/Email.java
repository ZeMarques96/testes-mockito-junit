package com.example.demo;

public class Email {

    private String endereco;
    private String mensagem;
    private Formato formato;

    public Email(String endereco, String mensagem, Formato formatoHTML) {
        this.endereco = endereco;
        this.mensagem = mensagem;
        this.formato = formatoHTML;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formatoHTML) {
        this.formato = formatoHTML;
    }

    
}
