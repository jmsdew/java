package main.java.com.ogiraffers.section02.uses;

public class MemberService {

    public void signUpMembers(){   // no==1 2번째 실행
        Member[] members = new Member[5];
        // Member 배열의 size를 5로 만들어줌
        // Member 배열에 members 클래스를 생성하여 값을 넣어줌

        members[0] = new Member(1,"user01","pass","홍길동",20,'남');
        members[1] = new Member(2,"user02","pass","유관순",16,'여');
        members[2] = new Member(3,"user03","pass","이순신",40,'남');
        members[3] = new Member(4,"user04","pass","신사임당",36,'여');
        members[4] = new Member(5,"user05","pass","윤봉길",22,'남');

        // no==1 3번째 memberRegister 생성
        MemberRegister memberRegister = new MemberRegister();
        // 4번째 memberRegist.regist() 메서드에 Member[]를 매개변수로 전달하여 해당 메서드를 호출함(실행함)
        memberRegister.regist(members);
    }

    public void showAllMembers(){    // no2 2번째
        MemberFinder finder = new MemberFinder();
        // finder 생성 ( MemberFinder에 메서드를 사용하기 위해 heap영역에 주솟값을 할당해줌 finder로 선언)

        System.out.println("----가입된 회원 목록------");  //  no2 3번째
        for(Member member : finder.findAllMembers()){    // 향상된 for문 사용
            if(member != null){                          // finder.findAllMembers()) 값을 하나씩 (Members의 값들)
                System.out.println(member.getInfo());    // 선언한 member 클래스에 할당해준다. (생성자를 통해 연결)
            }                                            //  null 값을 받게 되면 아무것도 출력되지 않고 회원조회완료만 뜨지만
                                            // 값을 리턴받게 되면 미리 정의해둔 getInfo 값이 출력된다.
        }
        System.out.println("-----회원 조회 완료-----");
    }
}
