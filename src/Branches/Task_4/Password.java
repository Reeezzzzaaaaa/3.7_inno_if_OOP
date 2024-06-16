package Branches.Task_4;

public class Password {

    public static void main(String[] args) {

        String password = "fdvd1!d@";
        //"(?!=.*[0-9]).{0,}"
        if (password.length() < 8) {
            System.out.println("Пароль не менее 8 символов");
        }
        if (!password.matches("(?=.*[0-9]).{0,}")) {
            System.out.println("Пароль должен содержать минимум 1 цифру");
        }
        if (!password.matches("(?=.*[!@#$%^&*№]).{0,}")) {
            System.out.println("Пароль должен содержать минимум 1 спецсимвол");
        }
        else if (password.matches("(?=.*[0-9!@#$%^&*№]).{8,}")) {
            System.out.println("Пароль Принят");
        }
    }
}
