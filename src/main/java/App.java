import java.util.Scanner;

public class App {
    public static void main(String [] args){

        System.out.println("Please enter a name to check if it is a palindrome: ");
        Scanner scanner = new Scanner(System.in);
        String inputtedName = scanner.nextLine();   //collect user input

        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(inputtedName)); // check if collected string is a palindrome

    }
}
