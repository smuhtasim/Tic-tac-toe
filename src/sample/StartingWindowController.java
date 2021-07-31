package sample;


import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

public class StartingWindowController {



    @FXML
    private BorderPane theme;


    public void radioForestOnAction()
    {
        theme.getStylesheets().clear();
        theme.getStylesheets().add(this.getClass().getResource("Forest.css").toExternalForm());
    }

    public void radioHighContrastOnAction()
    {
        theme.getStylesheets().clear();
        theme.getStylesheets().add(this.getClass().getResource("HighContrast.css").toExternalForm());
    }

    public void radioClassicOnAction()
    {
        theme.getStylesheets().clear();
        theme.getStylesheets().add(this.getClass().getResource("Classic.css").toExternalForm());
    }

    public void randomButtonOnAction() throws IOException
    {
        Parent view2 = FXMLLoader.load(getClass().getResource("GameWindow.fxml"));
        theme.getChildren().setAll(view2);
        storingAITypeInFile("RandomAI");


    }

    public void defensiveButtonOnAction() throws IOException
    {
        Parent view2 = FXMLLoader.load(getClass().getResource("GameWindow.fxml"));
        theme.getChildren().setAll(view2);
        storingAITypeInFile("DefensiveAI");

    }


    private void storingAITypeInFile(String TypeOfAI) {
        File file = new File("Ai.txt");
        try{
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file.getName());
            fileWriter.write(TypeOfAI);
            fileWriter.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}



