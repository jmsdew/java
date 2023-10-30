package main.java.com.ohgiraffers.section01.extend;

public class Application011 {
    public static void main(String[] args){
        Car car = new Car();
        System.out.println(car.hashCode());
        Car car1 = returnCar(car);
        System.out.println(car1.hashCode());

        Car car2 = car;
        System.out.println(car2.hashCode());

        // 다 같은 주소 값을 가진다.

        int[] inum = {1,2,3};  //같은 주소 값을 가짐
        int[] inum1 = inum;
        inum1[0] = 100;
        System.out.println(inum[0]);


        String test = "test";
        String test1 = "test1";
        System.out.println(test.hashCode());
        System.out.println(test1.hashCode());
        test1 += "1";
        System.out.println(test);
        System.out.println(test.hashCode());
        System.out.println(test1.hashCode());

        String test2 = new String("test");


    }

    public static Car returnCar(Car car){
        return car;
    }
}
