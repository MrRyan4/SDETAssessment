package Test_1;

import java.io.FileNotFoundException;
import Test_1.*;


public class Dictionary {

    public boolean isEnglishWord(String word) throws FileNotFoundException {
        return getDictionary.getDict().contains(word);

    }



}
