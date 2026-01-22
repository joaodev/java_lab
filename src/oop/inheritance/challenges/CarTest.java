package oop.inheritance.challenges;

public class CarTest {

    public static void main(String[] args) {

        Car car1 = new HondaFit();

        car1.accelerate();
        System.out.println(car1);
        car1.accelerate();
        car1.brake();
        System.out.println(car1);
        car1.accelerate();
        System.out.println(car1);

        Car c2 = new Ferrari(400);

        c2.accelerate();
        System.out.println(c2);
        c2.accelerate();
        c2.brake();
        System.out.println(c2);
        c2.accelerate();
        System.out.println(c2);
    }
}
