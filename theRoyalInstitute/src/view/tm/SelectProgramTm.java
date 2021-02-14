package view.tm;

import javafx.scene.control.Button;

public class SelectProgramTm {
    private String courseName;
    private double fee;
    private Button btn;

    public SelectProgramTm() {
    }

    public SelectProgramTm(String courseName, double fee, Button btn) {
        this.courseName = courseName;
        this.fee = fee;
        this.btn = btn;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
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
        return "SelectProgramTm{" +
                "courseName='" + courseName + '\'' +
                ", fee=" + fee +
                ", btn=" + btn +
                '}';
    }
}
