package src.main.java.com.game.of.life;

import src.main.java.com.game.of.life.model.Board;
import src.main.java.com.game.of.life.service.BoardHelper;
import src.main.java.com.game.of.life.service.BoardInitializer;
import src.main.java.com.game.of.life.service.BoardPrinter;

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
        BoardInitializer boardInitializer = new BoardInitializer();
        boardInitializer.initialize(board);
        System.out.println("Board Initialized successfully");
        System.out.println("Printing Board");
        BoardPrinter boardPrinter = new BoardPrinter();
        boardPrinter.printBoard(board);
        System.out.println("Starting the Game");
        boardHelper.play(board,ticks);
    }
}
