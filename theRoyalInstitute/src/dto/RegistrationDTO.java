package dto;

public class RegistrationDTO {
    private String regNo;
    private String regDate;
    private double regFee;

    public RegistrationDTO() {
    }

    public RegistrationDTO(String regNo, String regDate, double regFee) {
        this.regNo = regNo;
        this.regDate = regDate;
        this.regFee = regFee;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public double getRegFee() {
        return regFee;
    }

    public void setRegFee(double regFee) {
        this.regFee = regFee;
    }

    @Override
    public String toString() {
        return "RegistrationDTO{" +
                "regNo='" + regNo + '\'' +
                ", regDate='" + regDate + '\'' +
                ", regFee=" + regFee +
                '}';
    }
}
