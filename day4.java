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



  public class day4{
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
  }



