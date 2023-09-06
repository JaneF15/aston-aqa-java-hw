public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        employees[0] = new Employee(
                "Елена Иванова",
                "главный бухгалтер",
                "elena@mail.ru",
                "89999999999",
                150000,
                44
        );

        employees[1] = new Employee(
                "Петр Петров",
                "QA",
                "peter@mail.ru",
                "89999999998",
                250000,
                33
        );

        employees[2] = new Employee(
                "Василий Пупкин",
                "бухгалтер",
                "basil@mail.ru",
                "89999999997",
                110000,
                34
        );

        employees[3] = new Employee(
                "Алексей Сидоров",
                "backend разработчик",
                "alexei@mail.ru",
                "89999999996",
                300000,
                29
        );

        employees[4] = new Employee(
                "Александр Панкратов",
                "frontend разработчик",
                "alex@mail.ru",
                "89999999995",
                200000,
                26
        );

        for (Employee employee: employees) {
            if (employee.age > 40) {
                System.out.println(employee);
            }
        }

        Park park = new Park();
        park.addAttraction("Вихрь", "10:00 - 22:00", 350);
        park.addAttraction("Бумеранг", "10:00 - 21:00", 300);

        System.out.println(park);
    }


}
