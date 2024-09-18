package com.byteplace.services.user;

import com.byteplace.services.user.UserService;

public class VendedorService extends UserService {

    private static VendedorService instance;

    private VendedorService() {}

    public static VendedorService getInstance() {
        if (instance == null) {
            return new VendedorService();
        }

        return instance;
    }

    @Override
    public boolean validateEmail(String email) {
        super.validateEmail(email);
        // Valida se o domínio de e-mail do vendedor é corporativo.
        // Ex: aceita "@loja-de-computador.com" mas rejeita "@gmail.com".
    }

}
