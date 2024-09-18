package com.byteplace.services.user;

public abstract class UserServiceTemplateMethod {

    public boolean authenticate(String path, String email, String senha) {        
        boolean isValidCrosspath = validateCrosspath(path);
        boolean isValidEmail     = validateEmail(email);
        boolean isValidPassword  = validatePassword(senha);

        return isValidCrosspath &
               isValidEmail &
               isValidPassword;
    
    }

    public abstract boolean validateEmail(String email);

    public abstract boolean validatePassword(String password);

    public abstract boolean validateCrosspath(String path);

}
