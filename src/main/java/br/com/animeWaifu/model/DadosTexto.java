package br.com.animeWaifu.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosTexto(@JsonAlias("text") String texto) {

    @Override
    public String toString() {
        return "Ou melhor assim\n" + texto;
    }
}
