package br.com.animeWaifu.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosEmocoes(@JsonAlias("url") String url) {

    @Override
    public String toString() {
        return "YOUR EMOTION  \n" + url;
    }
}
