package com.megasena.api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Service
public class JogoService {
    public List<Jogo> novoJogo(int quantidadeJogos, int quantidadeNumeros) {
        Random random = new Random();
        List<Jogo> jogos = new ArrayList<>();

        for (int i = 0; i < quantidadeJogos; i++) {
            List<Integer> numeros = new ArrayList<>();
            while (numeros.size() < quantidadeNumeros) {
                int numeroAleatorio = random.nextInt(60) + 1;
                if (!numeros.contains(numeroAleatorio)) {
                    numeros.add(numeroAleatorio);
                }
            }

            Collections.sort(numeros);
            Jogo jogo = new Jogo(numeros);
            jogos.add(jogo);
        }

        return jogos;
    }
}
