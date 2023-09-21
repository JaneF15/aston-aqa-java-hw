import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        String[] arr = {"apple", "banana", "lemon", "apple", "cherry", "orange", "lemon", "lemon", "pear", "banana"};
        System.out.println(new HashSet<>(Arrays.asList(arr)));

        Map<String, Integer> map = new HashMap<>();

        for (String key : arr) {
            var value = map.get(key);

            if (value != null) {
                map.put(key, value + 1);
            } else {
                map.put(key, 1);
            }
        }

        System.out.println(map);



        Phonebook phonebook = new Phonebook();

        phonebook.add("Иванов", "89999999999");
        phonebook.add("Сидоров", "89999999998");
        phonebook.add("Иванов", "89999999997");
        phonebook.add("Петров", "89999999996");
        phonebook.add("Федоров", "89999999995");
        phonebook.add("Пупков", "89999999994");
        phonebook.add("Панкратов", "89999999993");
        phonebook.add("Иванов", "89999999992");
        phonebook.add("Сидоров", "89999999991");
        phonebook.add("Петров", "89999999990");

        System.out.println(phonebook);

        System.out.println(phonebook.get("Иванов"));
    }
}
