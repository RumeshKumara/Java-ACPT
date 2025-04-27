import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.print("Enter a second number: ");
        int secondNumber = scanner.nextInt();

        // Example of ArithmeticException
        try {
            System.out.println("Answers: " + (number / secondNumber));
        }catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero");
        }
        System.out.println("The program continues to run");

        // Example of ArrayIndexOutOfBoundsException
        int[] arr = new int[10];

        try {
            arr[14] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }

        // Example of NumberFormatException
        String name = "aaaa";
        try {
            int num = Integer.parseInt(name);
        } catch (NumberFormatException e) {
            System.out.println("String index out of bounds");
        }

        // Example of NullPointerException
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception");
        }

        // Example of NullPointerException with a custom class
        Student student = new Student();
        student = null;
        try {
            student.display();
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception");
        }

        // Example of FileNotFoundException
        File file = new File("digudasa.mp3");
        FileReader reader = new  FileReader(file);

        try {
            String str = null;
            System.out.println(str.length()); // Throws NullPointerException
            int result = 10 / 0; // Throws ArithmeticException
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}