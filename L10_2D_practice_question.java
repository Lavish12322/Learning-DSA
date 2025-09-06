import java.util.Scanner;



// spiral order matrix
/*public class L10_practice_question {
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
public class L10_2D_practice_question {
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
}
