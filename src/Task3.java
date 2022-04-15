import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find the face of :\n");
        System.out.println("1.Rectangle\n2.Triangle \n3.Circle");
        int choose = scanner.nextInt();


        System.out.println("Enter fist digit :");
        int a = scanner.nextInt();
        System.out.println("Enter second digit :");
        int b = scanner.nextInt();

        rectangle(a,b,choose);

    }
    public static void rectangle(int a , int b,int choose){
        if(choose == 1){
            System.out.println("You choose rectangle !");
            System.out.println("S on rectangle is : \nS = "+a*b);
        }
        else if(choose == 2){
            System.out.println("You choose triangle !");
            System.out.println("S on triangle is :\nS = "+(a+b)/2);
        }
        else{
            System.out.println("You choose circle !");
            System.out.println("S on circle is :\nS = "+3.14 *(Math.pow(2,a)));
        }

    }

}
