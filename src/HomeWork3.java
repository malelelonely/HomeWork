import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        evenOrOddNumber();

    }
    public static void evenOrOddNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = scanner.nextInt();

        if(number %2 ==0){
            System.out.println("The number is even !");
        }
        else{
            System.out.println("The numbers is odd !");
        }
    }
}
