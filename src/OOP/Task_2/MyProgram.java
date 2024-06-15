package OOP.Task_2;

public class MyProgram {

    public static void main(String[] args) {

        Car car = new Car("Volvo", "S60");

        String speed = String.valueOf(car.getCurrentSpeed());
        System.out.println(speed);

        car.speedUp(25);
        speed = String.valueOf(car.getCurrentSpeed());
        System.out.println(speed);

        car.speedBreak();
        speed = String.valueOf(car.getCurrentSpeed());
        System.out.println(speed);

        car.speedBreak();
        speed = String.valueOf(car.getCurrentSpeed());
        System.out.println(speed);

        car.speedBreak();
        speed = String.valueOf(car.getCurrentSpeed());
        System.out.println(speed);
    }
}
