import java.util.Scanner;

public class TicTacToe{
      public static void main(String[] args){
            Scanner input = new Scanner(System.in);
      
         char letters[][] = new char [3] [3];
         char letter = ' ';
         for(int rows = 0; rows < 3; rows++){
            
                  for(int columns = 0; columns < 3; columns++){
                        letters[rows][columns] = letter;
                  }
            } 

            char board[][] = new char[3][3];
            for(int rows = 0; rows < 3; rows++){
                  for(int columns = 0; columns < 3; columns++){
                        int position = rows * 3 + columns + 1;
                              board[rows][columns] = (char) ('0' + position);
                  }
            }
            for(int rows = 0; rows < 3; rows++){
                  for(int columns = 0; columns < 3; columns++){
                        System.out.print(board[rows][columns]);
                        
                        if(columns < 2){
                              System.out.print(" | ");
                        }
                  }
                   System.out.println();
                   
                   if (rows < 2){
                        System.out.println("--+---+--");;
                  }

            }
            char player = 'X';
            boolean isWinner = false;
            for(int place = 0; place < 9; place++){
            
            if(player == 'X'){
                  System.out.println("Player 1 is your turn");
            }
            else{
                  System.out.println("Player 2 is your turn");
            }

            int position;
            int row;
            int column;
            do{
            System.out.print("Enter a number between 1 to 9: ");
            position = input.nextInt();
            
            row = (position - 1) / 3;
            column = (position - 1) % 3;

            if(board[row][column] == 'X' || board[row][column] == 'O'){
                  System.out.println("Position alreay occupied! Try again.");

                  }
            }while (board[row][column] == 'X' || board[row][column] == 'O');

            board[row][column] = player;
            
                  for(int rows = 0; rows < 3; rows++){
                        for(int columns = 0; columns < 3; columns++){
                              System.out.print(board[rows][columns]);
                              if(columns < 2){
                                    System.out.print(" | ");
                              }
                        }

                  if(player == board[0][0] && player == board[0][1] && player == board[0][2]){
                  
                  isWinner = true;
                  }
                  if(player == board[1][0] && player == board[1][1] && player == board[1][2]){
                  
                  isWinner = true;
                  }
                  if(player == board[2][0] && player == board[2][1] && player == board[2][2]){
                  
                  isWinner = true;
                  System.out.println("Player wins");
                  }
                  if(player == board[0][0] && player == board[1][0] && player == board[2][0]){
                  
                  isWinner = true;
                  }
                  if(player == board[0][1] && player == board[1][1] && player == board[2][1]){
                  
                  isWinner = true;
                  }
                  if(player == board[0][2] && player == board[1][2] && player == board[2][2]){
                  
                  isWinner = true;
                  }
                  if(player == board[0][0] && player == board[1][1] && player == board[2][2]){
                  
                  isWinner = true;
                  }
                  if(player == board[0][2] && player == board[1][1] && player == board[2][0]){
                  
                  isWinner = true;
                  }                        
                        
                  System.out.println();
                      if (rows < 2){
                        System.out.println("--+---+--");;
                        }  
                  }
                  if(player == 'X'){
                        player = 'O';
                  }
                  else{
                        player = 'X';
                  }
                  if(isWinner){
                   System.out.println("Player wins");
                        break;
                  }
            }
      }
}
