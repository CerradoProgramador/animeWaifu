package br.com.animeWaifu.model.imagens.media;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record MediaImagem(@JsonAlias("bannerIamge") String imagemBanner,
                          @JsonAlias("medium") String capaEpisodio) {


    @Override
    public String toString() {
        return "Imagem Do Banner do Ep: " + imagemBanner +
                "\nCapa do Ep: " + capaEpisodio;
    }
}
