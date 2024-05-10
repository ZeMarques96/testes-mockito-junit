package com.example.demo;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTest {

    @Mock
    private ApiDosCorreios api;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDados(){

        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("MG", "Patos de Minas","999999", "Rua 2");
        Mockito.when(api.buscarPorCEP("86170-000")).thenReturn(dadosLocalizacao);
        Pessoa p1 = cadastrarPessoa.cadastrarPessoa("José Chico", "6969", LocalDate.now(), "86170-000");

        Assertions.assertEquals("José Chico", p1.getName());
        Assertions.assertEquals("6969", p1.getDocumento());
        Assertions.assertEquals("MG", p1.getEndereco().getUf());
        Assertions.assertEquals("Patos de Minas", p1.getEndereco().getCidade());
    }
}
