import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        triangle();


    }
    public static void triangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter digit for: ");
        System.out.print("X = ");
        int x = scanner.nextInt();
        System.out.print("Y = ");
        int y = scanner.nextInt();
        System.out.print("Z = ");
        int z = scanner.nextInt();

        if(x == y && x == z && z == y){
            System.out.println("You have equilateral triangle !");
        }
        else if(x == y || x == z || z == y){
            System.out.println("You have isosceles triangle !");
        }
        else{
            System.out.println("You have a multifaceted triangle !");
        }
    }
}
