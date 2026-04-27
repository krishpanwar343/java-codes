import java.util.Arrays;

public class DataOps {
    public static void main(String[] args) {
        int[] original = {10, 5, 20, 8, 15};
        int[] copy = Arrays.copyOf(original, original.length);
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : original) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
    }
}
