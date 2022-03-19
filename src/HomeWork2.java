import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = scanner.nextInt();
        if(number %2 ==0){
            System.out.println("Тhe number is even !");
        }
        else {
            System.out.println("Тhe number is odd !");
        }
    }
}
