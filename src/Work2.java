import java.util.Scanner;
public class Work2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text and number or other if want : ");
        String text = scanner.next();
        System.out.println("Text is : \n"+text);
        count(text);

    }
    public static void count(String x){
        char[] ch = x.toCharArray();
        int letter = 0;
        int num = 0;

        for(int i = 0; i < x.length(); i++){
            if(Character.isLetter(ch[i])){
                letter ++ ;

            }
            else if(Character.isDigit(ch[i])){
                num ++ ;
            }
        }
        int total = letter+num;

        System.out.println("Letter: " + letter);
        System.out.println("Number: " + num);
        System.out.println("Total symbol is : " +total);
    }
}