package Branches.Task_5;

public class FizzBuzz {

    public static void main(String[] args) {

        int fizzBuzz;

        for (int i = 1; i <= 100; i++) {
            fizzBuzz = i;
            if (fizzBuzz % 3 == 0 && fizzBuzz % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (fizzBuzz % 3 == 0) {
                System.out.println("Fizz");
            } else if (fizzBuzz % 5 == 0) {
                System.out.println("Buzz");
            } else System.out.println(fizzBuzz);
        }
    }
}
