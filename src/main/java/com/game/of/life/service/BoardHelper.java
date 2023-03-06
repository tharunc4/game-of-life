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

    public void play(Board board, int ticks) {


        int rows = board.getRows();
        int columns = board.getColumns();
        while(ticks-- > 0){
            int[][] grid = board.getBoard();
            int[][] nextGrid = new int[rows][columns];
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < columns; c++) {
                    int liveNeighbours = 0;
                    // Will check for all the neighbours including itself
                    for (int i = -1; i <= 1; i++) {
                        for (int j = -1; j <= 1; j++) {
                            int newRow = r + i;
                            int newCol = c + j;
                            //No need to check the current cell health , we only need to calculate the live neighbours
                            if(newRow == r && newCol == c)
                                continue;
                            if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < columns) {
                                if (grid[newRow][newCol] == 1)
                                    liveNeighbours++;
                            }
                        }
                    }
                    //System.out.println(r+" "+c+" "+grid[r][c]+" "+liveNeighbours);
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
