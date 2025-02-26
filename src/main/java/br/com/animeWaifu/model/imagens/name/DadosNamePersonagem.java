package br.com.animeWaifu.model.imagens.name;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosNamePersonagem(
        @JsonAlias("first") String primeiroNome,
        @JsonAlias("userPreferred") String nomePreferido,
        @JsonAlias("alternative") List<String> nomesAlternativos

) {

    public DadosNamePersonagem {
        nomesAlternativos = (nomesAlternativos == null || nomesAlternativos.isEmpty()) ? List.of("Sem Dados Para Nomes Alternativos") : nomesAlternativos;
    }

    @Override
    public String toString() {
        return  "Primeiro Nome: " + primeiroNome +
                "| Nome Preferido: " + nomePreferido +
                "| Nomes Alternativo: " + nomesAlternativos;

    }
}
