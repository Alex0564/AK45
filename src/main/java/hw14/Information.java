package hw14;

public class Information {
    private String address;
    private String ssn;

    public Information(String address, String ssn) {
        this.address = address;
        this.ssn = ssn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Information{" +
                "address='" + address + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
