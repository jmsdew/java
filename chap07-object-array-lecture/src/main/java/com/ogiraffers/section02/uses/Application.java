package main.java.com.ogiraffers.section02.uses;

import java.util.Scanner;

public class Application {

    public static void main(String[] args){

        /*
        * 시스템의 요구사항
        * 1. 여러 명의 회원 정보를 받아 한 번에 여러 회원 정보를 등록
        * 2. 전체 회원 조회 시 여러 명의 회원 정보를 반환
        *
        * 1. MemberRepository에 static 필드로 회원 정보들을 관리
        * 회원 정보는 최대 10명까지 저장할 수 있다.        *
        * */
        Scanner scanner = new Scanner(System.in);        
        // 사용자의 입력을 받을 수 있도록 scanner 메서드를 생성함
        // 반복문 내부에서 생성시 반복문 실행마다 새로운 인스턴스를 생성해야 하기 때문에
        // 메모리 낭비가 발생될 수 있으며 컴퓨터 리소스가 낭비됨


        MemberService memberManager = new MemberService(); // 객체를 heap에 생성하여 메서드를 실행할 수 있도록 준비함

        loof : while(true){
            System.out.println("======회원 관리 프로그램=======");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴 선택 : ");
            int no = scanner.nextInt();
            // 사용자에게 이용하고자 하는 서비스의 번호를 입력받음 (입력 값은 정수형)

            switch (no){ // 입력값이 아래와 같을 경우 해당 되는 서비스를 실행해줌
                // 사용자 입력 값이 == 1이면 memberservice클래스에 있는 signUpMembers() 메소드를 호출함
                // 호출시 stack 영역에서 동작이 된다.   (no==1일때 첫번째 실행)
                case 1 : memberManager.signUpMembers(); break;
                case 2 : memberManager.showAllMembers(); break; // (no2 == 1)
                // 사용자 입력 값이 == 2 이면 memberservice클래스에 있는 showAllMembers() 메소드 호출
                // 호출시 stack 영역에 쌓으면서 동작된다.
                case 9 :
                    System.out.println("프로그램을 종료합니다."); return; // 종료시키는 방법 중 하나 점유중인 프로세스를 반환
                                                                    //  반환되며 프로세스가 종료됨
                                                                    // while 에 이름을 붙혀 이름 break;로 끝내는게 더 나음
                                                                        /// break loof;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다."); break;
            }
        }

    }
}
