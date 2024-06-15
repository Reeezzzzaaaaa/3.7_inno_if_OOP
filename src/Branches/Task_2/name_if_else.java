package Branches.Task_2;

public class name_if_else {

    public static void main(String[] args) {

        int multiplicity1 = 17;
        int result = multiplicity1 % 2;

        if (multiplicity1 <= 0) {
            return;
        }

        if (result == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечетное число");
        }


    }
}
