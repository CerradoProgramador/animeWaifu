package br.com.animeWaifu.model.imagens;

import br.com.animeWaifu.model.imagens.Exceção.IdadeInvalidaException;
import br.com.animeWaifu.model.imagens.image.DadosImage;
import br.com.animeWaifu.model.imagens.media.DadosListMedia;
import br.com.animeWaifu.model.imagens.name.DadosNamePersonagem;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosPersonagem (@JsonAlias("name") DadosNamePersonagem nome,
                               @JsonAlias("image") DadosImage image,
                               @JsonAlias("gender") String genero,
                               @JsonAlias("siteUrl") String urlPerfil,
                               @JsonAlias("age") int idade,
                               @JsonAlias("favourites") int favoritos,
                               @JsonAlias("media") DadosListMedia media){



    @Override
    public String toString() {
        return  nome +
                "\nGênero: " + genero + "\n" +
                "Url do Perfil | " + urlPerfil +
                "\n" + image +
                 "\n" +  media;

    }
}
