package com.megasena.api;

import java.util.List;

public class Jogo {
    public Jogo(List<Integer> numeros) {
        this.numeros = numeros;
    }

    private List<Integer> numeros;

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }
}
