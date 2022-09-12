package view;

import Entity.Person;

import java.util.List;

public class Print {
    public static void PrintList(List<Person> list) {
        for (Person person : list) {
            person.printSkill();
        }
    }
}
