/*public class L6_practice_question {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();


       boolean isPrime = true;
       for(int i=2; i<=n/2; i++) {
           if(n % i == 0) {
               isPrime = false;
               break;
           }
       }


       if(isPrime) {
           if(n == 1) {
               System.out.println("This is neither prime not composite");
           } else {
               System.out.println("This is a prime number");
           }
       } else {
           System.out.println("This is not a prime number");
       }
   }   
}*/




//Hollow butterfly
/*public class HollowButterfly {
    public static void main(String[] args) {
        int n = 5;
        
        // Upper half
        for (int i = 1; i <= n; i++) {
            // Left hollow wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                    } else { System.out.print(" ");
                }
            }

            // Middle gap
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right hollow wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else { 
                    System.out.print(" ");
                    }
                }
            System.out.println();
        }
                // lower  half
        for (int i = n; i >= 1; i--) {
            // Left hollow wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                    } else { System.out.print(" ");
                }
            }

            // Middle gap
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right hollow wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else { 
                    System.out.print(" ");
                    }
                }
            System.out.println();
        }
    }
}*/





// Hollow rhombus
/*public class L6_practice_question {
    public static void main(String[] args) {
        int n = 5;
        
       
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
                }

            //Print hollow stars
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}*/





/*public class L6_practice_question {
    public static void main(String[] args) {
        int n = 5;
        
       
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
                }
            // Printing numbers
            int num = 1;
            for (int j = 0; j <= i; j++){
                System.out.print(num+" ");
                num =num *(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}*/




// Half pyramid
/*public class L6_practice_question {
    public static void main(String[] args) {
        int n = 5;
        
       
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n; j++) {
                System.out.print(" ");
                }
            for (int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}*/




// Inverted half pyramid
/*public class L6_practice_question {
    public static void main(String[] args) {
        int n = 4;
        
       
        for (int i = 1; i <= n; i++) {
            // printing numbers
            int cols = n - i + 1;
            for (int j = 1; j <= cols; j++){
                System.out.print(i);
            }
            System.out.println();
            }
        }
    }*/