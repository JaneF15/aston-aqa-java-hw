public class Employee {
    public String fullName;
    public String position;
    public String email;
    public String phoneNumber;
    public int salary;
    public int age;

    public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return  "\n {fullName='" + fullName + '\'' +
                ",\n position='" + position + '\'' +
                ",\n email='" + email + '\'' +
                ",\n phoneNumber='" + phoneNumber + '\'' +
                ",\n salary=" + salary +
                ",\n age=" + age +
                "}\n";
    }
}
