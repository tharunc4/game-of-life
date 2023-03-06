package src.main.java.com.game.of.life.service;

import src.main.java.com.game.of.life.model.Board;

public class BoardPrinter {

    public void printBoard(Board board){
        int[][] grid = board.getBoard();
        int rows = board.getRows();
        int columns = board.getColumns();
        System.out.println("-----------------BOARD PRINT START-----------------");
        for(int r=0;r<rows;r++){
            for(int c=0;c<columns;c++){
                System.out.print(grid[r][c]+" ");
            }
            System.out.println();
        }
        System.out.println("-----------------BOARD PRINT END-----------------");
        System.out.println();
    }
}
