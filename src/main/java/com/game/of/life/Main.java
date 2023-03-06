package src.main.java.com.game.of.life;

import src.main.java.com.game.of.life.model.Board;
import src.main.java.com.game.of.life.service.BoardHelper;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number of Rows :- ");
        int rows = Integer.parseInt(bf.readLine());
        System.out.println("Enter number of Columns :- ");
        int columns = Integer.parseInt(bf.readLine());
        System.out.println("Enter number of Ticks :- ");
        int ticks = Integer.parseInt(bf.readLine());

        Board board = new Board(rows,columns);
        BoardHelper boardHelper = new BoardHelper();
        System.out.println("Generating Random Input");
        boardHelper.initialize(board);
        System.out.println("Board Initialized successfully");
        System.out.println("Printing Board");
        boardHelper.printBoard(board);
    }
}
