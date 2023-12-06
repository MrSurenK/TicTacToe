import java.util.Arrays;

public class TicTacToe {


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




    public static void main(String[] args) {


        printBoard();


        

    }




}