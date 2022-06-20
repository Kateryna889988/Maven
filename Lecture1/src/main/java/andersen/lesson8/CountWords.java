package andersen.lesson8;

import java.util.ArrayList;
import java.util.Iterator;

public class CountWords {

    public static void countDuplicatesAndPrint(ArrayList<String> word, String targetValue){
        int counter = 0;
        Iterator<String> iter = word.iterator();
        while (iter.hasNext()) {
            String st = iter.next();
            if (st.equals(targetValue)) {
                counter++;
                iter.remove();
            }
        }

        System.out.println("Word: " + targetValue + " written " + counter + " number of times");
    }
}
