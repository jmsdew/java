package main.java.com.ohgiraffers.program;

public class People {

    private String name;
    private String number;

    private String answer;
    public People(String name, String number, String answer){
        this.name = name;
        this.number = number;
        this.answer=answer;

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

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void phoneNum(){
        System.out.println(name + " 님의 회원번호는 " + number + " 번 입니다." + " 본 클래스 가입 목적은 " + answer + " 입니다.");
    }
}
