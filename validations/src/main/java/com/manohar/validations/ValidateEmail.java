package com.manohar.validations;

public class ValidateEmail {


    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";


    public Boolean validateEmail(String email)
    {
        if(email.matches(emailPattern))
        {
            return true;
        }
        else
        {
            return false;
        }

    }

}
