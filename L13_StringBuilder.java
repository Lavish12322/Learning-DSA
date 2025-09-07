


/*public class L13_StringBuilder {
    public static void main(String[] args) {
        // Input
        StringBuilder sb = new StringBuilder("Hunny");
        // output
        System.out.println(sb);
    }
}*/





// charAt use to print char of any index
/*public class L13_StringBuilder {
    public static void main(String[] args) {
        // Input
        StringBuilder sb = new StringBuilder("Hunny");
        // char at index 4
        System.out.println(sb.charAt(4)); 
    }
}*/





// setCharAt use to change value of any index.
/*public class L13_StringBuilder {
    public static void main(String[] args) {
        // Input
        StringBuilder sb = new StringBuilder("Hunny");

        // output
        sb.setCharAt(0,'S');
        System.out.println(sb);
    }
}*/




// insert use to add value at any index
/*public class L13_StringBuilder {
    public static void main(String[] args) {
        // Input
        StringBuilder sb = new StringBuilder("hunny");

        // output
        sb.insert(0,'S');
        System.out.println(sb);
    }
}*/



// delete use to delete any charater (from - to) any index
/*public class L13_StringBuilder {
    public static void main(String[] args) {
        // Input
        StringBuilder sb = new StringBuilder("Hunny");

        // output
        sb.delete(2,3);
        System.out.println(sb);
    }
}*/



// append use to add char at last
/*public class L13_StringBuilder {
    public static void main(String[] args) {
        // Input
        StringBuilder sb = new StringBuilder("H");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");

        // output
        System.out.println(sb);
    }
}*/



// length use to print length of string
/*public class L13_StringBuilder {
    public static void main(String[] args) {
        // Input
        StringBuilder sb = new StringBuilder("H");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");

        // output
        System.out.println(sb.length());
    }
}*/




// print reverse String
public class L13_StringBuilder {
    public static void main(String[] args) {
        // Input
        StringBuilder sb = new StringBuilder("Hello");
        
        for (int i = 0; i < sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        
        }
        System.out.println(sb);
    }
}