package com.byteplace.services.user;

import com.byteplace.services.validadorpostal.Endereco;

public class CompradorService extends UserService {

    private static CompradorService instance;

    private CompradorService () {}

    public void cadastrarEndereco(Endereco endereco, boolean isEntrega, int idUsuario) {
        // Cadastra o endereço do usuário e valida se está correto
    }

    public void editarEndereco(Endereco endereco, boolean isEntrega, int idUsuario) {
        // Edita o endereço do usuário e valida se está correto
    }

    public void deletarEndereco(Endereco endereco, boolean isEntrega, int idUsuario) {
        // Deleta o endereço do usuário e valida se está correto
    }

    public void buscarEndereco(Endereco endereco, boolean isEntrega, int idUsuario) {
        // Busca o endereço do usuário e valida se está correto
    }

    public static CompradorService getInstance(){

            if(instance == null){

                instance = new CompradorService();
                
            }

            return instance;

    }

}
