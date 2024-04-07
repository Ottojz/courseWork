public class Main {

    private static Employee[] employees = new Employee[10]; //Базовая сложность - 7 - создано поле Employee[10] - хранилище записей о сотрудниках

    public static void main(String[] args) {
//Базовая сложность - 7 - создан метод main внутри класса Main
        employees[0] = new Employee("Иванова", "Иванна", "Петровна",  (byte) 1, 51_000);
        employees[1] = new Employee("Петров", "Иван", "Иванович",  (byte) 3, 150_000);
        employees[2] = new Employee("Сидоров", "Николай", "Владимирович",  (byte) 2, 250_000);
        employees[3] = new Employee("Николаев", "Марсель", "Игоревич",  (byte) 3, 150_000);
        employees[4] = new Employee("Вирсунгов", "Демид", "Сергеевич",  (byte) 1, 150_000);
        employees[5] = new Employee("Сизифов", "Николай", "Валентинович",  (byte) 4, 400_000);
        employees[6] = new Employee("Картаполова", "Оксана", "Вадимовна",  (byte) 1, 50_000);
        employees[7] = new Employee("Абрамов", "Олег", "Андреевич",  (byte) 4, 200_000);
        employees[8] = new Employee("Мартынов", "Павел", "Иванович",  (byte) 5, 550_000);
        employees[9] = new Employee("Иванов", "Иван", "Петрович",  (byte) 3, 150_000);

        printAllEmployees();

        System.out.println("Ежемесячные расходы на заработную плату сотрудников составляют: " + getSumSalary() + " рублей.\n");

        System.out.println("Наименьшая зарплата у сотрудника:\n" + getEmployeeWithLowestSalary().getFullName() + '\n');

        System.out.println("Наибольшая зарплата у сотрудника:\n" + getEmployeeWithHighestSalary().getFullName() + '\n');

        System.out.println("Средняя заработная плата в найшей компании составляет " + averegeSalary() + " рублей в месяц.\n");

        printAllFullNames();

    }
    private static void printAllEmployees() {
        System.out.println("\nid" + "\t//\t" + "ОТДЕЛ" + "\t//\t" + "ЗАРПЛАТА" + "   \t//\t   " + "Ф.И.О.");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println();
    } //Базовая сложность - 8a - создан статический метод для выведения списка сотрудников со всеми данными

    private static int getSumSalary() {
        int sumSalary = 0;
        for (Employee employee : employees) {
            sumSalary += employee.getSalary();
        }
        return sumSalary;
    } //Базовая сложность - 8b - создан статический метод для подсчета затрат на ЗП в месяц

    private static Employee getEmployeeWithLowestSalary() {
        int lowestSalary = 10_000_000;
        Employee employeeWithLowestSalary = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < lowestSalary) {
                lowestSalary = employees[i].getSalary();
                employeeWithLowestSalary = employees[i];
            }
        }
        return employeeWithLowestSalary;
    } //Базовая сложность - 8c - создан статический метод для поиска сотрудника с минимальной ЗП

    private static Employee getEmployeeWithHighestSalary() {
        int highestSalary = 0;
        Employee employeeWithHighestSalary = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > highestSalary) {
                highestSalary = employees[i].getSalary();
                employeeWithHighestSalary = employees[i];
            }
        }
        return employeeWithHighestSalary;
    } //Базовая сложность - 8d - создан статический метод для поиска сотрудника с максимальной ЗП

    private static int averegeSalary() {
        int averegeSalary = (getSumSalary() / employees.length);
        return averegeSalary;
    } //Базовая сложность - 8e - создан статический метод для подсчета средней ЗП в компании

    private static void printAllFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    } //Базовая сложность - 8f - создан статический метод для печати Ф.И.О. всех сотрудников
}/*Выполнен базовый уровень. Повышенный, так понимаю, можно сдать позже.*/