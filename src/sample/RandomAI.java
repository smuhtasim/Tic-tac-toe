package sample;



public class RandomAI implements AI {
    public Coordinate calculateCoordinate(GameBoard gameBoard) {
        Coordinate coordinate = new Coordinate();
        while (true) {
            coordinate.row = getRandomNumber(1, 4);
            coordinate.column = getRandomNumber(1, 4);
            if (gameBoard.getTileValue(coordinate).equals("")){
                break;
            }
        }
        return coordinate;
    }


    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}

