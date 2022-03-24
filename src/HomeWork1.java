import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        springSeason();

    }
    public static void springSeason(){
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
