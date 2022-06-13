package andersen.lesson8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Phonebook {
    private HashMap<String, String> people;
    public Phonebook() {
        this.people = new HashMap<>();
    }

    public void add(String surname, String number) {
        this.people.put(number,  surname);
    }

    public ArrayList<String> get(String surname) {
        ArrayList<String> resultPhones = new ArrayList<>();

        for (Map.Entry<String, String> set :
                people.entrySet()) {
            if (set.getValue().equals(surname)) {
                resultPhones.add(set.getKey());
            }
        }

        return resultPhones;
    }
}

