package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ListaTeste {

    @Mock
    private List<String> list;

    @Test
    void adicionarItemNaLista(){
        Mockito.when(list.get(0)).thenReturn("B");

        Assertions.assertEquals("B", list.get(0));
    }

    
}
