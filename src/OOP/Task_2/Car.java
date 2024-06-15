package OOP.Task_2;

public class Car {

    int currentSpeed = 0;
    int speedUp;
    String Mark;
    String Model;

    public Car(String mark, String model) {
        Mark = mark;
        Model = model;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void speedUp (int speedUp) {

        this.currentSpeed = this.currentSpeed + speedUp;
    }

    public void speedBreak() {

        if (currentSpeed <= 10) {
            currentSpeed = 0;
        } else {
            currentSpeed = currentSpeed - 10;
        }
    }
}
