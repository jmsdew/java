package main.java.com.ohgiraffers.login;

import java.util.Scanner;

public class LoginService {
    Scanner scr = new Scanner(System.in);
    LoginRegister loginRegister = new LoginRegister();
    LoginRepository loginRepository = new LoginRepository();
    public void makeId(){
        String[] login1 = new String[5];

        System.out.println("만드실 id를 입력해주세요");
        String a = scr.nextLine();
        System.out.println("만드실 id의 비밀번호를 입력해주세요");
        String b = scr.nextLine();
        System.out.println("이름를 입력해주세요");
        String c = scr.nextLine();

        login1[0] = a;
        login1[1] = b;
        login1[2] = c;

//        LoginRegister loginRegister = new LoginRegister();
        loginRegister.regist(login1);
//        LoginRepository loginRepository = new LoginRepository();
        loginRepository.regist(login1);
    }
    public void loginNumber(){

        System.out.println("ID를 입력 해주세요");
        String e = scr.nextLine();
        System.out.println("비밀번호를 입력 해주세요");
        String f = scr.nextLine();

        loginRepository.login(e,f);
    }
}
