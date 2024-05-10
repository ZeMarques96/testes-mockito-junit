package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EnviarMensagemTest {

    @Spy
    private EnviarMensagem enviarMensagem;

    @Test
    void verificarComportamentoDaClasse(){
        Mockito.verifyNoMoreInteractions(enviarMensagem);

        Mensagem msg = new Mensagem("Hello World");
        enviarMensagem.adicionarMensagem(msg);

        Mockito.verify(enviarMensagem).adicionarMensagem(msg);

        Assertions.assertFalse(enviarMensagem.getMensagens().isEmpty());
    }
}
