package main.java.com.ogiraffer.Question;

public class Question4 {

    public static void main(String[] args){

        // "일 식비가 얼마나 되나요?(금액만 입력해주세요.)"가 출력된 후,
        // 일 식비를 입력했을 때, 10000원을 이상이면 "과소비된 식비입니다.",
        // 5000원을 이상이면 "검소한 식비입니다.",
        // 5000원 미만이면 "굶는 중입니다."가 화면에 출력되도록 하세요.
        // 이 때 메서드 한 개를 이용하되, static을 쓰지 않고 return 값 반환을 이용해서 만들어 보세요.

        System.out.println("일 식비가 얼마나 되나요?");
        int money = 7000;
        Question4 app1 = new Question4();
        String myM = app1.myMoney(money);
        System.out.println(myM);

    }

    public String myMoney(int money1){
        if(money1>10000) {
            return ("과소비된 식비입니다.");
        }else if(money1>5000){
            return ("검소한 식비입니다.");
        }else{return ("굶는 중입니다.");
        }
    }
}
