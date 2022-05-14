import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class IncreasingArray {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        System.out.println("input array size: ");
        int [] numbers = new int[Integer.parseInt(READER.readLine())];
        System.out.println("input array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(READER.readLine());
        }
        System.out.println(Arrays.toString(numbers));

        boolean flag = true;
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i]<=numbers[i-1]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("The array is a strictly increasing sequence");
        } else {
            System.out.println("The array is not a strictly increasing sequence");
        }
    }
}
