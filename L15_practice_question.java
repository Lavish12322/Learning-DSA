import java.util.Scanner;




// Program to find if a number is a power of 2 or not
/*public class L15_practice_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();


        if (n <= 0){
           System.out.println("Enter valid number");

        } else if (n >0 && (n & (n-1)) == 0) {
           System.out.println(n+" is power of 2");
        }else {
            System.out.println(n+" is not power of 2");            
        }


    }
}*/





// Program to toggle a bit a position = “pos” in a number “n”
/*public class L15_practice_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input number
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        // input bit position
        System.out.println("Enter the position of bit: ");
        int pos = sc.nextInt();
        int bitMask = 1<<pos;

        // toggle bit 
        int result = n ^ (bitMask);
        System.out.println("Original number: "+n);
        System.out.println("Number after toggle is: "+result);

    }
}*/





//Program to count the number of 1’s in a binary representation of the number.
/*public class L15_practice_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input number
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int count = 0;

        while (n>0){
            n = n & (n-1);
            count++;
        }

        System.out.println(count);
    }
}*/
















