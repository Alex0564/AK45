package homeWork15op;

public class Doctor {
    private String name;
    private String lastName;
    private DoctorPosition doctorPosition;


    public Doctor(String name, String lastName, DoctorPosition doctorPosition) {
        this.name = name;
        this.lastName = lastName;
        this.doctorPosition = doctorPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public DoctorPosition getDoctorPosition() {
        return doctorPosition;
    }

    public void setDoctorPosition(DoctorPosition doctorPosition) {
        this.doctorPosition = doctorPosition;
    }
}
