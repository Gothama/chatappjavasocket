package com.company.encryptionAlgo;

public class Encrypt {
    public String encrypt(String message){
        char[] chars = message.toCharArray();
        String result = "";
        for(char c: chars){
            c+=6;
            result += c;
        }
        return result;
    }

    public String decrypt(String message){
        char[] chars = message.toCharArray();
        String result = "";
        for(char c: chars){
            c-=6;
            result += c;
        }
        return result;
    }
}
