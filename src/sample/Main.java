package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;




public class Main extends Application {

    Button randomAIButton, defensiveAIButton, returnToMenuButton;
    Scene scene2;


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("StartingWindow.fxml"));
        primaryStage.setTitle("TicTacToe");
        Scene scene1 = new Scene(root);
        primaryStage.setScene(scene1);
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
