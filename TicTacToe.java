import java.util.Arrays;
import java.util.Scanner; 
import java.util.Random; 

public class TicTacToe {
    // States 
    boolean startGame;
    boolean continueGame; 
    boolean endGame; 

    // constructor to initialise game object 
    public TicTacToe(){
        this.startGame = true;
        this.continueGame = true;
        this.endGame = false; 
    }

    // Gameboard static method 
   private static void printBoard(int choice){

        char[][] gameBoard = {{' ','|',' ','|',' '},
                              {'-','+','-','+','-'},
                              {' ','|',' ','|',' '},
                              {'-','+','-','+','-'},
                              {' ','|',' ','|',' '},
                            };

        // Player choice, "X" the box that player chose
        switch(choice){
            case 1: 
            if (gameBoard[0][0] != 'O'){
                gameBoard[0][0] = 'X';
            };
            break;
            case 2: 
            if (gameBoard[0][2] != 'O'){
                gameBoard[0][2] = 'X';
            };
            break;
            case 3: 
            if (gameBoard[0][4] != 'O'){
                gameBoard[0][4] = 'X';
            };
            break;
            case 4: 
            if (gameBoard[2][0] != 'O'){
                gameBoard[2][0] = 'X';
            };
            break;
            case 5: 
            if (gameBoard[2][2] != 'O'){
                gameBoard[2][2] = 'X';
            };
            break;
            case 6: 
            if (gameBoard[2][4] != 'O'){
                gameBoard[2][4] = 'X';
            };
            break;
            case 7: 
            if (gameBoard[4][0] != 'O'){
                gameBoard[4][0] = 'X';
            };
            break;
            case 8: 
            if (gameBoard[4][2] != 'O'){
                gameBoard[4][2] = 'X';
            };
            break;
            case 9: 
            if (gameBoard[4][4] != 'O'){
                gameBoard[4][4] = 'X';
            };
            break;
            default:
                System.out.println("Ops!Looks like that is an invalid choice. Please try again!"); // Think of how to handle this globally in runtime
        }


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
        

    }

    // Method to prompt user input on user turn 
    private static int prompt(){

                // Request for player input 
        Scanner pickSpot = new Scanner(System.in);
        System.out.println("Where would you like to cross?");
        int position = pickSpot.nextInt();

        return position;

    }


    // Method for computer turn 
    private int computer(){
        int spot = (int)Math.floor(Math.random() * 9) + 1; // This will generate a random number from 1 to 9.
        return spot; 
    }



    public static void main(String[] args) {

        // Launch game 
        gameTitle();
        
        // Create game object 
        TicTacToe game = new TicTacToe();
        int choice = prompt();
        printBoard(choice);

        

        



        


                                                
       
    }







}