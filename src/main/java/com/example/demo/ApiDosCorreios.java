package com.example.demo;

public class ApiDosCorreios {

    public DadosLocalizacao buscarPorCEP(String cep){

        DadosLocalizacao dados = new DadosLocalizacao("PR", "Sertanópolis", cep, "Avenida 06 de Junho");
        return dados;
    }
}
