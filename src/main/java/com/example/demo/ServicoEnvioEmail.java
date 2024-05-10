package com.example.demo;

public class ServicoEnvioEmail {

    private PlataformaDeEnvio plataformaDeEnvio;

    void enviaEmail(String endereco, String mensagem, boolean formatoHtml){
        Email email = null;
        if (formatoHtml){
            email = new Email(endereco, mensagem, Formato.HTML);
        }
        else{
            email = new Email(endereco, mensagem, Formato.TEXTO);
        }
        
        plataformaDeEnvio.enviaEmail(email);
    }



}

