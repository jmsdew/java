package main.java.com.ogiraffers.section02.uses;

public class MemberFinder {

    public Member[] findAllMembers(){    //no2 4번째
        return MemberRepository.findAllMembers();
    }
}
