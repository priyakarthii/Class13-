public class StringIndexExample
{
    public static void main(String[] args) {
        String text = "Hello, world!";

        // Trying to access a character at an index that is out of bounds
        int index = 15;
        try {
            char character = text.charAt(index);
            System.out.println("Character at index " + index + ": " + character);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: String index out of bounds.");
        }
    }
}