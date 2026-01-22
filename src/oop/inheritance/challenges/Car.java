package oop.inheritance.challenges;

public class Car {

    final int MAXIMUM_SPEED;
    int currentSpeed;
    int delta = 5;

    Car(int maximumSpeed) {
        this.MAXIMUM_SPEED = maximumSpeed;
    }

    void accelerate() {
        if (currentSpeed + delta > MAXIMUM_SPEED) {
            currentSpeed = MAXIMUM_SPEED;
        } else {
            currentSpeed += delta;
        }
    }

    void brake() {
        if (currentSpeed >= 5) {
            currentSpeed -= 5;
        } else {
            currentSpeed = 0;
        }
    }

    public String toString() {
        return "Current speed is: " + this.currentSpeed + " mph.";
    }
}
