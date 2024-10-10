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


    @Override
    public String toString() {
        return "{Payer: " + surname + " " + name + ", address: " + address + " " + ", card: " + cardNumber + "}";
    }
}
