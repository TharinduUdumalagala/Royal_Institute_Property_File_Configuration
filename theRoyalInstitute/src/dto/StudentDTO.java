package dto;

public class StudentDTO {
    private String id;
    private String name;
    private String address;
    private int contact;
    private String bod;
    private String gender;
    private String programName;

    public StudentDTO() {
    }

    public StudentDTO(String id, String name, String address, int contact, String bod, String gender, String programName) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.bod = bod;
        this.gender = gender;
        this.programName = programName;
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

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
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

    @Override
    public String toString() {
        return "StudentDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact=" + contact +
                ", bod='" + bod + '\'' +
                ", gender='" + gender + '\'' +
                ", programName='" + programName + '\'' +
                '}';
    }
}

