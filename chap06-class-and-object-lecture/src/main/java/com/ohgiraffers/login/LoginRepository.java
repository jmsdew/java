package main.java.com.ohgiraffers.login;

import java.util.Arrays;

public class LoginRepository {

    private final static String[] logins;
    private static int count;

    static{
        logins = new String[10];
    }

    public void regist(){

    }
    public void regist(String[] login){
        logins[0] = login[0];
        logins[1] = login[1];
        logins[2] = login[2];
        count++;
    }

    public void login(String a, String b){

    }







}
