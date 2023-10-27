package main.java.com.ogiraffers.section02.uses;

public class Member {

    private int num;
    private String id;
    private String pwd;
    private String name;
    private int age;
    private char gender;

    public Member(){

    }
    Member(int num, String id, String pwd, String name, int age, char gender ){  //default 접근제한자는 쓰기 생략 가능
        this.num = num;
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    public String getInfo() {    //no1 6번째 인스턴스의 필드를 문자열로 만들어서 반환한다.
        return "Member{" +
                "num=" + num +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
