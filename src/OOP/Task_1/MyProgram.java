package OOP.Task_1;

public class MyProgram {

    public static void main(String[] args) {

        Card card = new Card("1234 5678 9012 3456", 12, 30, "519", "0000");

        card.getCardNumber("1234 5678 9012 3456");
        card.getPinCode("0000");

        //card.year = 35;
        //System.out.println(card.year);
    }
}
