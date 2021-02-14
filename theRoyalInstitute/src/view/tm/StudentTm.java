package view.tm;

public class StudentTm {
    private String id;
    private String name;
    private String address;
    private String contact;
    private String bod;
    private String gender;
    private String programName;
    private double fee;
    private String option;

    public StudentTm() {
    }

    public StudentTm(String id, String name, String address, String contact, String bod, String gender, String programName, double fee, String option) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.bod = bod;
        this.gender = gender;
        this.programName = programName;
        this.fee = fee;
        this.option = option;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getBod() {
        return bod;
    }

    public void setBod(String bod) {
        this.bod = bod;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    @Override
    public String toString() {
        return "StudentTm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", bod='" + bod + '\'' +
                ", gender='" + gender + '\'' +
                ", programName='" + programName + '\'' +
                ", fee=" + fee +
                ", option='" + option + '\'' +
                '}';
    }
}
