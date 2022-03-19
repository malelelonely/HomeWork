import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        double number = scanner.nextInt();
        System.out.println();
        number = (double) Math.sqrt(number);
        System.out.printf("Your sqrt number is : %.5f ",number);
        System.out.println();

    }
}
