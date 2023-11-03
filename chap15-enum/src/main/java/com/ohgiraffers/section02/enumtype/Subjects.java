package main.java.com.ohgiraffers.section02.enumtype;

public enum Subjects {  // 상수 열거 필드
    JAVA("java"),
    ORACLE("oracle"),
    JDBC("jdbc"),
    HTML("html"),
    CSS("css"),
    JAVASCRIPT("javascript");

    private String value;   

    Subjects(String value)  {    // 생성자를 만들어 버리면 기본 생성자가 생기지 않기에 다 타입에 맞게 입력을 해주어야함
        this.value = value;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "value='" + value + '\'' +
                '}';
    }
}
