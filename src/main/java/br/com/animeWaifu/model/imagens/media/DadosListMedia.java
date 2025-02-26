package br.com.animeWaifu.model.imagens.media;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosListMedia(@JsonAlias("nodes") List<DadosNodes> midias) {

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\nO Personagem Apareceu Nestes Banners");
        for (DadosNodes media : midias) {
            sb.append(media).append("\n");  // Adiciona as informações de cada mídia
        }
        return sb.toString();
    }
}
