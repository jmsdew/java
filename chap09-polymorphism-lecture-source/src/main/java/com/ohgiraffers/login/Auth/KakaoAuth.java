package main.java.com.ohgiraffers.login.Auth;

import main.java.com.ohgiraffers.login.dto.MemberDTO;

public class KakaoAuth implements SnsAuth{
    @Override
    public boolean login(MemberDTO memberDTO) {
        if((memberDTO1.getId().equals(memberDTO.getId())) || (memberDTO1.getPwd().equals(memberDTO.getPwd()))){
            return true;
        }else {return false;}
    }


    MemberDTO memberDTO1 = new MemberDTO("kakao","kakao");
}
