public class DiamondArray{
      public static void main(String[] args){
      
            char [][] drawing = new char [9][9];
            
            for(int row = 0; row < drawing.length; row++){
                  for(int column = 0; column < drawing.length; column++){
                        drawing[row][column] = ' ';
                  }
            }

            int starColumn;
            int numberOfStar;
            for(int row = 0; row < drawing.length; row++){
                  starColumn = Math.abs(4 - row);
                  numberOfStar = 9 - (2 * starColumn);
                  int endColumn = starColumn + numberOfStar - 1;
                  
                  for(int column = 0; column < drawing.length; column++){
                        if(column >= starColumn && column <= endColumn){
                              drawing[row][column] = '*';
                        }
                  }
            }
            for(int row = 0; row < drawing.length; row++){
                  for(int column = 0; column < drawing.length; column++){
                        System.out.print(drawing[row][column]);
                  }
                  System.out.println();
            }
      }
}

