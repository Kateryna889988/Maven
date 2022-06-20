package andersen.lesson8;
import java.util.ArrayList;
import java.util.HashSet;

import static andersen.lesson8.CountWords.countDuplicatesAndPrint;


public class HomeWorkApp {
    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<>();
        word.add("Aries");
        word.add("Aries");
        word.add("Taurus");
        word.add("Gemini");
        word.add("Cancer");
        word.add("Leo");
        word.add("Virgo");
        word.add("Libra");
        word.add("Scorpio");
        word.add("Scorpio");

        System.out.println("Created array: " + word);

        HashSet<String> uniqueSet = new HashSet<String>();
        uniqueSet.addAll(word);
        System.out.println("Created array with no duplicate elements: " + uniqueSet);

        String targetValue = "Aries";
        String targetValue0 = "Taurus";
        String targetValue1 = "Gemini";
        String targetValue2 = "Cancer";
        String targetValue3 = "Leo";
        String targetValue4 = "Virgo";
        String targetValue5 = "Libra";
        String targetValue6 = "Scorpio";
        countDuplicatesAndPrint(word, targetValue);
        countDuplicatesAndPrint(word, targetValue0);
        countDuplicatesAndPrint(word, targetValue1);
        countDuplicatesAndPrint(word, targetValue2);
        countDuplicatesAndPrint(word, targetValue3);
        countDuplicatesAndPrint(word, targetValue4);
        countDuplicatesAndPrint(word, targetValue5);
        countDuplicatesAndPrint(word, targetValue6);

        Phonebook surnamePhoneNumber = new Phonebook();
        surnamePhoneNumber.add("Williams", "09759565653");
        surnamePhoneNumber.add("Williams", "09659585653");
        surnamePhoneNumber.add("Peters", "09559565653");
        surnamePhoneNumber.add("Gibson", "09459565653");
        surnamePhoneNumber.add("Martin", "09359565653");
        surnamePhoneNumber.add("Jordan", "09259565653");
        surnamePhoneNumber.add("Jackson", "09159565653");
        surnamePhoneNumber.add("Grant", "09059565653");
        surnamePhoneNumber.add("Grant", "09959586653");
        surnamePhoneNumber.add("Davis", "01059565653");

        System.out.println(surnamePhoneNumber.get("Williams"));
    }
}











