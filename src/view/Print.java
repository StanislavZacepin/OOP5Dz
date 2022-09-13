package view;

import Entity.Person;
import Model.ClassLesson;
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
    public  static  void PrintClassLesson(ClassLesson classLesson){
        System.out.println(classLesson+" Учитель - "+classLesson.getTeacher().getName()+" Учиники: ");
        for (Student student : classLesson.getStudents()) {
            System.out.println(student.getName());
        }
    }


}
