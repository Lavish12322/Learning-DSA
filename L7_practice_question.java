
import java.util.Scanner;


/*public class L7_practice_question {
    public static boolean IsPrime(int n) {
        

        if (n <=1 ){
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n%i==0){
            return false;
            }
        }
        return true;  
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (IsPrime(n)) {
            System.out.println(n +" is prime");
        }
        else {
            System.out.println(n +" is not prime");
        }

    }
}*/


// Check Even Number
/*public class L7_practice_question{
    public static boolean  IsEven(int n) {
        
        if (n % 2 == 0) {
            return true;
        }
        else {
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (IsEven(n)) {
            System.out.println(n + " is even number");
        } else {
            System.out.println(n + " is not even number");
        }
    }
}*/



// print Table for n number
/*public class L7_practice_question{
     public static void printTable(int n) {

        for (int i = 1; i <= 10; i++){
            System.out.println(n +" * "+ i + " = " + n*i);
        }
     }
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printTable(n);
     }
}*/




   
// Average of three numbers
/*public class L7_practice_question{
    public static float Average(int a, int b,int c) {
        return (a+b+c)/3.0f;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        float avg = Average(a, b, c);
        System.out.println("Average is : "+avg);
    }
}*/




// sum of all odd num to n
/*public class L7_practice_question{
    public static int SumOfOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n;i++) {
            if (i % 2 == 1){
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); 
        System.out.println("Sum of odd number up to "+n+" is "+SumOfOdd(n));
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }
}*/



// Greatest of Two Number 
/*public class L7_practice_question{
    public static void GreatestOfTwo(int a, int b) {
        if (a>b){
            System.out.println("A is greatest number");
        } else {
            System.out.println("B is gretest number");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = input.nextInt();
        System.out.println("Enter b: ");
        int b = input.nextInt();
        GreatestOfTwo(a, b);
        
    }
}*/



// Circumference of Circle
/*public class L7_practice_question{
    public static float circumferenceOfCircle(int a) {

        return 2*3.14f*a;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int a = input.nextInt();
        float cir = circumferenceOfCircle(a);
        System.out.println("Circumference of Circle is : "+cir);
    }

}*/



public class L7_practice_question{
    public static void AgeForVote(int n) {
        
        if (n <= 120 && n >= 18){
            System.out.println("Eligible For Vote");
            }
        else if (n > 120 || n <= 0){
            System.out.println("Invalid age");
            }
        else {
            System.out.println("Not Eligible For Vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        AgeForVote(n);
    }
}