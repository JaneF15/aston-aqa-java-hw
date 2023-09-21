import java.util.*;

public class Phonebook {
    private Map<String, List<String>> entries;

    public Phonebook() {
        entries = new HashMap<>();
    }

    public Phonebook(Map<String, List<String>> entries) {
        this.entries = entries;
    }

    public void add(String lastName, String phoneNumber) {
        var list = entries.get(lastName);
        if (list != null) {
            list.add(phoneNumber);
            entries.put(lastName, list);
        } else {
            entries.put(lastName, new ArrayList<>(List.of(phoneNumber)));
        }
    }

    public List<String> get(String lastName) {
        return entries.get(lastName);
    }

    @Override
    public String toString() {
        return "Phonebook{" +
                "entries=" + entries +
                '}';
    }
}
