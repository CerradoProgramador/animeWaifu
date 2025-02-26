package br.com.animeWaifu.principal;

import br.com.animeWaifu.model.*;
import br.com.animeWaifu.model.imagens.DadosPersonagem;
import br.com.animeWaifu.service.ConsumoApi;
import br.com.animeWaifu.service.ConverteDados;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {
    ConsumoApi obterDados = new ConsumoApi();
    ConverteDados converteDados = new ConverteDados();
    private final String ENDERECO = "https://waifu.it/api/v4/";
    private Scanner entrada = new Scanner(System.in);
    List<DadosCitar> citacoes = new ArrayList<>();


    public void menu(){
        int opcao = -1;
        while(opcao != 0){
            var menuOpcoes =
                    """
                        Deseja fazer o que?
                        1. Transformar Texto Otaku
                        2. Emoções
                        3. Gerador de Senha
                        4. Citações Sobre Anime ou Personagem
                        5. Personagens Aleatorio!!
                            """;
            System.out.println(menuOpcoes);

            opcao = entrada.nextInt();
            entrada.nextLine();

            switch(opcao){
                case 1:
                    textWaifu();
                    break;
                case 2:
                    consumirEmocoes();
                    break;
                case 3:
                    gerarSenha();
                    break;
                case 4:
                    citacoes();
                    break;
                case 5:
                    getNamoradinhos();
                    break;
                default:
                    System.out.println("Digite algum numero do Menu");
                    break;
            }
        }



    }

    public void textWaifu() {
        var contador = 0;
        var opcao = -1;
        while (opcao != 0){
            if (contador == 1) {
                System.out.println("Para sair deste menu Digite 0 Na opção abaixo\n");
            }
            System.out.println("Você deseja transformar seu texto em tipo \n1. Lobinho? \n2. FofinhoCute \n3. FofoAmigavel");
            opcao = entrada.nextInt();
            entrada.nextLine();
            if (opcao == 1){
                System.out.println("Digite seu texto Lobinho Uuu");
                var texto = entrada.nextLine();
                String textoCodificado = URLEncoder.encode(texto, StandardCharsets.UTF_8);
                String endereco = "https://waifu.it/api/v4/uwuify?text=" + textoCodificado;

                var resposta = obterDados.obterDados(endereco);
                var json = converteDados.obterDados(resposta, DadosTexto.class);
                System.out.println(json);
                contador++;
            }
            else if (opcao == 2){
                System.out.println("Digite seu texto Fofinho Cutiiii");
                var texto = entrada.nextLine();
                String textoCodificado = URLEncoder.encode(texto, StandardCharsets.UTF_8);
                String endereco = "https://waifu.it/api/v4/uwuify?text=" + textoCodificado;

                var resposta = obterDados.obterDados(endereco);
                var json = converteDados.obterDados(resposta, DadosTexto.class);
                System.out.println(json);
                contador++;
            }
            else if (opcao == 3){
                System.out.println("Digite seu texto Fofo de Amiguu");
                var texto = entrada.nextLine();
                String textoCodificado = URLEncoder.encode(texto, StandardCharsets.UTF_8);
                String endereco = "https://waifu.it/api/v4/uwuify?text=" + textoCodificado;

                var resposta = obterDados.obterDados(endereco);
                var json = converteDados.obterDados(resposta, DadosTexto.class);
                System.out.println(json);
                contador++;
            }
            else if (opcao != 0){
                System.out.println("Digite algum numero do Texto");
                textWaifu();
            }
        }


    }

    public void consumirEmocoes(){
        System.out.println("Qual emoção você quer demostrar?");
        System.out.println("Você pode ver a Lista de Emoções(LISTA) ou não, Digite uma que vem na sua cabeça (Em Inglês)");

        var opcoes =
                """
                        Wink
                        Yes
                        Kick
                      
                        """;


        var opcao = entrada.nextLine();


        if (Emocoes.contemOpcao(opcao.toLowerCase())){
            var enderecoFinal = ENDERECO + opcao;

            var json = obterDados.obterDados(enderecoFinal);
            DadosEmocoes dados = converteDados.obterDados(json, DadosEmocoes.class);
            System.out.println(dados);
        }

        else if (opcao.toLowerCase().contains("list".trim())){
            System.out.println("Digite uma Destas emoções \n");
            for (Emocoes emocoes : Emocoes.values()){
                System.out.println(emocoes.getNome());
            }
        }
        else {
            System.out.println("Escolha uma opção de verdade");
        }
    }


    public void gerarSenha(){
        System.out.println("Digite o tamanho da sua senha! (Tem que ser maior que 12!.)");
        int tamanhoSenha = entrada.nextInt();
        entrada.nextLine();

        String enderecoFinal = ENDERECO + "password?charLength="  + tamanhoSenha;
        var resposta = obterDados.obterDados(enderecoFinal);
        DadosSenha senha = converteDados.obterDados(resposta, DadosSenha.class);
        System.out.println(senha);
    }





    public void citacoes(){
        var String = "https://waifu.it/api/v4/quote";
        var resposta = obterDados.obterDados(String);
        DadosCitar dadosCitar = converteDados.obterDados(resposta, DadosCitar.class);
        citacoes.add(dadosCitar);
        System.out.println("Você prefere em 1.Ingles ou 2.Portugês?");
        var opcao = entrada.nextInt();
        entrada.nextLine();
        if(opcao == 1){
            System.out.println("''" + dadosCitar.citacao() + "''");
            System.out.println("This is the Character's phrase, can you guess who it is?");
            System.out.println("Come on, time to guess, try to guess");
            var chute = entrada.nextLine();
            if(chute.equalsIgnoreCase(dadosCitar.autor())) {
                System.out.println("You got it right, congratulations. You received +10 coins");
            } else {
                System.out.println("You lost, and you also lost -10 Coins");
                System.out.println("noCap, whoever spoke is gone " + dadosCitar.autor() + " And the anime is: " + dadosCitar.anime());
            }
        } else if (opcao == 2) {
            List<Citacoes> citacao;
            citacao = citacoes.stream()
                    .map(c -> new Citacoes(c))
                    .collect(Collectors.toList());
            citacao.stream()
                    .forEach(c -> System.out.println("''" + c.getCitacao() + "''"));
            System.out.println("Esta é a frase do Personagem, consegue advinhar quem seja?");
            System.out.println("Vamos hora de chutar, tente adivinhar");
            var chute = entrada.nextLine();
            if(chute.equalsIgnoreCase(dadosCitar.autor())) {
                System.out.println("Você acertou, parabéns. Você recebeu +10 moedas");
            } else {
                System.out.println("Você perdeu e também perdeu -10 moedas");
                System.out.println("Na verdade quem disse isto foi: " + dadosCitar.autor() + " E o anime é o: " + dadosCitar.anime());
            }
        }
    }


    private void getNamoradinhos() {
        System.out.println("Você deseja ver 1.Homens ou 2.Mulheres?");
        var opcao = entrada.nextInt();
        entrada.nextLine();
        var resposta = "oi";
        DadosPersonagem personagem;
        switch (opcao) {
            case 1:
                resposta = obterDados.obterDados("https://waifu.it/api/v4/husbando");
                personagem = converteDados.obterDados(resposta, DadosPersonagem.class);
                System.out.println(personagem);
                break;
            case 2:
                resposta = obterDados.obterDados("https://waifu.it/api/v4/waifu");
                personagem = converteDados.obterDados(resposta, DadosPersonagem.class);
                System.out.println(personagem);
                break;
        }
    }


}
