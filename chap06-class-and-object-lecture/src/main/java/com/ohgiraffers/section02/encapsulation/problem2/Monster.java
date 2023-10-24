package main.java.com.ohgiraffers.section02.encapsulation.problem2;

public class Monster {

    String kind;
    int hp;

    public void setHp(int hp){
        if(hp> 0){

            /*
            * this는 인스턴스가 생성되었을 때 자신의 주소를 저장하는 레퍼런스 변수이다.
            * 지역변수와 전역변수의 이름이 동일한 경우 지역변수를 우선적을 접근하기 때문에
            * 전역변수에 접근하기 위해서는 this. 값을 명시해야 한다.
            * */
            System.out.println("양수값이 입력되어 몬스터의 체력을 입력한 값으로 변경합니다.");
            // this  내 자신을 의미  monster 전역의 hp에 지역변수 hp를 넣어준다,.
            this.hp = hp;
        } else{
            System.out.println("0보다 작거나 같은 값이 입력되어 몬스터의 체력을 0으로 설정합니다.");
            this.hp=0;
        }
    }
}
