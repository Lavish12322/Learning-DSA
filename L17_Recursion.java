


/*public class L17_Recursion {
    // Recursive function
    public static void printNumber(int n) {
        if (n==0){          // base case: stop when n reaches 0
            return;
        }
        System.out.println(n);  // print current number
        printNumber(n-1);       // recursive call with n-1
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // input number
        printNumber(n);         // call recursive function
    }
}*/





// Print number 1 to 5
/*public class L17_Recursion {
    public static void printNumber(int n) {
        if (n == 6) {        // base case: stop when n becomes 6
            return;          // exit recursion
        }
       
        System.out.println(n);  // print the current number
        printNumber(n + 1);     // recursive call with next number
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create Scanner for input
        int n = sc.nextInt();                // take integer input from user
        printNumber(n);                      // start recursion with user input
    }
}*/




// Print sum of n number
/*public class L17_Recursion {
    public static void calculateSum(int i,int n,int sum) {
        if(i == n){              // base case: when i reaches n
            sum += i;            // add the last number
            System.out.println(sum);  // print the final sum
            return;              // end recursion
        }
        sum += i;                // add current number to sum
        calculateSum(i+1, n, sum);  // recursive call with next i
        System.out.println(i);
    }
    
    public static void main(String[] args) {
        calculateSum(1, 5, 0);   // start with i=1, n=5, sum=0
    }
}*/




// calculate factorial to n number
/*public class L17_Recursion{
    public static int calFactorial(int n) {
        if(n == 1 || n == 0){
            return 1;
        }
        
        int fact_nm1 = calFactorial(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;

        
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = calFactorial(n);
        System.out.println(ans);
    }
}*/




// Print Fibonacci series till n
public class L17_Recursion{
    public static void printFIb(int a, int b, int n) {
        if(n == 0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFIb(b, c, n-1);
    }

    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        printFIb(a, b, n-2);
    }
}