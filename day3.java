
import java.util.Scanner;




/*public class day3{
    public static void main(String[] args) {
    // counter ++ = increment
        for (int i = 0; i < 5; i++) {
        System.out.println("Hello World");
        }
    }
}*/


/*public class day3{
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
        System.out.print(i+" ");
        //i+" " used for print in horizontal line
        }
    }
}*/



/*public class day3{
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
        System.out.println(i);
        }
    }
}*/



//  public class day3{
//     public static void main(String[] args) {
//         int i = 0;
//         while(i <= 10) {
//         System.out.println(i);
//         i++;
//         }
//     }
//}


 /* public class day3{
    public static void main(String[] args) {
        int i = 0;
        do { 
            System.out.println(i);
            i++;
        } while(i<=10);
        
    }
}*/


/*public class day3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
         System.out.println(sum);
    }
            
}*/


public class day3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of table: ");
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int product = number * i;
            System.out.println(number + " * " + i + " = " + product);
            
        }
    }
}
