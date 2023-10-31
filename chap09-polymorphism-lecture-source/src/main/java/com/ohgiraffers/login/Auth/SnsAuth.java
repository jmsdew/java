package main.java.com.ohgiraffers.login.Auth;

import main.java.com.ohgiraffers.login.dto.MemberDTO;

public interface SnsAuth {

    boolean login(MemberDTO memberDTO);

    void info();


}
