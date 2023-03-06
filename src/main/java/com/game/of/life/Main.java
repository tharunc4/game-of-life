package src.main.java.com.game.of.life;

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

    }
}
