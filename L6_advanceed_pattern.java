



// Butterfly Pattern
/*public class L6_advanceed_pattern {
    public static void main(String[] args) {
        int n = 5;
        
        
        // Upper half
        for (int i = 1; i <= n; i++) {
            //1st part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");    
            }

            //Spaces
            int spaces = 2*(n-i);
            for (int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }

            //2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();    
        }


        //Lower half
        for (int i = n; i >= 1; i--) {
            //1st part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");    
            }

            //Spaces
            int spaces = 2*(n-i);
            for (int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }

            //2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();    
        }


    }
}*/




//Solid Rhombus
/*public class L6_advanceed_pattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            //spaces 
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            //print stars
            for (int j = 1; j <= 5; j++){
               System.out.print("*");
        }
        System.out.println();
        }
    }
}*/



// Number pyramid
/*public  class L6_advanceed_pattern{
    public static void main(String[] args) {
        int n= 5;

        for (int i = 1; i <= n; i++){
            //spaces
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            //numbers
            for (int j = 1; j <= i; j++){
                System.out.print(i+" ");
            }

            System.out.println();
        }
    }
}*/




//Palindrome Pattern
/*public  class L6_advanceed_pattern{
    public static void main(String[] args) {
        int n= 5;

        for (int i = 1; i <= n; i++){
            //spaces
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            //1st half numbers
            for (int j = i; j >= 1; j--){
                System.out.print(j);
            }
            //2nd half
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}*/




//Diamond pattern
public  class L6_advanceed_pattern{
    public static void main(String[] args) {
        int n= 4;

        //Upper 1st part
        for (int i = 1; i <= n; i++){
            //spaces
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            //1st upper half numbers
            for (int j = i; j >= 1; j--){
                System.out.print("*");
            }

            //Upper 2nd part
            for (int j = 2; j >= n-i; j--){
                System.out.print("*");
            }
            System.out.println();
            }


            //lower half
            for (int i = n; i >= 1; i--){
            //spaces
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            //1st lower half numbers
            for (int j = i; j >= 1; j--){
                System.out.print("*");
            }

            //lower 2nd part
            for (int j = 2; j >= n-i; j--){
                System.out.print("*");
            }
            System.out.println();
            }
        }
    }


