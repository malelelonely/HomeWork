import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {

        month();
    }
    public static void month(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to see the month of the year 1 - 12 : ");
        int month = scanner.nextInt();
        switch (month){
            case 1 -> System.out.println(month+" - January !");
            case 2 -> System.out.println(month+" - February !");
            case 3 -> System.out.println(month+" - March !");
            case 4 -> System.out.println(month+" - April !");
            case 5 -> System.out.println(month+" - May !");
            case 6 -> System.out.println(month+" - June !");
            case 7 -> System.out.println(month+" - July !");
            case 8 -> System.out.println(month+" - August !");
            case 9 -> System.out.println(month+" - September !");
            case 10 -> System.out.println(month+" - October !");
            case 11 -> System.out.println(month+" - November !");
            case 12 -> System.out.println(month+" - December !");
            default -> System.out.println("Invalid !");

        }
    }
}
