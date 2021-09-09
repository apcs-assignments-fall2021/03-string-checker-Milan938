import java.util.Scanner;

public class MyMain {

    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            int a_count = 0;
            int b_count = 0;
            int c_count = 0;
            if (str.charAt(i) == ('a')) {
                a_count = a_count + 1;
            }
            if (str.charAt(i) == ('b')) {
                b_count = b_count + 1;
            }
            if (str.charAt(i) == ('c')) {
                c_count = c_count + 1;
            }
            System.out.print("There are " + a_count + b_count + c_count + " a's, b's, or c's");
            return -1;
        }
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
        } else {
            return false;
        }
    }

    //Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        int length = str.length() - 1;
        for (int i = 0; i <= str.length(); i++) {

        }
    }




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(countABC("hamster"));
    }
}

        // YOUR CODE HERE


