package Test_1;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static Test_1.DictionaryTesting.printEnglishWords;

public class FunctionalTestingCheck {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan =new Scanner(System.in);
        System.out.println("Write word");
        String word = scan.next().toLowerCase();
        Dictionary d =new Dictionary();
        System.out.println(d.isEnglishWord(word));
        printEnglishWords(word);

    }
}
