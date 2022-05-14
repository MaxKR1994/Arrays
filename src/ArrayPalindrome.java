import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayPalindrome {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[]) throws IOException {
        System.out.println("Enter a word ");
        String s = READER.readLine();
        char[] myArray = s.toCharArray();
        int size = myArray.length;
        char [] original = Arrays.copyOf(myArray,myArray.length);

        for (int i = 0; i < size / 2; i++) {
            char temp = myArray[i];
            myArray[i] = myArray[size-i-1];
            myArray[size-i-1] = temp;
        }
        System.out.println("Original Array"+Arrays.toString(original));
        System.out.println("Reverse Array"+Arrays.toString(myArray));

        if(Arrays.equals(myArray, original)) {
            System.out.println("Entered string is a palindrome");
        } else {
            System.out.println("Entered string is not a palindrome");
        }
    }
}
