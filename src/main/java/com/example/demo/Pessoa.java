package com.example.demo;

import java.time.LocalDate;

public class Pessoa {

    private String name;

    private String documento;

    private LocalDate nascimento;

    private DadosLocalizacao endereco;

    public Pessoa(String name, String documento, LocalDate nascimento) {
        this.name = name;
        this.documento = documento;
        this.nascimento = nascimento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public DadosLocalizacao getEndereco() {
        return endereco;
    }

    public void setEndereco(DadosLocalizacao endereco) {
        this.endereco = endereco;
    }



    

}
