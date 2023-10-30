package main.java.com.ohgiraffers.login;

public class People {

    private String name;
    private String number;


    public People(String name, String number){
        this.name = name;
        this.number = number;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }





    public void login(){
        System.out.println(name + " 님 로그인 되었습니다.");
    }
}
