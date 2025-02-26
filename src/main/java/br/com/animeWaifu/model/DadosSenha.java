package br.com.animeWaifu.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosSenha(@JsonAlias("pass") String senha) {

    @Override
    public String toString() {
        return "Sua Senha é: " + senha + "\nSalvando sua senha no nosso banco de dados... rs" ;
    }
}
