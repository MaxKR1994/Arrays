import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        System.out.println("Write a string!");
        System.out.println(isPalindrome(READER.readLine()));
    }
    public static boolean isPalindrome(String string) {
        String palindrome = string.toUpperCase().replaceAll("[^A-Za-z]", "");
        StringBuffer reversePalindrome = new StringBuffer(palindrome).reverse();
        boolean answer = true;
        for (int i = 0; i < palindrome.length(); i++) {
            if (palindrome.charAt(i) != reversePalindrome.charAt(i)) {
                answer = false;
                break;
            }

        }
        System.out.println("Its palindrome?");
        return answer;
    }
}