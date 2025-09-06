
import java.util.Scanner;


// print matrix
/*public class L10_2D_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][] numbers = new int[rows][cols];
        
        // input
        for(int i = 0; i < rows; i++){

            // columns
            for(int j = 0; j < cols; j++){
                numbers[i][j]  = sc.nextInt();
            }
        }

        // output
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}*/






// finding number from matrix
/*public class L10_2D_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][] numbers = new int[rows][cols];
        
        // input
        // rows
        for(int i = 0; i < rows; i++) {
            // columns
            for(int j = 0; j < cols; j++) {
                numbers[i][j]  = sc.nextInt();
            }
        }

        // finding number
        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // compare with x
                if(numbers[i][j] == x) {
                    System.out.println("X is found at locations (" + i + ", " + j + ")");
                }
            }
        }
    }
}*/






// homework of L10_2D_Arrays
// spiral order matrix
/*public class L10_2D_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] matrix = new int[n][m];

        for(int i = 0; i < n; i++) {
            // columns
            for(int j = 0; j < m; j++) {
                matrix[i][j]  = sc.nextInt();
            }
        }


        System.out.println("Spiral order matrix is : ");

        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;


        // print spiral order matrix
        while(rowStart <= rowEnd && colStart <= colEnd) {
            for (int j = colStart; j <= colEnd; j++){
                System.out.print(matrix[rowStart][j] + " ");
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.print(matrix[i][colEnd] + " ");
            }
            colEnd--;

            for (int j = colEnd; j >= colStart; j--){
                System.out.print(matrix[rowEnd][j]+ " ");
            }
            rowEnd--;

            for (int i = rowEnd; i >= rowStart; i--){
                System.out.print(matrix[i][colStart]+" ");
            }
            colStart++;


            System.out.println();
        }
    }
}*/





// Transpose of matrix
/*public class L10_2D_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] matrix = new int[n][m];

        for(int i = 0; i < n; i++) {
            // columns
            for(int j = 0; j < m; j++) {
                matrix[i][j]  = sc.nextInt();
            }
        }

        System.out.println("The transpose is: ");

        // To print transpose
        for (int j = 0; j < m; j++){
            for (int i = 0; i < n; i++){
                System.out.print(matrix[i][j]+" ");
            }
        }

        System.out.println();
    }
}*/

