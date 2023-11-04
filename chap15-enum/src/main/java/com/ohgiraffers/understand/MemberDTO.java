package main.java.com.ohgiraffers.understand;

import main.java.com.ohgiraffers.understand.type.Htype;

import java.lang.reflect.Member;

public class MemberDTO {
    private String name;
    private int weight;
    private Htype type;

    public MemberDTO(){}

    public MemberDTO(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Htype getType() {
        return type;
    }

    public void setType(Htype type) {
        this.type = type;
    }
}
