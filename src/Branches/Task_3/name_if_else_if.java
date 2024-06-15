package Branches.Task_3;

public class name_if_else_if {

    public static void main(String[] args) {

        int multiplicity1 = 15;
        int result = multiplicity1 % 2;
        int result3 = multiplicity1 % 3;
        int result4 = multiplicity1 % 4;

        if (multiplicity1 <= 0) {
            return;
        }

        if (result == 0 && result4 ==0) {
            System.out.println("Четное число. Кратно четырем");
        } else if (result == 1 && result3 ==0) {
            System.out.println("Четное число. Кратно трем");
        }


    }
}
