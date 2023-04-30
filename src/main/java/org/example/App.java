package org.example;

import java.util.ResourceBundle;

/**
 * Hello world!
 *
 */
public class App {
    public boolean login_test(String uname, String pass) {
        ResourceBundle r = ResourceBundle.getBundle("config");
        String username = r.getString("uname");
        String password = r.getString("pass");
        if (username.equals(uname) && password.equals(pass))
        {
            return true;
        }
        else {
            return false;
        }
    }

}