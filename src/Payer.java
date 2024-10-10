public class Payer {
    private String surname;
    private String name;
    private String address;
    private long cardNumber;


    public Payer(String surname, String name, String address, long cardNumber) {
        this.surname = surname;
        this.name = name;
        this.address = address;
        this.cardNumber = cardNumber;
    }

    private String toString(long cardNumber){
        String cardString = "";
        for(int i = 0; i < 16; i++){
            if(i % 4 == 0 && i != 0) cardString += " ";
            cardString += cardNumber / (10 * (16-i)) % 10;
        }
        return cardString;
    }

    @Override
    public String toString() {
        return "{Payer: " + surname + " " + name + ", address: " + address + " " + ", card: " + toString(cardNumber) + "}";
    }
}
