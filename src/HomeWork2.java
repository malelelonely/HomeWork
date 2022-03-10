import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two digit :");//
        System.out.println();
        System.out.println("First digit : ");
        int a = scanner.nextInt();
        System.out.println("Second digit : ");
        int b = scanner.nextInt();

        int sum = a + b;
        System.out.println("Sum of entered digit is : "+a+" + "+b+" = " + sum);
    }
}
