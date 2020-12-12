package Lesson5.HomeWork;

import java.lang.reflect.Array;
import java.util.Random;

public class Main {
    static final int person_age = 40;

    public static void main(String[] args) {
        Random rnd = new Random();

        Employee[] persons = new Employee[5];
        persons[0] = new Employee("Ivanov","Officer",rnd.nextInt(50)+20,"test1@mail.ru","89994568711",rnd.nextInt(100000)+50000);
        persons[1] = new Employee("Petrov","Servant",rnd.nextInt(50)+20,"test2@mail.ru","89994568722",rnd.nextInt(100000)+50000);
        persons[2] = new Employee("Morozov","Builder",rnd.nextInt(50)+20,"test3@mail.ru","89994568733",rnd.nextInt(100000)+50000);
        persons[3] = new Employee("Ivanov","Teacher",rnd.nextInt(50)+20,"test4@mail.ru","89994568744",rnd.nextInt(100000)+50000);
        persons[4] = new Employee("Ivanov","Builder",rnd.nextInt(50)+20,"test5@mail.ru","89994568755",rnd.nextInt(100000)+50000);

        PrintPerson(persons);

    }

    private static void PrintPerson(Employee[] array_persons){
        for (Employee p:array_persons
             ) {
            if (p.getAge()>person_age){
                p.printInfo();
            }

        }
    }
}
