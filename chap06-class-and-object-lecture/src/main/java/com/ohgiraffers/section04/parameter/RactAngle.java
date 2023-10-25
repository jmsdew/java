package main.java.com.ohgiraffers.section04.parameter;

import java.awt.*;

public class RactAngle {
    private double width;
    private double height;

    public RactAngle(){

    }
    public RactAngle(double width, double height) {  // 생성자는 반환타입이 없고 클래스 이름을 그대로 따라감.

        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void calcArea(){
        double area = width * height;
        System.out.println("사각형의 넓이는 " + area);
    }

    public void calcRound(){
        double area = (width+height) *2;
        System.out.println("사각형의 둘레는 " + area + " 입니다.");
    }

    @Override   //부모가 가진 override를 재 정의
    public String toString() {
        return "RactAngle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
