
// import java.util.Scanner;


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






