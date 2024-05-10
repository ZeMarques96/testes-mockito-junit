package com.example.demo;

import java.time.LocalDate;

public class CadastrarPessoa {

    private ApiDosCorreios apiDosCorreios;

    public CadastrarPessoa(ApiDosCorreios apiDosCorreios){
        this.apiDosCorreios = apiDosCorreios;
    }

    public Pessoa cadastrarPessoa(String nome, String documento, LocalDate nascimento, String cep){
        Pessoa pessoa = new Pessoa(nome , documento , nascimento);
        DadosLocalizacao local = apiDosCorreios.buscarPorCEP(cep);
        pessoa.setEndereco(local);
        return pessoa;
    }
}
