package hw10;

public class BusinessAccount extends CheckingAccount {
    private String businessType;

    public BusinessAccount(String name, String lastName, int birthYear, String address, Gender gender,
                           LawfulStatus status, String businessType) {
        super(name, lastName, birthYear, address, gender, status);
        this.businessType = businessType;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public void printInfo() {
        System.out.println(
                "Business name: " + name +
                        "\nOwner Last name: " + lastName +
                        "\nBusiness establish year:  " + birthYear +
                        "\nBusiness address: " + address +
                        "\nOwner gender: " + gender +
                        "\nOwner lawful status: " + status +
                        "\nBusiness type: " + businessType);
    }

}
