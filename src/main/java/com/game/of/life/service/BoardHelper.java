package src.main.java.com.game.of.life.service;

import src.main.java.com.game.of.life.model.Board;

import java.util.Random;

public class BoardHelper {

    public void initialize(Board board){

        int[][] grid = board.getBoard();
        int rows = grid.length;
        int columns = grid[0].length;
        int start = 0 , end = 1;
        Random random = new Random();
        for(int r=0;r<rows;r++){
            for(int c=0;c<columns;c++){
                grid[r][c] = random.nextInt((end-start)+1)+start;
            }
        }
        board.setBoard(grid);
    }

    public void printBoard(Board board){
        int[][] grid = board.getBoard();
        int rows = grid.length;
        int columns = grid[0].length;

        for(int r=0;r<rows;r++){
            for(int c=0;c<columns;c++){
                System.out.print(grid[r][c]+" ");
            }
            System.out.println();
        }
    }
}
