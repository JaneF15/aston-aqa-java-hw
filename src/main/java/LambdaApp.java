import java.util.*;
import java.util.stream.*;

public class LambdaApp {
    public static void main(String[] args) {

        Random random = new Random();

        IntStream intStream = random.ints(10);
        System.out.println(intStream.filter(x -> x % 2 == 0).count());
        System.out.println("----------------------------------------------");

        Collection<String> list = Arrays.asList("Highload", "High", "Load", "Highload");

        long countHigh = list.stream()
                .filter(s -> s.equals("High"))
                .count();
        System.out.println(countHigh);
        System.out.println("----------------------------------------------");

        System.out.println(first(list));
        System.out.println(first(new ArrayList<>()));
        System.out.println("----------------------------------------------");

        System.out.println(last(list));
        System.out.println(last(new HashSet<>()));
        System.out.println("----------------------------------------------");

        System.out.println(Arrays.toString(sort(Arrays.asList("f10", "f15", "f2", "f4", "f4"))));
        System.out.println("----------------------------------------------");

        Collection<Student> students = Arrays.asList(
                new Student("Дмитрий", 17, Gender.MAN),
                new Student("Максим", 20, Gender.MAN),
                new Student("Екатерина", 20, Gender.WOMAN),
                new Student("Михаил", 28, Gender.MAN)
        );

        System.out.println(avgAgeOfMaleStudents(students));
        System.out.println("----------------------------------------------");

        System.out.println(filterByConscriptionAge(students));

    }

    private static double avgAgeOfMaleStudents(Collection<Student> students) {

        double count = students.stream()
                .filter(student -> student.gender == Gender.MAN)
                .count();

        return students.stream()
                .filter(student -> student.gender == Gender.MAN)
                .map(student -> student.age)
                .reduce(Integer::sum).get() / count;

    }

    private static Collection<Student> filterByConscriptionAge(Collection<Student> students) {

        return students.stream()
                .filter(student ->
                        student.gender == Gender.MAN &&
                        student.age >= 18 &&
                        student.age <= 27)
                .collect(Collectors.toList());

    }

    public static Object first(Collection<String> collection) {
        return collection.stream()
                .findAny()
                .isEmpty() ?
                0 :
                collection.stream()
                        .limit(1)
                        .collect(Collectors.toList())
                        .get(0);
    }

    public static Object last(Collection<String> collection) {
        return collection.stream()
                .findAny()
                .isEmpty() ?
                0 :
                collection.stream()
                        .skip(collection.size() - 1)
                        .collect(Collectors.toList())
                        .get(0);
    }

    public static Object[] sort(Collection<String> collection) {
        return collection.stream()
                .sorted()
                .toArray();
    }

    private enum Gender {
        MAN,
        WOMAN
    }

    private static class Student {
        private final String name;
        private final Integer age;
        private final Gender gender;

        public Student(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) &&
                    Objects.equals(age, student.age) &&
                    gender == student.gender;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, gender);
        }
    }
}