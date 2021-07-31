package sample;

public class GameBoard {

    private String[][]Tile = new String[3][3];

    public GameBoard() {
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                Tile[i][j] = "";
            }
        }
    }

    public void setTileValue(Coordinate coordinate, String value){
        Tile[coordinate.row-1][coordinate.column-1]=value;

    }

    public String getTileValue(Coordinate coordinate){
        return Tile[coordinate.row-1][coordinate.column-1];
    }



    public int calculateNumberOfFilledTiles(){
        int countOfFilledTiles = 0;
        for(int i=0;i<3;i++){
            for(int j = 0;j<3;j++){
                if(Tile[i][j].equals("")){
                    //the tile that is empty no need to count
                }
                else
                    countOfFilledTiles ++;
            }
        }
        return countOfFilledTiles;
    }

    private boolean checkHorizontalMatch(){
        if(checkTilesForSameValue(Tile[0][0],Tile[0][1],Tile[0][2]))
            return true;
        if(checkTilesForSameValue(Tile[1][0],Tile[1][1],Tile[1][2]))
            return true;
        else return checkTilesForSameValue(Tile[2][0],Tile[2][1],Tile[2][2]);
    }

    private boolean checkVerticalMatch(){
        if(checkTilesForSameValue(Tile[0][0],Tile[1][0],Tile[2][0]))
            return true;
        else if(checkTilesForSameValue(Tile[0][1],Tile[1][1],Tile[2][1]))
            return true;
        else return checkTilesForSameValue(Tile[0][2],Tile[1][2],Tile[2][2]);

    }

    private boolean checkDiagonalMatch(){
        if(checkTilesForSameValue(Tile[0][0],Tile[1][1],Tile[2][2]))
            return true;
        else return checkTilesForSameValue(Tile[0][2], Tile[1][1], Tile[2][0]);
    }

    private boolean checkTilesForSameValue(String tile1,String tile2,String tile3) {
        if (tile1.equals("")) {
             //if the first tile is empty no need for checking the combination
        } else if (tile1.equals(tile2) && tile1.equals(tile3)) {
            return true;
        }
        return false;
    }

    public boolean isGameBoardWin()
    {
        if ((checkDiagonalMatch()||checkHorizontalMatch()||checkVerticalMatch())){
            return true;
        }
        return false;
    }

    public boolean isDraw(){
        if(calculateNumberOfFilledTiles()==9){
            return true;
        }
        return false;

    }


}
