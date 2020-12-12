package Lesson5.HomeWork;

public class Employee {
    private String  FirstName;
    private String  position;
    private int     age;
    private String  email;
    private String  phone;
    private int     salary;

    public Employee(String FirstName, String position, int age, String email, String phone, int salary) {
        this.FirstName = FirstName;
        this.position = position;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
    }

    public Employee(String FirstNAme, String position) {
        this(FirstNAme, position, 0, null, null, 0);
    }

    public int getAge() {
        return age;
    }

    public void printInfo(){
        System.out.println(this);
    }

    public String toString() {
        return String.format("Сотрудник: Фамилия: %s  " +
                " Должность: %s  " +
                "возраст: %d  " +
                "email: %s  " +
                "phone: %s " +
                "salary: %d руб.",FirstName,position,age,email,phone,salary) ;

    }
}
