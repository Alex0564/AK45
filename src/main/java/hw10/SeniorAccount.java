package hw10;

public class SeniorAccount extends CheckingAccount {
    private int fee;

    public SeniorAccount(String name, String lastName, int birthYear, String address, Gender gender,
                         LawfulStatus status, int fee) {
        super(name, lastName, birthYear, address, gender, status);
        this.fee = fee;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public void printInfo() {
        System.out.println(
                "Name: " + name +
                        "\nLast name: " + lastName +
                        "\nBirth year:  " + birthYear +
                        "\nAddress: " + address +
                        "\nGender: " + gender +
                        "\nLawful status: " + status +
                        "\nMonthly maintenance fee: $" + fee);
    }


}
