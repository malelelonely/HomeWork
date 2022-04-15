import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Rammstein - Du hast mich\n");
        myFavouriteSongText1();
        myFavouriteSongText1();
        myFavouriteSongTex2();
        myFavouriteSong3();
        myFavouriteSong4();
        myFavouriteSong3();
        myFavouriteSong4();


    }
    public static void myFavouriteSongText1(){
        String firstCouplet = "Du,\n" +
                "Du hast,\n" +
                "Du hast mich.";
        System.out.println(firstCouplet);
        System.out.println();
    }
    public static void myFavouriteSongTex2(){
        String chorus = "Du...\n" +
                "Du hast...\n" +
                "Du hast mich.\n" +
                "Du hast mich!\n" +
                "Du hast mich gefragt.\n" +
                "Du hast mich gefragt!\n" +
                "Du hast mich gefragt, und ich hab nichts gesagt!\n";

        System.out.println(chorus);
    }
    public static void myFavouriteSong3(){
        String text = "Willst du, bis der Tod euch scheidet,\n" +
                "Treu ihr sein für alle Tage?\n";

        System.out.println(text);
    }
    public static void myFavouriteSong4(){
        String lastCouple = "Nein!\n" +
                "Nein!\n";
        System.out.println(lastCouple);
    }
}
