import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        SpringSeason();

    }
    public static void SpringSeason(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month   :");
        int month = scanner.nextInt();
        System.out.println("Enter day : ");
        int day = scanner.nextInt();

        if(month >=3 && month <=6 && day<=20){
            System.out.println("True !");
        }
        else {
            System.out.println("False !");
        }
    }
}
