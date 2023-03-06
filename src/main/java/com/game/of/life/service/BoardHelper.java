package src.main.java.com.game.of.life.service;

import src.main.java.com.game.of.life.model.Board;

import java.util.Random;

public class BoardHelper {

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

    public void printBoard(Board board){
        int[][] grid = board.getBoard();
        int rows = board.getRows();
        int columns = board.getColumns();
        System.out.println("----------------------");
        for(int r=0;r<rows;r++){
            for(int c=0;c<columns;c++){
                System.out.print(grid[r][c]+" ");
            }
            System.out.println();
        }
        System.out.println("----------------------");
    }

    public void play(Board board, int ticks) {


        int rows = board.getRows();
        int columns = board.getColumns();
        while(ticks-- > 0){
            int[][] grid = board.getBoard();
            int[][] nextGrid = new int[rows][columns];
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < columns; c++) {
                    int liveNeighbours = 0;
                    for (int i = -1; i <= 1; i++) {
                        for (int j = -1; j <= 1; j++) {
                            int newRow = r + i;
                            int newCol = c + j;
                            if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < columns) {
                                if (grid[newRow][newCol] == 1)
                                    liveNeighbours++;
                            }
                        }
                    }
                    if (grid[r][c] == 1)
                        nextGrid[r][c] = (liveNeighbours == 2 || liveNeighbours == 3) ? 1 : 0;
                    else
                        nextGrid[r][c] = liveNeighbours == 3 ? 1 : 0;
                }
            }
            board.setBoard(nextGrid);
            printBoard(board);
        }
    }
}
