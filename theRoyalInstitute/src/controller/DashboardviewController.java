package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DashboardviewController {
    public AnchorPane root;

    public void initialize() throws IOException {
        initUi("Defaultview.fxml");
    }

    public void RegistrationOnAction(MouseEvent mouseEvent) throws IOException {
        initUi("Studentview.fxml");
    }



    private void initUi(String location) throws IOException {
        this.root.getChildren().clear();
        this.root.getChildren()
                .add(FXMLLoader.
                        load(this.getClass().getResource("/view/" +
                                location)));

    }

    public void CourseOnAction(MouseEvent mouseEvent) throws IOException {
        initUi("Courseview.fxml");
    }

}
