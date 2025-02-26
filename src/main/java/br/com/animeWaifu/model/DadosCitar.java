package br.com.animeWaifu.model;

import br.com.animeWaifu.service.ConsultaChatGPT;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record DadosCitar(@JsonAlias("quote") String citacao,
                         @JsonAlias("anime") String anime,
                         @JsonAlias("author") String autor) {

    @Override
    public String toString() {
        return "Citação: " + citacao + "\nAnime: " + anime + "\nAutor: " + autor;
    }
}
