package controller;

import bo.BoFactory;
import bo.BoType;
import bo.custom.CourseBo;
import bo.custom.StudentBo;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import dto.CourseDTO;
import dto.StudentDTO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import view.tm.CourseTm;
import view.tm.StudentTm;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentviewController {
    public JFXTextField txtId;
    public JFXTextField txtName;
    public JFXTextField txtAddress;
    public JFXTextField txtPhoneNo;
    public TableView<StudentTm> tblStudent;
    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colAddress;
    public TableColumn colPhoneNo;
    public TableColumn colDateOfBirth;
    public TableColumn colGender;
    public TableColumn colOption;
    public JFXDatePicker dateDate;
    public RadioButton genderMale;
    public RadioButton genderFemale;
    public TableColumn colProgramName;
    public TableColumn colFee;
    public ComboBox cmbProgramName;
    public TableView tblselectProgram;
    public TableColumn colProgramName1;
    public TableColumn colFee1;
    public TableColumn colOption1;
    public JFXTextField txtTotle;

    ObservableList<String> courseList = FXCollections.observableArrayList();

    CourseBo courseBo = BoFactory.getInstance().getBO(BoType.COURSE);
    StudentBo studentBo = BoFactory.getInstance().getBO(BoType.STUDENT);

    public void initialize(){

        try {

            colId.setCellValueFactory(new PropertyValueFactory("StudentId"));
            colName.setCellValueFactory(new PropertyValueFactory("StudentName"));
            colAddress.setCellValueFactory(new PropertyValueFactory("Address"));
            colPhoneNo.setCellValueFactory(new PropertyValueFactory("PhoneNo"));
            colDateOfBirth.setCellValueFactory(new PropertyValueFactory("DateOfBirth"));
            colGender.setCellValueFactory(new PropertyValueFactory("Gender"));
            colProgramName.setCellValueFactory(new PropertyValueFactory("ProgramName"));
            colFee.setCellValueFactory(new PropertyValueFactory("Fee"));
            colOption.setCellValueFactory(new PropertyValueFactory("btn"));


            List<CourseDTO> all = null;
            all = courseBo.getAllCourse();
            for (CourseDTO dto : all){
                courseList.add(dto.getCourseName());
            }

            cmbProgramName.setItems(courseList);


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void SaveOnAction(ActionEvent actionEvent) {
    }

    public void UpdateOnAction(ActionEvent actionEvent) {
    }

    public void selectProgramOnAction(ActionEvent actionEvent) {
        String s = cmbProgramName.getValue().toString();
        CourseTm courseTm = new CourseTm();
        Button button = new Button("Delete");
        courseTm.setCourseName(s);
        courseTm.setFee(Double.parseDouble(s));
        courseTm.setBtn(button);

        button.setOnAction((e) ->{
            ButtonType ok = new ButtonType("OK", ButtonBar.ButtonData.OK_DONE);
            ButtonType no = new ButtonType("NO", ButtonBar.ButtonData.CANCEL_CLOSE);

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are You Sure", ok, no);

            Optional<ButtonType> result = alert.showAndWait();
            if (result.orElse(no) == ok) {
                String courseName = courseTm.getCourseName();
                double fee = courseTm.getFee();
            }
        });
        tblselectProgram.setItems(courseList);
    }
}
