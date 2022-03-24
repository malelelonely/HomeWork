import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {

        bodyMassIndex();
    }
    public static void bodyMassIndex(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input weight in kilogram: ");
        double weight = scanner.nextDouble();
        System.out.print("\nInput height in meters: ");
        double height = scanner.nextDouble();
        double BMI = weight / (height * height);
        System.out.print("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2\n");
        if(BMI < 18.5){
            System.out.println("You are underweight !");
        }
        else if(BMI >= 18.5 || BMI < 24.9){
            System.out.println("You are normal weight !");
        }
        else {
            System.out.println("You are overweight !");
        }
    }
}
