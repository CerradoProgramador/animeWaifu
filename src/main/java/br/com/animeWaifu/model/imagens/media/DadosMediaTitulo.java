package br.com.animeWaifu.model.imagens.media;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosMediaTitulo(@JsonAlias("romaji") String tituloOriginal,
                               @JsonAlias("english") String tituloEmIngles,
                               @JsonAlias("native") String tituloEmLinguaNativa,
                               @JsonAlias("userPreferred") String tituloPreferido) {

    @Override
    public String toString() {
        return "Titulo do Ep Original (Alfabeto Latino): " + tituloOriginal +
                "\nTitulo do Ep em Inglês: " + tituloEmIngles +
                "\nTitulo do Ep em Japonês: " + tituloEmLinguaNativa +
                "\nTitulo Preferido (Mais Votado): " + tituloPreferido;
    }
}
