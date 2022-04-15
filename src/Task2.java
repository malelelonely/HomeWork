import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text :");
        String text = scanner.next();

        middleSymbol(text);

    }
    public static void middleSymbol(String text){
        if(text.length()%2!=0){
            int midIndex = text.length()/2;
            System.out.printf("The middle symbol is: %c",text.charAt(midIndex));
        } else {
            int midIndex = text.length()/2 -1;
            int secondMidIndex = text.length()/2;
            System.out.printf("The middle symbols are: %c%c",text.charAt(midIndex),text.charAt(secondMidIndex));
        }
    }
    }



