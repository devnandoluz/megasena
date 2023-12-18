package com.megasena.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jogos")
public class JogoController {
    public JogoController(JogoService service) {
        this.service = service;
    }

    private final JogoService service;

    @GetMapping
    public ResponseEntity<List<Jogo>> novoJogo(@RequestParam(defaultValue = "1") int quantidadeJogos,
                                               @RequestParam(defaultValue = "6") int quantidadeNumeros) {
        if (quantidadeNumeros < 6 || quantidadeNumeros > 20) {
            return ResponseEntity.badRequest().build();
        }

        List<Jogo> jogos = service.novoJogo(quantidadeJogos, quantidadeNumeros);

        return ResponseEntity.ok(jogos);
    }
}
