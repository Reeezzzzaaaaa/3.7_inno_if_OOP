package OOP.Task_1;

public class Card {

    private String cardNumber;
    private int month;
    private int year;
    private String CVV;
    private String pinCode;

    public Card(String cardNumber, int month, int year, String CVV, String pinCode) {
        this.cardNumber = cardNumber;
        this.month = month;
        this.year = year;
        this.CVV = CVV;
        this.pinCode = pinCode;
    }

    public void getCardNumber(String cardNumber) {

        if (cardNumber.length() == 19) {
            cardNumber = "**** **** **** " + cardNumber.substring(15);
            System.out.println(cardNumber);
        } else if (cardNumber.length() == 16) {
            cardNumber = "**** **** **** " + cardNumber.substring(12);
            System.out.println(cardNumber);
        } else {
            cardNumber = "Номер карты невалидный";
            System.out.println(cardNumber);
        }
    }

    public void getPinCode(String pinCode) {

        if (this.pinCode.equals(pinCode)) {
            System.out.println(cardNumber);
        }
    }
}
