

/*public class L9_2D_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your name is : "+name);

    }
    
}*/





// concatenation means adding two string
/*public class L9_2D_Arrays {
    public static void main(String[] args) {
        
        String firstName = "Lavish";
        String lastName = "Sisodia";
        String fullName = firstName +" "+ lastName;
        System.out.println(fullName);
    }
}*/





// print length of array 
/*public class L9_2D_Arrays {
    public static void main(String[] args) {
        
        String firstName = "Lavish";
        String lastName = "Sisodia";
        String fullName = firstName +" "+ lastName;
        System.out.println(fullName.length());
    }
}*/





// charAt() means print every single character of string
/*public class L9_2D_Arrays {
    public static void main(String[] args) {
        
        String firstName = "Lavish";
        String lastName = "Sisodia";
        String fullName = firstName +" "+ lastName;


        for (int i = 0; i < fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
    }
}*/




// use of compareTo
/*public class L9_2D_Arrays {
    public static void main(String[] args) {
        
        String name1 = "Lavish";
        String name2 = "Sisodia";
        // we don't use "==" because it fails sometimes

        // comapreTo means to compare two strings
        // it compare into thtree parts
        // s1 > s2 +ve
        // s1 = s2 o
        // s1 < s2 -ve
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}*/





// use substring() means a smaller sequence of characters taken from the original string
public class L9_String {
    public static void main(String[] args) {
        
        String sentence = "My name is Lavish Sisodia";
        String name = sentence.substring(11, sentence.length());

        System.out.println(name);
    }
}





