import java.util.Objects;
//Базовая сложность - 1 - создан класс Employee
public class Employee {
    private final String lastName; //Базовая сложность - 4 - прямой доступ к полям класса скрыт конструкцией private
    private final String firstName; //Базовая сложность - 4 - прямой доступ к полям класса скрыт конструкцией private
    private final String middleName; //Базовая сложность - 4 - прямой доступ к полям класса скрыт конструкцией private
    private final String fullName; //Базовая сложность - 4 - прямой доступ к полям класса скрыт конструкцией private
    private byte department; //Базовая сложность - 4 - прямой доступ к полям класса скрыт конструкцией private
    private int salary; //Базовая сложность - 4 - прямой доступ к полям класса скрыт конструкцией private
    private final short id; //Базовая сложность - 3 - добавлено поле "id" в класс Employee

    private static short counter; //Базовая сложность - 2 - добавлена статическая переменная-счетчик id

    public Employee(String lastName, String firstName, String middleName, byte department, int salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.fullName = lastName + " " + firstName + " " + middleName;
        this.department = department;
        this.salary = salary;
        id = ++counter; //Базовая сложность - 3 - поле "id" проставляется из счетчика
    } //Базовая сложность - 6 - реализован конструктор, который заполняет все поля, кроме поля id, которое получает информацию из счетчика

//Базовая сложность - 4 - на строках 25-59 реализованы геттеры всех полей и сеттеры полей ЗП и отдела
    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFullName() {
        return fullName;
    }

    public byte getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public short getId() {
        return id;
    }

    public void setDepartment(byte department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString () {
        return this.id + "\t//\t" + this.department + "\t\t//\t" + this.salary + "   \t//\t   " + this.fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && id == employee.id && Objects.equals(fullName, employee.fullName);
    } //Базовая сложность - 5 - реализован контракт equals

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary, id);
    } //Базовая сложность - 5 - реализован контракт hashCode
}
