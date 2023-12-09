import java.util.Arrays;
import java.util.Scanner; 
import java.util.Random; 

public class TicTacToe {
    // States 
    public static boolean startGame;
    public boolean continueGame; // When game over asks player if want to continue

    // constructor to initialise game object 
    public TicTacToe(){
        startGame = true;
        this.continueGame = false; 
    }


    //gameboard 
    private static void printBoard(char[][] gameBoard){
        
        for (char[] row : gameBoard) {
            for (char col : row){
                System.out.print(col);
            }
            System.out.println("");

        }

    }

    // Player choice gameboard 
   private void printPlayerChoice(char[][] gameBoard){


        // Control variable to ensure that a valid square is selected 
        boolean cont = true; 

        // WHile loop ensures that the correct square is selected
        while (cont){
            // Player choice prompt 
            int choice = prompt();
        // Player choice, "X" the box that player chose
            switch(choice){
                case 1: 
                if (gameBoard[0][0] != 'O' && gameBoard[0][0] != 'X'){
                    gameBoard[0][0] = 'X';
                    cont = false;
                } else{
                    System.out.println("That space is taken! Please pick another!");
                }
                break;
                case 2: 
                if (gameBoard[0][2] != 'O' && gameBoard[0][2] != 'X'){
                    gameBoard[0][2] = 'X';
                    cont = false;
                }else{
                    System.out.println("That space is taken! Please pick another!");
                }
                break;
                case 3: 
                if (gameBoard[0][4] != 'O' && gameBoard[0][4] != 'X'){
                    gameBoard[0][4] = 'X';
                    cont = false; 
                }else{
                    System.out.println("That space is taken! Please pick another!");
                }
                break;
                case 4: 
                if (gameBoard[2][0] != 'O' && gameBoard[2][0] != 'X'){
                    gameBoard[2][0] = 'X';
                    cont = false; 
                }else{
                    System.out.println("That space is taken! Please pick another!");
                }
                break;
                case 5: 
                if (gameBoard[2][2] != 'O' && gameBoard[2][2] != 'X'){
                    gameBoard[2][2] = 'X';
                    cont = false; 
                }else{
                    System.out.println("That space is taken! Please pick another!");
                }
                break;
                case 6: 
                if (gameBoard[2][4] != 'O' && gameBoard[2][4] != 'X'){
                    gameBoard[2][4] = 'X';
                    cont = false; 
                }else{
                    System.out.println("That space is taken! Please pick another!");
                }
                break;
                case 7: 
                if (gameBoard[4][0] != 'O' && gameBoard[4][0] != 'X'){
                    gameBoard[4][0] = 'X';
                    cont = false; 
                }else{
                    System.out.println("That space is taken! Please pick another!");
                }
                break;
                case 8: 
                if (gameBoard[4][2] != 'O' && gameBoard[4][2] != 'X'){
                    gameBoard[4][2] = 'X';
                    cont = false; 
                }else{
                    System.out.println("That space is taken! Please pick another!");
                }
                break;
                case 9: 
                if (gameBoard[4][4] != 'O' && gameBoard[4][4] != 'X'){
                    gameBoard[4][4] = 'X';
                    cont = false; 
                }else{
                    System.out.println("That space is taken! Please pick another!");
                }
                break;
                default:
                    break;
            }
        }

            printBoard(gameBoard);
        }

    // Method for computer turn 
    private static void printComputerChoice(char[][]gameBoard){      
        System.out.println("Computer Turn...");
        
        // Simulate computer thinking and making a choice 
        try {
            Thread.sleep(3000);

        } 
        catch(InterruptedException e) {
            System.out.println(e);

        }

        // To keep while loop running until valid box selected 
        boolean turn = true; 
        
        while(turn){
            int cpu_choice = (int)Math.floor(Math.random() * 9) + 1; // This will generate a random number from 1 to 9.

            switch(cpu_choice){
                case 1: 
                if (gameBoard[0][0] != 'X' && gameBoard[0][0] != 'O'){
                    gameBoard[0][0] = 'O';
                    turn = false;

                };
                break;
                case 2: 
                if (gameBoard[0][2] != 'X' && gameBoard[0][0] != 'O'){
                    gameBoard[0][2] = 'O';
                    turn = false;
                };
                break;
                case 3: 
                if (gameBoard[0][4] != 'X' && gameBoard[0][0] != 'O'){
                    gameBoard[0][4] = 'O';
                    turn = false;
                };
                break;
                case 4: 
                if (gameBoard[2][0] != 'X' && gameBoard[0][0] != 'O'){
                    gameBoard[2][0] = 'O';
                    turn = false;
                };
                break;
                case 5: 
                if (gameBoard[2][2] != 'X' && gameBoard[0][0] != 'O'){
                    gameBoard[2][2] = 'O';
                    turn = false;
                };
                break;
                case 6: 
                if (gameBoard[2][4] != 'X' && gameBoard[0][0] != 'O'){
                    gameBoard[2][4] = 'O';
                    turn = false;
                };
                break;
                case 7: 
                if (gameBoard[4][0] != 'X' && gameBoard[0][0] != 'O'){
                    gameBoard[4][0] = 'O';
                    turn = false;
                };
                break;
                case 8: 
                if (gameBoard[4][2] != 'X' && gameBoard[0][0] != 'O'){
                    gameBoard[4][2] = 'O';
                    turn = false;
                };
                break;
                case 9: 
                if (gameBoard[4][4] != 'X' && gameBoard[0][0] != 'O'){
                    gameBoard[4][4] = 'O';
                    turn = false;
                };
                break;
                default:
                    break;
            }

    }

        printBoard(gameBoard);

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


    // Winner annoucement 
    private void winner(){
        System.out.println("Congratulation! You Won!");
        startGame = false;
    }

    // Loser announcement 
    private void loser(){
        System.out.println("Too bad! You lost");
        startGame = false;
    }


    // Check for winner/loser/tie 
    private void checkStatus(char[][] gameBoard){

        // Using for loop check for player or computer winning conditions across the board 
        for (int i =0; i < gameBoard.length; i+=2 ){
            if (gameBoard[i][0] == 'X' && gameBoard[i][2] == 'X' && gameBoard[i][4] == 'X'){
                winner(); // player won 
                } else if (gameBoard[i][0] == 'O' && gameBoard[i][2] == 'O' && gameBoard[i][4] == 'O'){
                    loser(); // player loss 
                }
          }

        // Using for loop check for player or computer winning/losing condition vertically
        for (int i=0; i <gameBoard[0].length; i+= 2){
             if (gameBoard[0][i] == 'X' && gameBoard[2][i] == 'X' && gameBoard[4][i] == 'X'){
                winner();
            } else if (gameBoard[0][i] == 'O' && gameBoard[2][i] == 'O' && gameBoard[4][i] == 'O'){
                loser();
            }
        }

        //Manually check for diagonal win conditions using if else statements 
        if (gameBoard[0][0] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][4] == 'X'){
            winner();
        } else if (gameBoard[0][0] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][4] == 'O'){
            loser();
        } else if (gameBoard[0][4] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][0] == 'X'){
            winner();
        }else if(gameBoard[0][4] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][0] == 'O'){
            loser();
        }

    }


    


    public static void main(String[] args) {

        // Launch game 
        gameTitle();
        
        // Create game object 
        TicTacToe game = new TicTacToe();


        // Initialise gameboard as global variable 
        char[][] gameBoard = {{' ','|',' ','|',' '},
                              {'-','+','-','+','-'},
                              {' ','|',' ','|',' '},
                              {'-','+','-','+','-'},
                              {' ','|',' ','|',' '},
                            };

        printBoard(gameBoard); 

                       
        
        
        //While loop to run game logic and player turns 

        while (startGame){

    
             

            game.printPlayerChoice(gameBoard);
            game.checkStatus(gameBoard);
            if (startGame == false){
                break;
            } 
            printComputerChoice(gameBoard);
            game.checkStatus(gameBoard);


        }        
        
    }


}



