/*public class L18_Recursion2 {
    public static void towerofHanoi(int n, String src, String helper, String dest) {
        // Base case
        if(n == 1){
            System.out.println("transfer disc "+ n +" from " + src+" to "+ dest);
            return;
        }
        
        // transfer disc n-1 from src to hepler
        towerofHanoi(n-1, src, dest, helper);
        System.out.println("transfer disc "+ n +" from " + src+" to "+ dest);
        
        // transfer disc n-1 from helper to dest
        towerofHanoi(n-1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        towerofHanoi(n, "S", "H", "D");
    }
}*/




/*public class L18_Recursion2 {
    public static void printRev(String str, int idx) {
        // Base case
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        
        System.out.print(str.charAt(idx));
        printRev(str, idx - 1);
    }

    public static void main(String[] args) {
        String str = "abcd";
        printRev(str, str.length()-1);
    }
}*/



public class L18_Recursion2 {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int idx, char element) {
        // Base case
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element){
            if(first == -1){
                first = idx;
            }else {
                last = idx;
            }
        }
        findOccurance(str, idx+1, element);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findOccurance(str, 0, 'a');
    }
}