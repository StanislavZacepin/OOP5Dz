package Model;

import Entity.Lesson;
import Entity.Person;

import java.util.List;

public class Student extends Person {


    public Student(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void printSkill() {
        System.out.println("Меня зовут "+super.getName()+" Навыков нет, я только учусь");
    }
}
