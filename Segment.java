import java.util.Scanner;

public class Segment{
      public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
      String again;
      
      do{
            System.out.print("Enter a 8-bit binary number: ");
            String binary = input.nextLine();
            
            while(binary.length() != 8 || !binary.matches("[01]{8}")){
            
                  System.out.print("Invalid input, Enter exactly 8 bits: ");
                  binary = input.nextLine();
            }
            
            char display [][] = new char[5][4];
            
            for(int row = 0; row < display.length; row++){
                  for(int column = 0; column < display[row].length; column++){
                        display[row][column] = ' ';
                  }
            }

            if(binary.charAt(7) == '1'){
                  for(int column = 0; column < display[0].length; column++){
                        display[0][column] = '#';
                  }
            }
            
            if(binary.charAt(6) == '1'){
                  display[1][3] = '#';
            }
            
            if(binary.charAt(5) == '1'){
                  display[3][3] = '#';
            }
            
            if(binary.charAt(4) == '1'){
                  for(int column = 0; column < display[4].length; column++){
                        display[4][column] = '#';
                  }
            }
            
            if(binary.charAt(3) == '1'){
                  display[3][0] = '#';
            }
            
            if(binary.charAt(2) == '1'){
                  display[1][0] = '#';
            }
            
            if(binary.charAt(1) == '1'){
                  for(int column = 0; column < display[2].length; column++){
                        display[2][column] = '#';
                  }
            }
            
            for(int row = 0; row < display.length; row++){
                  for(int column = 0; column < display[row].length; column++){
                        System.out.print(display[row][column]);
                  }
                  System.out.println();
            }
            
            System.out.print("Convert another number? (yes/no): ");
            again = input.nextLine();
            
      } while(again.equalsIgnoreCase("yes"));     
      
      }
}
