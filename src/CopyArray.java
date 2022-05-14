import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CopyArray {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("input array size(20): ");
        int[] source = new int[Integer.parseInt(READER.readLine())];
        System.out.println("input array elements: ");
        for (int i = 0; i < source.length; i++) {
            source[i] = Integer.parseInt(READER.readLine());
        }
        int[] destination1 = null;
        int[] destination2 = null;
        System.out.println("Source array = " + Arrays.toString(source));

        destination1 = copyFirstTenFieldsOfArray(source);
        System.out.println("Copy the first 10 elements of the array, if they are present. Destination array 1 = " + Arrays.toString(destination1));
        destination2 = copyLastTenFieldsOfArray(source);
        System.out.println("Copy the last 10 elements of the array. Destination array 2 = " + Arrays.toString(destination2));

    }

    private static int[] copyFirstTenFieldsOfArray(int[] source) {
        int[] temp = new int[0];
        if (source.length > 10) {
            temp = new int[10];
            System.arraycopy(source, 0, temp, 0, 10);
        }
        return temp;
    }
    private static int[] copyLastTenFieldsOfArray(int[] source) {

        return Arrays.copyOfRange(source, source.length-10, source.length);
    }
}