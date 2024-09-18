package com.byteplace.services.validadorpostal;

public interface ViaCEPService implements ValidadorPostalStrategy {
    
    public Endereco consultarCEP(String cep) {
        // Realiza consulta do CEP pela URL do ViaCEP e retorna o endereço encontrado.
    }

}
