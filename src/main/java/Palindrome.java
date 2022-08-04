public class Palindrome {

    //first get string input and reverse the string
    //check if reversed string equals original sting, return true if palindrome.
    public boolean isPalindrome(String original){
        //initialise empty string variable to store the reversed string
        String reversed = "";

        for (int i=original.length()-1; i>=0; i--){
            reversed = reversed + original.charAt(i);
        }

        if (original.equals(reversed)){
            return true;
        } else {
            return false;
        }
    }
}
