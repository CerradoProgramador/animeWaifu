package br.com.animeWaifu.model.imagens.media;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosNodes(
        @JsonAlias("coverImage") MediaImagem imagemCapa,
        @JsonAlias("title") DadosMediaTitulo titulo,
        @JsonAlias("synonyms") List<String> sinonimos,
        @JsonAlias("popularity") int popularidade,
        @JsonAlias("type") String tipo
) {

    @Override
    public String toString() {
        return "\n" + imagemCapa +
                "\n" + titulo +
                "\nTambém conhecido como: " + sinonimos +
                "\nVotos na Plataforma" + popularidade +
                "\nManga ou Anime? " + tipo;
    }
}
