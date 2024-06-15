package Branches.Task_4;

public class Password {

    public static void main(String[] args) {

        String password = "fdvdsv1#";
        //"(?!=.*[0-9]).{0,}"
        if (password.length() < 8) {
            System.out.println("Пароль не менее 8 символов");
        } else if (!password.matches("(?=.*[0-9]).{0,}")) {
            System.out.println("Пароль должен содержать минимум 1 цифру");
        } else if (!password.matches("(?=.*[!@#$%^&*№]).{0,}")) {
            System.out.println("Пароль должен содержать минимум 1 спецсимвол");
        } else {
            System.out.println("Пароль Принят");
        }
    }
}
