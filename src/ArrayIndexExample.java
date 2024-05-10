public class ArrayIndexExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Trying to access an index that is out of bounds
        int index = 10;
        try {
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        }
    }
}
