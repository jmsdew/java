package main.java.com.ohgiraffers.section02.encapsulation.problem2;

public class Application01 {

    public static void main(String[] args){

        /*
        * 참조 자료형의 필드가 변경되는 경우 직접 참조를 하는 필드의 모든 값을 변경해야 하는 문제가 발생한다.
        *
        * */


        Monster monster = new Monster();
//        2083562754
        monster.kind = "두치";//        2083562754.name
        monster.hp = 200;//        2083562754.hp
        // Monster 클래스로 들어가는게 아니라 moster 변수에 들어가는 것

        System.out.println("monster name :" + monster.kind);
        System.out.println("monster hp :" + monster.hp);


        Monster monster2 = new Monster();
        // monster2 ==   1239731077
 //       System.out.println(monster2.hashCode());
//        1239731077
        monster2.kind = "뿌꾸";   // monster2 ==   1239731077.name = 뿌꾸
        monster2.hp = -200;       // monster2 ==   1239731077.hp = -200
        System.out.println("monster2 name : " + monster2.kind);
        System.out.println("monster2 hp = " + monster2.hp);  //접근제어자를 써야함 0이 나오려면

        Monster monster3 = new Monster();
        monster3.kind = "드라큘라";
        monster3.setHp(-200);
        System.out.println("monster3 name : " + monster3.kind);
        System.out.println("monster3 hp : " + monster3.hp);

        Monster monster4 = new Monster();
        monster4.kind = "프랑켄슈타인";
        monster4.setHp(1000);
        System.out.println("monster4 name : " + monster4.kind);
        System.out.println("monster4 hp : " + monster4.hp);

    }
}
