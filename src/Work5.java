import java.util.Scanner;

public class Work5 {

    public static void main(String[] args) {
        calculateBMI();
    }

    public static void calculateBMI() {
        System.out.print("Please enter your weight in kg: ");
        Scanner s = new Scanner(System.in);
        float weight = s.nextFloat();
        System.out.print("Please enter your height in cm: ");
        float height = s.nextFloat();

        float bmi = (100*100*weight)/(height*height);

        System.out.println("Your BMI is: "+bmi);
        printBMICategory(bmi);

    }

    public static void printBMICategory(float bmi) {
        if(bmi < 18.5) {
            System.out.println("You rock ! ");
        }else if (bmi < 25) {
            System.out.println("More training !");
        }else if (bmi < 30) {
            System.out.println("Less eating ! ");
        }else {
            System.out.println("You are obese");
        }
    }
}