package Test_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class getDictionary {

    public static Set<String> getDict() throws FileNotFoundException {
        Set<String> set = new HashSet<>();
        File file = new File("Dictionary.txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNext()) {
            set.add(scan.next().toLowerCase());
        }
        return set;

    }
}
