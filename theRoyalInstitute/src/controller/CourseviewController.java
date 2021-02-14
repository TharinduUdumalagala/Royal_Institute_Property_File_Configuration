package controller;

import bo.BoFactory;
import bo.BoType;
import bo.custom.impl.CourseBoImpl;
import com.jfoenix.controls.JFXTextField;
import dto.CourseDTO;
import entity.Course;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.cell.PropertyValueFactory;
import view.tm.CourseTm;

import java.awt.*;
import java.util.List;
import java.util.Optional;

public class CourseviewController {
    public JFXTextField txtPId;
    public JFXTextField txtProgram;
    public JFXTextField txtDuration;
    public JFXTextField txtFee;
    public TableView<CourseTm> tblProgram;
    public TableColumn colPid;
    public TableColumn colProgram;
    public TableColumn colDuration;
    public TableColumn colFee;
    public TableColumn colOption;

    CourseBoImpl courseBo = BoFactory.getInstance().getBO(BoType.COURSE);

    public void initialize(){
        getAllCourse();
        tableListener();
        setCellValueFactory();
    }

    private void setCellValueFactory() {
        colPid.setCellValueFactory(new PropertyValueFactory("Code"));
        colProgram.setCellValueFactory(new PropertyValueFactory("CourseName"));
        colDuration.setCellValueFactory(new PropertyValueFactory("Duration"));
        colFee.setCellValueFactory(new PropertyValueFactory("Fee"));
        colOption.setCellValueFactory(new PropertyValueFactory("btn"));
    }

    private void tableListener() {
        tblProgram.getSelectionModel().selectedItemProperty().
                addListener((observable, oldValue, newValue)->{
                    setData((CourseTm) newValue);
                });
    }

    private void setData(CourseTm courseTm){
        try {
            txtPId.setText(courseTm.getCode());
            txtProgram.setText(courseTm.getCourseName());
            txtDuration.setText(courseTm.getDuration());
            txtFee.setText(String.valueOf(courseTm.getFee()));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private void getAllCourse() {
        try {
            ObservableList<CourseTm> courseTms = FXCollections.observableArrayList();
            List<CourseDTO> all = courseBo.getAllCourse();
            for (CourseDTO courseDTO : all){
                Button btn = new Button("Delete");
                CourseTm courseTm = new CourseTm(
                        courseDTO.getCode(),
                        courseDTO.getCourseName(),
                        courseDTO.getDuration(),
                        courseDTO.getFee(),
                        btn
                );
                courseTms.add(courseTm);
                btn.setOnAction((e)->{
                    try{
                        ButtonType ok = new ButtonType("OK", ButtonBar.ButtonData.OK_DONE);
                        ButtonType no = new ButtonType("ON", ButtonBar.ButtonData.CANCEL_CLOSE);

                        Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"Are You Sure ?", ok, no);
                        Optional<ButtonType> result = alert.showAndWait();
                        if (result.orElse(no) == ok){
                            if (courseBo.deleteCourse(courseTm.getCode())){
                                new Alert(Alert.AlertType.CONFIRMATION,"Deleted",ButtonType.OK).show();
                                getAllCourse();
                                return ;
                            }
                            new Alert(Alert.AlertType.WARNING,"Try Again..", ButtonType.OK).show();
                        }else {

                        }
                    }catch (Exception e1){
                        e1.printStackTrace();
                    }
                });
                tblProgram.setItems(courseTms);
                tblProgram.refresh();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public void SaveOnACtion(ActionEvent actionEvent) {
        String Code = txtPId.getText();
        String program = txtProgram.getText();
        String duration = txtDuration.getText();
        double fee = Double.parseDouble(txtFee.getText());

        try {
            if (courseBo.saveCourse(new CourseDTO(
                    Code,program,duration,fee ))){
                txtPId.setText(null);
                txtProgram.setText(null);
                txtDuration.setText(null);
                txtFee.setText(null);
                new Alert(Alert.AlertType.INFORMATION,"Course Added..").show();
                getAllCourse();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void UpdateOnAction(ActionEvent actionEvent) {
        String Code = txtPId.getText();
        String program = txtProgram.getText();
        String duration = txtDuration.getText();
        double fee = Double.parseDouble(txtFee.getText());

        try {
            if (courseBo.updateCourse(new CourseDTO(
                    Code,program,duration,fee ))){
                getAllCourse();
                new Alert(Alert.AlertType.INFORMATION,"Update").show();
                txtPId.setText(null);
                txtProgram.setText(null);
                txtDuration.setText(null);
                txtFee.setText(null);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
