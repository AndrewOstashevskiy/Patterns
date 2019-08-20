package JsonLesson;

public class UserAddress {
    private String street;
    private int houseNumber;

    public UserAddress(String street, int houseNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }
}
