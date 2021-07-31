package sample;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.File;
import java.util.Scanner;

public class GameWindowController {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Button box11;

    @FXML
    private Button box12;

    @FXML
    private Button box13;

    @FXML
    private Button box22;

    @FXML
    private Button box21;

    @FXML
    private Button box23;

    @FXML
    private Button box32;

    @FXML
    private Button box31;

    @FXML
    private Button box33;

    Button button = new Button();

    GameBoard gameBoard = new GameBoard();

    Coordinate coordinate = new Coordinate();

    AI ai;

    public void initialize(){
        try {
            File file = new File("Ai.txt");
            Scanner scanner = new Scanner(file);
            if(scanner.next().equals("RandomAI")){
                ai = new RandomAI();
            }
            else{
                ai = new DefensiveAI();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void makeMove(Button button)
    {
        //Every odd numbered move is made by player and even numbered move is made by AI
        if (gameBoard.calculateNumberOfFilledTiles()%2==0) {
            gameBoard.setTileValue(coordinate,"X");
            button.setText(gameBoard.getTileValue(coordinate));
            button.setOpacity(1);
        }
        else {
            gameBoard.setTileValue(coordinate,"0");
            button.setText(gameBoard.getTileValue(coordinate));
            button.setOpacity(1);
        }
        checkGameStatus();
    }

    public void box11OnAction()
    {
        click(box11,1,1);
    }

    public void box12OnAction()
    {
        click(box12,1,2);
    }

    public void box13OnAction()
    {
        click(box13,1,3);
    }

    public void box21OnAction()
    {
        click(box21,2,1);
    }

    public void box22OnAction()
    {
        click(box22,2,2);
    }

    public void box23OnAction()
    {
        click(box23,2,3);
    }

    public void box31OnAction()
    {
        click(box31,3,1);
    }

    public void box32OnAction()
    {
        click(box32,3,2);
    }

    public void box33OnAction()
    {
        click(box33,3,3);
    }

    public void click (Button button, int row, int col){
        if(button.getText()=="") {
            coordinate.row = row;
            coordinate.column = col;
            makeMove(button);
            if(!anchorPane.isDisable()){
                coordinate=ai.calculateCoordinate(gameBoard);
                makeMove(decodeCoordinate(coordinate));
            }
        }


    }

    private Button decodeCoordinate(Coordinate coordinate){
        if(coordinate.row==1 && coordinate.column==1)
            return box11;
        else if(coordinate.row==1 && coordinate.column==2)
            return box12;
        else if (coordinate.row==1 && coordinate.column==3)
            return box13;
        else if (coordinate.row==2 && coordinate.column==1)
            return box21;
        else if (coordinate.row==2 && coordinate.column==2)
            return box22;
        else if (coordinate.row==2 && coordinate.column==3)
            return box23;
        else if (coordinate.row==3 && coordinate.column==1)
            return box31;
        else if (coordinate.row==3 && coordinate.column==2)
            return box32;
        else
            return box33;

    }

    private void checkGameStatus() {
        if (gameBoard.isGameBoardWin()) {
            System.out.println("Win");
            anchorPane.setDisable(true);
        } else if (gameBoard.isDraw()) {
            System.out.println("Draw");
            anchorPane.setDisable(true);
        }
    }

    public void radioForestOnAction()
    {
        BorderPane borderPane = (BorderPane) anchorPane.getParent();
        borderPane.getStylesheets().clear();
        borderPane.getStylesheets().add(this.getClass().getResource("Forest.css").toExternalForm());
    }

    public void radioHighContrastOnAction()
    {
        BorderPane borderPane = (BorderPane) anchorPane.getParent();
        borderPane.getStylesheets().clear();
        borderPane.getStylesheets().add(this.getClass().getResource("HighContrast.css").toExternalForm());
    }

    public void radioClassicOnAction()
    {
        BorderPane borderPane = (BorderPane) anchorPane.getParent();
        borderPane.getStylesheets().clear();
        borderPane.getStylesheets().add(this.getClass().getResource("Classic.css").toExternalForm());
    }




}

