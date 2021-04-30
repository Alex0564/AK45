package hw10;

public class StudentAccount extends CheckingAccount {
    private int fee;
    private CheckOption check;
    private int minBalance;
    private Major major;

    public StudentAccount(String name, String lastName, int birthYear, String address, Gender gender,
                          LawfulStatus status, Major major, int fee, CheckOption check, int minBalance) {

        super(name, lastName, birthYear, address, gender, status);

        this.fee = fee;
        this.check = check;
        this.minBalance = minBalance;
        this.major = major;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public CheckOption getCheck() {
        return check;
    }

    public void setCheck(CheckOption check) {
        this.check = check;
    }

    public int getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(int minBalance) {
        this.minBalance = minBalance;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public void printInfo() {
        System.out.println(
                "Name: " + name +
                        "\nLast name: " + lastName +
                        "\nBirth year:  "+ birthYear +
                        "\nAddress: " + address +
                        "\nGender: " + gender +
                        "\nMajor: " + major +
                        "\nLawful status: " + status +
                        "\nMonthly maintenance fee: $" + fee +
                        "\nCheck issue option: " + check +
                        "\nMinimum daily balance to avoid fee: $" + minBalance);
    }


}
