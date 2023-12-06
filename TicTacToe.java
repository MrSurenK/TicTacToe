import java.util.Arrays;
import java.util.Scanner; 

public class TicTacToe {

    // Gameboard static method 
   private static void printBoard(){

        char[][] gameBoard = {{' ','|',' ','|',' '},
                              {'-','+','-','+','-'},
                              {' ','|',' ','|',' '},
                              {'-','+','-','+','-'},
                              {' ','|',' ','|',' '},
                            };

        for (char[] row : gameBoard) {
            for (char col : row){
                System.out.print(col);
            }
            System.out.println("");

        }

    }

    // Game title static method 
    private static void gameTitle(){


        System.out.println("888   d8b        888                   888");                    
        System.out.println("888   Y8P        888                   888");                    
        System.out.println("888              888                   888");                    
        System.out.println("888888888 .d8888b888888 8888b.  .d8888b888888 .d88b.  .d88b.  ");
        System.out.println("888   888d88P\"   888       \"88bd88P\"   888   d88\"\"88bd8P  Y8b ");
        System.out.println("888   888888     888   .d888888888     888   888  88888888888"); 
        System.out.println("Y88b. 888Y88b.   Y88b. 888  888Y88b.   Y88b. Y88..88PY8b.   ");  
        System.out.println("Y888888 \"Y8888P \"Y888\"Y888888 \"Y8888P \"Y888 \"Y88P\"  \"Y8888\"\n");  
        System.out.println("To start please select a box!\n");

    }

   




    public static void main(String[] args) {

        // Launch game 
        gameTitle();
        printBoard();

        



                                                            

       
    }







}