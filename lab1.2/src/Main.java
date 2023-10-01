import java.util.Arrays;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the count of words:");
        int size = scan.nextInt();
        scan.nextLine();

        Words[] wordArray = new Words[size];
        
        //====================================

        for (int i = 0; i < size; i++) {
            System.out.println("Enter word " + (i + 1) + ":");
            String inputedWord = scan.nextLine();
            int countOfUppercaseLetters = Words.CountChanges(inputedWord, inputedWord.toLowerCase());
            Words word = new Words(inputedWord, countOfUppercaseLetters);
            wordArray[i] = word;
        }

        //==================================

        System.out.println ("Entered words:");
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + " word " + wordArray[i]);
        }

        //==============================
        Arrays.sort(wordArray);


        System.out.println("Sorted words:");

        for (int i = 0; i < size; i++)
        {
            System.out.println(wordArray[i]);
        }



    }
}
