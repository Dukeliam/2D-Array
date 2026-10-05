import java.util.Scanner;

public class AsciiArt{
      public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            
            
            System.out.print("Enter drawing character: ");            
            char drawingCharacter = input.next().charAt(0);
            char [][]drawing = new char[7][9];
            
            for(int row = 0; row < drawing.length; row++){
                  for(int column = 0; column < drawing[row].length; column++){
                        drawing[row][column] = drawingCharacter;
                  }
            }
      }
}
