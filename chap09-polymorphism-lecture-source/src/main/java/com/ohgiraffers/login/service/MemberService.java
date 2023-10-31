package main.java.com.ohgiraffers.login.service;

import main.java.com.ohgiraffers.login.Auth.GoogleAuth;
import main.java.com.ohgiraffers.login.Auth.KakaoAuth;
import main.java.com.ohgiraffers.login.Auth.NaverAuth;
import main.java.com.ohgiraffers.login.Auth.SnsAuth;
import main.java.com.ohgiraffers.login.dto.MemberDTO;

public class MemberService {

    private SnsAuth snsAuth;
    MemberDTO memberDTO1 = new MemberDTO();

    public void findMember(String authType, MemberDTO memberDTO) {
        memberDTO.getId();
        memberDTO.getPwd();
        switch (authType) {
            case "google":
                GoogleAuth googleAuth = new GoogleAuth();
                boolean result = googleAuth.login(memberDTO);
                if (result) {
                    System.out.println("구글 아이디로 인증 된 " + memberDTO.getId() + " 님 환영합니다.");
                } else {
                    System.out.println("구글에 인증된 회원이 없습니다.");
                }
                break;
            case "naver":
                NaverAuth naverAuth = new NaverAuth();
                boolean result1 = naverAuth.login(memberDTO);
                if (result1) {
                    System.out.println("네이버 아이디로 인증 된 " + memberDTO.getId() + " 님 환영합니다.");
                } else {
                    System.out.println("네이버에 인증된 회원이 없습니다.");
                }
                break;
            case "kakao":
                KakaoAuth kakaoAuth = new KakaoAuth();
                boolean result2 = kakaoAuth.login(memberDTO);
                if (result2) {
                    System.out.println("카카오 아이디로 인증 된 " + memberDTO.getId() + " 님 환영합니다.");
                } else {
                    System.out.println("카카오에 인증된 회원이 없습니다.");
                }
                break;
            default:
                System.out.println("존재하지 않는 인증 유형입니다.");
                return;
        }


        }

    }
