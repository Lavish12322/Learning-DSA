//Nested loop 
//means for loop double time



/*public class day4{
    public static void main(String[] args) {
        
        //Outer loop
        for (int i = 1; i <= 4; i++) {
            //Inner loop
            for (int j = 1; j < 5; j++) {
                System.out.print(" * ");
            }
            System.out.println(" * ");
            
        }
    }
  }*/



  /*public class day4{
    public static void main(String[] args) {
        
        //Outer loop
        for (int i = 1; i <= 4; i++) {
            //Inner loop
            for (int j = 1; j < 5; j++) {
                if (i == 1 || j == 1 || i == 4 || j == 5){
                     System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("*");
            
        }
    }
 }*/


 
 /* public class day4{
    public static void main(String[] args) {
        int n = 4;
        //Outer loop
        for (int i = 1; i <= n; i++) {
            //Inner loop
            for (int j = 1; j <= i; j++) {
     
                     System.out.print("*");
            }
            System.out.println();
        }
    }
}*/


/*public class day4 {
    public static void main(String[] args) {
        int n = 4;
        //outer loop
        for (int i = n; i >= 1; i--){
            //inner loop
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}*/


/*public class day4 {
    public static void main(String[] args) {
        int n = 4;
        //outer loop
        for (int i = 1; i <= n; i++){
            //inner loop
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/



/*public class day4 {

    public static void main(String[] args) {
        int n = 5;
        //outer loop
        for (int i = 1; i <= n; i++){
            //inner loop
            for (int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}*/



/*public class day4 {

    public static void main(String[] args) {
        int n = 6;
        //outer loop
        for (int i = 1; i <= n; i++){
        //inner loop
            for (int j = 1; j <= n-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }   
    }
}*/


/*public class day4 {

    public static void main(String[] args) {
        int n = 5;
        int number = 1;

        //outer loop
        for(int i = 1; i <= n; i++){

            //inner loop
            for(int j = 1; j <= i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();

        }
    }
}*/



public class day4 {
    public static void main(String[] args) {
        int n = 5;

        //outer loop
        for(int i = 1; i <= n; i++){
            //inner loop
            for(int j = 1; j <= i; j++){
                int sum = i+j;
                if(sum % 2 == 0){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
             System.out.println();
        } 
    }
}





