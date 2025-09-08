import java.util.Scanner;



/*public class L15_BitManipulation {
    public static void main(String[] args) {
         int n = 5; //0101
         int pos = 0;
         int bitMask = 1<<pos;


         if ((bitMask & n) == 0) {
            System.out.println("bit was zero");
         } else {
            System.out.println("bit was one");
         }
    }
}*/




/*public class L15_BitManipulation {
    public static void main(String[] args) {
         int n = 5; //0101
         int pos = 1;
         int bitMask = 1<<pos;


         int newNumber = bitMask | n;
         System.out.println(newNumber);
    }
}*/




/*public class L15_BitManipulation {
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 2;
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);

        
        int newNumber = notBitMask & n;
        System.out.println(newNumber);
        
    }
}*/




public class L15_BitManipulation {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int oper = sc.nextInt();
         int n = 5; //0101
         int pos = 1;

        int bitMask = 1<<pos;
         if (oper == 1) {
            // set per
            int newNumber = bitMask | n;
            System.out.println(newNumber);
         } else {
            // clear oper
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
         }
    }
}