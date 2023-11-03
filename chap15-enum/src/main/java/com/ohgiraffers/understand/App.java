package main.java.com.ohgiraffers.understand;

import main.java.com.ohgiraffers.understand.type.Htype;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        // 회원 제한은 없으며 체력을 관리해야 한다.
        // 10명의 회원 유형도 자율이다.

        List<MemberDTO> members = new ArrayList<>();
        members.add(new MemberDTO("김씨", 10));
        members.add(new MemberDTO("박씨", 30));
        members.add(new MemberDTO("정씨", 60));
        members.add(new MemberDTO("이씨", 80));
        members.add(new MemberDTO("유씨", 40));
        members.add(new MemberDTO("강씨", 60));
        members.add(new MemberDTO("도씨", 30));
        members.add(new MemberDTO("홍씨", 80));
        members.add(new MemberDTO("장씨", 20));
        members.add(new MemberDTO("최씨", 50));

        Scanner scr = new Scanner(System.in);
        String[] value = scr.nextLine().split(" ");
        for (int i = 0; i < members.size(); i++) {
            String result = value[i];
//            members.get(i).setType();
        }

    }
}
