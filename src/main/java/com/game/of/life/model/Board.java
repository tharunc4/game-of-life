package src.main.java.com.game.of.life.model;

public class Board {

    int rows;
    int columns;
    int[][] board;
    public Board(int rows, int columns){

        board = new int[rows][columns];
    }
}
