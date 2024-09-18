package com.byteplace.services.validadorpostal;

public interface ValidadorPostalStrategy {
    
    public Endereco consultarCEP(String cep);

}
