import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        annualInterestRate();
    }
    public static void annualInterestRate( ){
        Scanner scanner = new Scanner(System.in);
        double investment;
        System.out.println("Enter the amount of the investment :");
        investment = scanner.nextDouble();
        double interestRate;
        System.out.println("Enter the interest rate :");
        interestRate = scanner.nextDouble();
        int year;
        System.out.println("Enter the number of years :");
        year = scanner.nextInt();
        double  result = investment *(Math.pow((1 + interestRate / 100), year));
        double onlyInterest = result - investment;
        System.out.printf("The future value amount is %.2f",result);
        System.out.println();
        System.out.printf("Only interest is %.2f ",onlyInterest);
        System.out.println();




    }
    }

