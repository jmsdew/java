package main.java.com.ogiraffers.section02.uses;

public class MemberRepository {
    private final static Member[] members; /// no2 5번째 할당 값

    private static int count;

    static{
        members = new Member[10];
    }

    public static boolean store(Member[] newMembers){   // no1 9번째  전달 받은 Member[]를 new Members에 대입한다.

// no1 10번째 member의 길이만큼 반복문을 실행한다.
        for (int i = 0; i < newMembers.length; i++) {
            // member에 [count++]가 들어가는 이유
            // 현재 members는 static 변수이다. 이 이야기는 모든 MemberRepository의 인스턴스가 하나의 배열을 공유하게 된다.
            // 여기서 members의 길이는 10으로 고정이 되어 있기 때문에 member[i]를 대입하게 되면 매번 호출시 i는 0으로 시작하게 된다
            // 이러한 오류를 해결하기 위해 모든 MemberRepository의 인스턴스가 배열의 인덱스 members[index]를 공유하기 위해서
            // count 라는 static 변수를 참조해서 배열의 인덱스에 접근하게 하여 전달받은 newMembers[i]를 대입하는 것이다.
            members[count++] = newMembers[i];
        }
        // 위의 대입하는 과정 종료 후 true를 반환한다.
        return true;

    }

    public static Member[] findAllMembers(){
        return members;
    }
/* no2 5번째
* 할당받은 members 값을 리턴해준다.
* (private final static Member[] members;)
* 이 값은 signUpMembers.Members 배열을 통해 들어온 값.
* for 문을 통해서 값을 받은 후 실행되면 값을 가진 채 리턴하지만
* for 문을 받기 전에 실행되면 초기화만 되어있는 빈 공간이기 때문에 기본값 null을 반환해준다.
* */
}
