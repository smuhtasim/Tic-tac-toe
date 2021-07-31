package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SceneChanger {
    public void sceneChange(String fxmlFileName, Pane pane)throws Exception {
        Stage stage = (Stage) pane.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource(fxmlFileName));
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource(fxmlFileName)));
        stage.setScene(scene);
        stage.show();

    }
}
