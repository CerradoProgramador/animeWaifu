package br.com.animeWaifu.model;

import br.com.animeWaifu.service.ConsultaChatGPT;
import com.fasterxml.jackson.annotation.JsonAlias;

public class Citacoes {
    private String citacao;
    private String anime;
    private String autor;

    public Citacoes(DadosCitar citacao) {
        this.citacao = ConsultaChatGPT.obterTraducao(citacao.citacao());
        this.anime = citacao.anime();
        this.autor = citacao.autor();
    }

    public String getCitacao() {
        return citacao;
    }

    public void setCitacao(String citacao) {
        this.citacao = citacao;
    }

    public String getAnime() {
        return anime;
    }

    public void setAnime(String anime) {
        this.anime = anime;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Frase: " + citacao + "\nAnime: " + anime + "\nPersonagem: " + autor;
    }
}
