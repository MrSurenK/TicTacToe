## Tic Tac Toe Command Line Game

1. Create Game Board

   - [x] Using arrays print out a game board.
   - [x] Create gameboard with a static method to make it reusable

2. Turns

   - [x] Import scanner class
   - [ ] Request Player to start game by making the first move
   - [x] Allow computer to make the next move with a timer
   - [ ] If a selected spot if selected again. Reject the move and request player to make a move again
   - [x] Set a timer of 3 sec for AI to make move (Print out AI is thinking during that time)

3. Game Logic

   - [x] Three diagonal or verticle `x` or `o` will be declared winner
   - [] If no winner or loser print out a draw
   - [ ] When game ends ask player if want to play again.
     - If `y`: Refresh gameboard
     - If `n`: end game
   - [x] Spots are numbered from 1 to 9. Link each int to the appropriate spot in 2D array

4. UI

   - [x] Welcome screen on startup
   - [x] Player turn prompts
   - [x] Winner && Loser Annoucement (You Win! / Game Over : ( )

5. Initialise Game object
   - [x] Create 3 states, start game, continue game, end game state
   - [x] Default state, start game == true.
   - [ ] When state is true run methods and game logic
