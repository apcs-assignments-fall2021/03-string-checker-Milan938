import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int a = str.indexOf("a");
        int b = str.indexOf("b");
        int c = str.indexOf("c");
        int total = 0;
        if (a > -1) {
            total = total +1;
        }
        if (b > -1) {
            total = total +1;
        }
        if (c > -1) {
            total = total +1;
        }
        System.out.print("There are " + total + " a's, b's, or c's");
        return -1;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        int a = str.indexOf("The");
        int b = str.indexOf("the");
        if (a > -1) {
            return true;
        }
        if (b > -1) {
            return true;
        }
        else {
            return false;
        }
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        // REPLACE WITH YOUR CODEE
        return false;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // YOUR CODE HERE
    }
}
