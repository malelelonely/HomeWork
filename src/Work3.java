import java.util.Scanner;

public class Work3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to square :\n");
        double number = scanner.nextDouble();
        double result = Math.sqrt(number);
        System.out.printf("Square root is : %.5f",result);
    }
}
