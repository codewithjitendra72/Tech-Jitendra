public class StringDemo {
    public static void main(String[] args) {
        String s = "Hello World";

        System.out.println("Original String: " + s);
        System.out.println("Length: " + s.length());
        System.out.println("Upper Case: " + s.toUpperCase());
        System.out.println("Lower Case: " + s.toLowerCase());
        System.out.println("Character at index 1: " + s.charAt(1));
        System.out.println("Substring (0 to 5): " + s.substring(0, 5));
        System.out.println("Replace World with Java: " + s.replace("World", "Java"));
        System.out.println("Contains Hello: " + s.contains("Hello"));
        System.out.println("Equals 'Hello World': " + s.equals("Hello World"));
    }
}