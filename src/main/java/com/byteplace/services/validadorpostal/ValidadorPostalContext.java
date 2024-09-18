package com.byteplace.services.validadorpostal;

public class ValidadorPostalContext {
    ValidadorPostalStrategy validadorPostalStrategy;

    public void setStrategy(ValidadorPostalStrategy validadorPostalStrategy) {
        this.validadorPostalStrategy = validadorPostalStrategy;
    }

    public Endereco consultarCEP(String cep) {
        return this.validadorPostalStrategy.consultarCEP();
    }

}