package com.example.demo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ApiDosCorreios api = new ApiDosCorreios();
        CadastrarPessoa cadastrarPessoa = new CadastrarPessoa(api);
        System.out.println();
        Pessoa p1 = cadastrarPessoa.cadastrarPessoa("jose", "6969", LocalDate.now(), "86170-000");
        
        System.out.println(p1.getEndereco().getUf());
        System.out.println(p1.getEndereco().getLogradouro());
        System.out.println(p1.getEndereco().getCidade());

    }
}
