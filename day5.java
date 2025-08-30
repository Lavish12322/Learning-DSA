
import java.util.Scanner;
// print even number till n
/*public class day5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0){
               System.out.println(i);
            }
        }
    
    }
}*/


//infinite loop
/*public  class day5{
    public static void main(String[] args) {
        for(; ;) { 
                System.out.println("Apna College"); 

        }
    }
}*/



// to check marks
/*public class day5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int Marks = sc.nextInt();


        if (n1 == 1){
            if (Marks>=90) {
                System.out.println("This is Good");
            }
            else if (Marks <= 89 && Marks >= 60){
                System.out.println("This is also Good");
            }
            else if (Marks <= 59 && Marks >= 0){
                System.out.println("This is Good as well");
            }
        } else {
            System.out.println("Program stop");
        }
    }
}*/




// Check marks after taking input by user to run or not by do while loop 
/*public class day5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;


        do { 
            System.out.println("Enter 1 to run and 0 to end");
             n1 = sc.nextInt();
            if (n1 == 0) {
                System.out.println("Program end");
                break;
            }
            else if (n1 == 1){
                System.out.println("Enter marks: ");
            }
            int Marks = sc.nextInt();
            if (Marks <= 100 && Marks>=90) {
                System.out.println("This is Good");
            }
            else if (Marks <= 89 && Marks >= 60){
                System.out.println("This is also Good");
            }
            else if (Marks <= 59 && Marks >= 0){
                System.out.println("This is Good as well");
            }
            else {
                System.out.println("Invalid Marks");
            }
        } while (n1 != 0);
    }
}*/







            



