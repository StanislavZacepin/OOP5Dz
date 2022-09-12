package view;

import Entity.Person;
import Model.Student;
import Model.Teacher;

import java.util.List;

public class Print {
    public static void PrintListTeacher(List<Teacher> list) {
        for (Person person : list) {
            person.printSkill();
        }
    }
    public static void PrintListStudent(List<Student> list) {
        for (Person person : list) {
            person.printSkill();
        }
    }
}
