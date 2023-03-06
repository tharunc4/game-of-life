package src.main.java.com.game.of.life.service;

import src.main.java.com.game.of.life.model.Board;

import java.util.Random;

public class BoardInitializer {

    public void initialize(Board board){

        int[][] grid = board.getBoard();
        int rows = board.getRows();
        int columns = board.getColumns();
        int start = 0 , end = 1;
        Random random = new Random();
        for(int r=0;r<rows;r++){
            for(int c=0;c<columns;c++){
                grid[r][c] = random.nextInt((end-start)+1)+start;
            }
        }
        board.setBoard(grid);
    }
}
