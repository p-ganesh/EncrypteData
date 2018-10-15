package com.company;

/**
 * Created by pg304 on 10/15/18.
 */
public class Encrypt {
    public String en = "";

    public Encrypt (String a) {
        for (int i = 0; i < a.length(); i++) {
            int j = 0;
            char x = a.charAt(j);
             en = en + x;
            j++;

        }
        System.out.println(en);
    }
}
