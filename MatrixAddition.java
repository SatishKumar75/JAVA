

public class MatrixAddition { 
  
    public static void main(String[] args) { 
        int rows, columns; 
  
        // Initializing two matrices 
        int[][] a = { { 1, 2, 3 }, 
                      { 4, 5, 6 }, 
                      { 7, 8, 9 } }; 
  
        int[][] b = { { 9, 8, 7 }, 
                      { 6, 5, 4 }, 
                      { 3, 2, 1 } }; 

        rows = a.length; 
        columns = a[0].length;

        // Adding Two matrices 
        int[][] c = new int[rows][columns]; 

        for(int i = 0; i < rows; i++) { 

            for (int j = 0; j < columns; j++) {

                c[i][j] = a[i][j] + b[i][j];  

            }

        }

        // Displaying the result 

        System.out.println("Sum of two matrices is: ");

        for(int[] row : c) {

            for (int column : row) {

                System.out.print(column + "    ");

            }  

            System.out.println();  

       }  

    }  
}