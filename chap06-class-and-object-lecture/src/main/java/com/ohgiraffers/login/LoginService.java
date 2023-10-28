package main.java.com.ohgiraffers.login;

import java.util.Scanner;

public class LoginService {
    Scanner scr = new Scanner(System.in);
    public void loginNumber(){
        Login[] login1 = new Login[5];

        System.out.println("만드실 id를 입력해주세요");
        String a = scr.nextLine();
        System.out.println("만드실 id의 비밀번호를 입력해주세요");
        String b = scr.nextLine();
        System.out.println("이름를 입력해주세요");
        String c = scr.nextLine();

        login1[0] = new Login(a,b,c);

        LoginRegister loginRegister = new LoginRegister();
        loginRegister.regist(login1);
        LoginRepository loginRepository = new LoginRepository();
        loginRepository.regist(login1);
    }
    public void makeId(){

    }
}
