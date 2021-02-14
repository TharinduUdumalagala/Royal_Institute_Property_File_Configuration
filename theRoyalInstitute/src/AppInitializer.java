import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import util.HibernateUtil;

public class AppInitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        HibernateUtil.getInstance().openSession();
        primaryStage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("view/LoginView.fxml"))));
        primaryStage.show();
    }
}
