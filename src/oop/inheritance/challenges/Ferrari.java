package oop.inheritance.challenges;

public class Ferrari extends  Car {

    Ferrari() {
        this(315);
    }

    Ferrari(int maximumSpeed) {
        super(maximumSpeed);
        delta = 15;
    }

//    @Override
//    void accelerate() {
//        currentSpeed += 15;
//    }
}
