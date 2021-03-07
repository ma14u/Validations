package com.manohar.validations;

public class ValidateEmail {


   public static String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";


    public static Boolean validateEmail(String email)
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
