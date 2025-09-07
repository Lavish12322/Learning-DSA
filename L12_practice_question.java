import java.util.Scanner;




/*public class L12_practice_question {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String array[] = new String[size];
        
        int totLength = 0;
        for (int i = 0; i < size; i++){
            array[i] = sc.nextLine();
            totLength += array[i].length();
        }
        System.out.println();
    }
}*/





/*public class L12_practice_question {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String result = "";

        for (int i = 0; i < name.length(); i++){
            if (name.charAt(i) == 'e'){
            result += 'i';
            }else {
                result += name.charAt(i);
            }
        }
        System.out.println(result);
    }
}*/





public class L12_practice_question {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        String userName = "";

        System.out.println("Your username is : ");
        for (int i = 0; i < email.length(); i++){
            if (email.charAt(i) == '@'){
                break;
            }else {
                userName += email.charAt(i);
            }
        }
        System.out.println(userName);
    }
}


