package com.company;

/**
 * Created by pg304 on 10/15/18.
 */
public class Encrypt {
    public String en;

    public Encrypting (String a) {
        for (int i = 0; i < a.length(); i++) {
            char x = a.charAt(i);
            en = en + x;
        }
        return en;
    }
}
