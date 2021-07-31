package sample;

import org.junit.Assert;
import org.junit.Test;

public class GameBoardTest {

    @Test
    public void getTileValue() {
        GameBoard gameBoard = new GameBoard();
        Coordinate testCoordinate = new Coordinate();
        testCoordinate.row=1;
        testCoordinate.column=1;
        gameBoard.setTileValue(testCoordinate,"X");
        Assert.assertEquals("X",gameBoard.getTileValue(testCoordinate));
    }

    @Test
    public void calculateNumberOfFilledTiles() {
        GameBoard gameBoard = new GameBoard();
        Coordinate testCoordinate = new Coordinate();
        testCoordinate.row=1;
        testCoordinate.column=1;
        gameBoard.setTileValue(testCoordinate,"X");
        testCoordinate.row=2;
        testCoordinate.column=1;
        gameBoard.setTileValue(testCoordinate,"0");
        testCoordinate.row=3;
        testCoordinate.column=2;
        gameBoard.setTileValue(testCoordinate,"X");
        Assert.assertEquals(3,gameBoard.calculateNumberOfFilledTiles());
    }


    @Test
    public void isWin() {


        /*
        X,_,0
        _,X,0
        _,_,X
         */

        GameBoard gameBoard = new GameBoard();
        Coordinate testCoordinate = new Coordinate();

        testCoordinate.row=1;
        testCoordinate.column=1;
        gameBoard.setTileValue(testCoordinate,"X");

        testCoordinate.row=1;
        testCoordinate.column=3;
        gameBoard.setTileValue(testCoordinate,"0");

        testCoordinate.row=2;
        testCoordinate.column=2;
        gameBoard.setTileValue(testCoordinate,"X");

        testCoordinate.row=2;
        testCoordinate.column=3;
        gameBoard.setTileValue(testCoordinate,"0");

        testCoordinate.row=3;
        testCoordinate.column=3;
        gameBoard.setTileValue(testCoordinate,"X");

        Assert.assertEquals(true,gameBoard.isGameBoardWin());
    }

    @Test
    public void isWin2() {
        GameBoard gameBoard = new GameBoard();
        Coordinate testCoordinate = new Coordinate();

        /*
        _,0,X
        _,X,_
        X,0,_
         */

        testCoordinate.row=1;
        testCoordinate.column=2;
        gameBoard.setTileValue(testCoordinate,"0");

        testCoordinate.row=1;
        testCoordinate.column=3;
        gameBoard.setTileValue(testCoordinate,"X");

        testCoordinate.row=2;
        testCoordinate.column=2;
        gameBoard.setTileValue(testCoordinate,"X");

        testCoordinate.row=3;
        testCoordinate.column=1;
        gameBoard.setTileValue(testCoordinate,"X");

        testCoordinate.row=3;
        testCoordinate.column=2;
        gameBoard.setTileValue(testCoordinate,"0");

        Assert.assertEquals(true,gameBoard.isGameBoardWin());
    }

    @Test
    public void isWin3() {
        GameBoard gameBoard = new GameBoard();
        Coordinate testCoordinate = new Coordinate();

        /*
        X,X,X
        _,0,_
        _,0,_
         */

        testCoordinate.row=1;
        testCoordinate.column=1;
        gameBoard.setTileValue(testCoordinate,"X");

        testCoordinate.row=1;
        testCoordinate.column=2;
        gameBoard.setTileValue(testCoordinate,"X");

        testCoordinate.row=1;
        testCoordinate.column=3;
        gameBoard.setTileValue(testCoordinate,"X");

        testCoordinate.row=2;
        testCoordinate.column=2;
        gameBoard.setTileValue(testCoordinate,"0");

        testCoordinate.row=3;
        testCoordinate.column=2;
        gameBoard.setTileValue(testCoordinate,"0");

        Assert.assertEquals(true,gameBoard.isGameBoardWin());
    }

    @Test
    public void isWin4() {
        GameBoard gameBoard = new GameBoard();
        Coordinate testCoordinate = new Coordinate();

        /*
        0,0,_
        X,X,X
        _,_,_
         */

        testCoordinate.row=1;
        testCoordinate.column=1;
        gameBoard.setTileValue(testCoordinate,"0");

        testCoordinate.row=1;
        testCoordinate.column=2;
        gameBoard.setTileValue(testCoordinate,"0");


        testCoordinate.row=2;
        testCoordinate.column=1;
        gameBoard.setTileValue(testCoordinate,"X");

        testCoordinate.row=2;
        testCoordinate.column=2;
        gameBoard.setTileValue(testCoordinate,"X");

        testCoordinate.row=2;
        testCoordinate.column=3;
        gameBoard.setTileValue(testCoordinate,"X");

        Assert.assertEquals(true,gameBoard.isGameBoardWin());
    }

    @Test
    public void isWin5() {
        GameBoard gameBoard = new GameBoard();
        Coordinate testCoordinate = new Coordinate();

        /*
        _,0,_
        _,0,_
        X,X,X
         */

        testCoordinate.row=1;
        testCoordinate.column=2;
        gameBoard.setTileValue(testCoordinate,"0");


        testCoordinate.row=2;
        testCoordinate.column=2;
        gameBoard.setTileValue(testCoordinate,"0");

        testCoordinate.row=3;
        testCoordinate.column=1;
        gameBoard.setTileValue(testCoordinate,"X");

        testCoordinate.row=3;
        testCoordinate.column=2;
        gameBoard.setTileValue(testCoordinate,"X");

        testCoordinate.row=3;
        testCoordinate.column=3;
        gameBoard.setTileValue(testCoordinate,"X");

        Assert.assertEquals(true,gameBoard.isGameBoardWin());
    }

    @Test
    public void isWin6() {
        GameBoard gameBoard = new GameBoard();
        Coordinate testCoordinate = new Coordinate();

        /*
        X,0,0
        X,0,_
        X,_,X
         */

        testCoordinate.row=1;
        testCoordinate.column=1;
        gameBoard.setTileValue(testCoordinate,"X");

        testCoordinate.row=1;
        testCoordinate.column=2;
        gameBoard.setTileValue(testCoordinate,"0");

        testCoordinate.row=1;
        testCoordinate.column=3;
        gameBoard.setTileValue(testCoordinate,"0");

        testCoordinate.row=2;
        testCoordinate.column=1;
        gameBoard.setTileValue(testCoordinate,"X");

        testCoordinate.row=2;
        testCoordinate.column=2;
        gameBoard.setTileValue(testCoordinate,"0");

        testCoordinate.row=3;
        testCoordinate.column=1;
        gameBoard.setTileValue(testCoordinate,"X");

        testCoordinate.row=3;
        testCoordinate.column=3;
        gameBoard.setTileValue(testCoordinate,"X");

        Assert.assertEquals(true,gameBoard.isGameBoardWin());
    }

    @Test
    public void isWin7() {
        GameBoard gameBoard = new GameBoard();
        Coordinate testCoordinate = new Coordinate();

        /*
        _,X,0
        _,X,_
        0,X,_
         */

        testCoordinate.row=1;
        testCoordinate.column=2;
        gameBoard.setTileValue(testCoordinate,"X");

        testCoordinate.row=1;
        testCoordinate.column=3;
        gameBoard.setTileValue(testCoordinate,"0");

        testCoordinate.row=2;
        testCoordinate.column=2;
        gameBoard.setTileValue(testCoordinate,"X");

        testCoordinate.row=3;
        testCoordinate.column=1;
        gameBoard.setTileValue(testCoordinate,"0");

        testCoordinate.row=3;
        testCoordinate.column=2;
        gameBoard.setTileValue(testCoordinate,"X");

        Assert.assertEquals(true,gameBoard.isGameBoardWin());
    }

    @Test
    public void isWin8() {
        GameBoard gameBoard = new GameBoard();
        Coordinate testCoordinate = new Coordinate();

        /*
        0,_,X
        _,0,X
        X,0,X
         */

        testCoordinate.row=1;
        testCoordinate.column=1;
        gameBoard.setTileValue(testCoordinate,"0");

        testCoordinate.row=1;
        testCoordinate.column=3;
        gameBoard.setTileValue(testCoordinate,"X");

        testCoordinate.row=2;
        testCoordinate.column=2;
        gameBoard.setTileValue(testCoordinate,"0");

        testCoordinate.row=2;
        testCoordinate.column=3;
        gameBoard.setTileValue(testCoordinate,"X");

        testCoordinate.row=3;
        testCoordinate.column=1;
        gameBoard.setTileValue(testCoordinate,"X");

        testCoordinate.row=3;
        testCoordinate.column=2;
        gameBoard.setTileValue(testCoordinate,"0");

        testCoordinate.row=3;
        testCoordinate.column=3;
        gameBoard.setTileValue(testCoordinate,"X");

        Assert.assertEquals(true,gameBoard.isGameBoardWin());
    }

    @Test
    public void isDraw() {

        /*
        X,0,X
        X,X,0
        0,X,0
         */

        GameBoard gameBoard = new GameBoard();
        Coordinate testCoordinate = new Coordinate();

        testCoordinate.row=1;
        testCoordinate.column=1;
        gameBoard.setTileValue(testCoordinate,"X");

        testCoordinate.row=1;
        testCoordinate.column=2;
        gameBoard.setTileValue(testCoordinate,"0");

        testCoordinate.row=1;
        testCoordinate.column=3;
        gameBoard.setTileValue(testCoordinate,"X");

        testCoordinate.row=2;
        testCoordinate.column=1;
        gameBoard.setTileValue(testCoordinate,"X");

        testCoordinate.row=2;
        testCoordinate.column=2;
        gameBoard.setTileValue(testCoordinate,"X");

        testCoordinate.row=2;
        testCoordinate.column=3;
        gameBoard.setTileValue(testCoordinate,"0");

        testCoordinate.row=3;
        testCoordinate.column=1;
        gameBoard.setTileValue(testCoordinate,"0");

        testCoordinate.row=3;
        testCoordinate.column=2;
        gameBoard.setTileValue(testCoordinate,"X");

        testCoordinate.row=3;
        testCoordinate.column=3;
        gameBoard.setTileValue(testCoordinate,"0");

        Assert.assertEquals(true,gameBoard.isDraw());

    }


}