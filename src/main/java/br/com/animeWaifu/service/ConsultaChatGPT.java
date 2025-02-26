package br.com.animeWaifu.service;


import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;



public class ConsultaChatGPT {
    public static String obterTraducao(String texto) {
                                                                     OpenAiService service = new OpenAiService("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");
        CompletionRequest requisicao = CompletionRequest.builder()
                .model("gpt-3.5-turbo-instruct")
                .prompt("traduza para o português o texto: " + texto)
                .maxTokens(50)
                .temperature(0.7)
                .build();

            var resposta = service.createCompletion(requisicao);
            return resposta.getChoices().get(0).getText();
    }
}
