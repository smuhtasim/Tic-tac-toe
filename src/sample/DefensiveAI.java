package sample;

public class DefensiveAI implements AI {
    @Override
    public Coordinate calculateCoordinate(GameBoard gameBoard) {

        Coordinate coordinate = new Coordinate();

        Coordinate defensiveCoordinate = new Coordinate();

        RandomAI randomAI = new RandomAI();

        defensiveCoordinate=randomAI.calculateCoordinate(gameBoard);

        for(int i=1;i<4;i++){
            for(int j=1;j<4;j++){
                coordinate.row=i;
                coordinate.column=j;
                if(gameBoard.getTileValue(coordinate).equals("")){
                    gameBoard.setTileValue(coordinate,"X");
                    if(gameBoard.isGameBoardWin()){
                        defensiveCoordinate.row=coordinate.row;
                        defensiveCoordinate.column=coordinate.column;
                    }
                    gameBoard.setTileValue(coordinate,"");

                }
            }
        }

        for(int i=1;i<4;i++){
            for(int j=1;j<4;j++){
                coordinate.row=i;
                coordinate.column=j;
                if(gameBoard.getTileValue(coordinate).equals("")){
                    gameBoard.setTileValue(coordinate,"0");
                    if(gameBoard.isGameBoardWin()){
                        defensiveCoordinate.row=coordinate.row;
                        defensiveCoordinate.column=coordinate.column;
                    }
                    gameBoard.setTileValue(coordinate,"");

                }
            }
        }

        return defensiveCoordinate;

    }

}

