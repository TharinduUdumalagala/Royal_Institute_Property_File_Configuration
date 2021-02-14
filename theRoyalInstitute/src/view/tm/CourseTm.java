package view.tm;

import javafx.scene.control.Button;

public class CourseTm {
    private String code;
    private String courseName;
    private String duration;
    private double fee;
    private Button btn;

    public CourseTm() {
    }

    public CourseTm(String code, String courseName, String duration, double fee, Button btn) {
        this.code = code;
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
        this.btn = btn;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    @Override
    public String toString() {
        return "CourseTm{" +
                "code='" + code + '\'' +
                ", courseName='" + courseName + '\'' +
                ", duration='" + duration + '\'' +
                ", fee=" + fee +
                ", btn=" + btn +
                '}';
    }
}
