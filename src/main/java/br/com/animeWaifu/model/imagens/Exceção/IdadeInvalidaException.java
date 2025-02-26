package br.com.animeWaifu.model.imagens.Exceção;

public class IdadeInvalidaException extends RuntimeException {
  private String msg;



    public IdadeInvalidaException(String message) {
        super(message);
    }
}
