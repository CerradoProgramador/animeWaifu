package br.com.animeWaifu.model.imagens.image;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosImage(
        @JsonAlias("large") String image) {


    @Override
    public String toString() {
        return "Foto | " + image;
    }
}
