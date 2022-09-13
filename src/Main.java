import Entity.Lesson;
import Entity.Person;
import Model.ClassLesson;
import Model.Student;
import Model.Teacher;
import view.Print;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Создать калькулятор для работы с рациональными и комплексными числами
//        , организовать меню, добавив в неё систему логирования.
//
//        Создать телефонный справочник с возможностью импорта и экспорта данных в нескольких форматах.
//        под форматами понимаем структуру файлов, например:
//        - в файле на одной строке хранится одна часть записи, пустая строка - разделитель
//
//        Создать информационную систему позволяющую работать с сотрудниками некой компании
//        \ студентами вуза \ учениками школы

        Teacher Ivan = new Teacher("Ivan",34 , Lesson.Math);

        Teacher Den = new Teacher("Den",34,Lesson.gymnastics );

        Teacher Oleg = new Teacher("Oleg",34,Lesson.History );

        Teacher Dima = new Teacher("Dima",34,Lesson.Geography );

        Teacher Sergey = new Teacher("Sergey",34,Lesson.Russian );

        List<Teacher> teacherList = Arrays.asList(Ivan,Den,Oleg,Dima,Sergey);
        System.out.println("____________________Учетиля_______________________");
        Print.PrintListTeacher(teacherList);

        Student _dimaS = new Student("_Dima",15);
        Student _olegS = new Student("_Oleg",15);
        Student _denS = new Student("_Den",15);
        Student _ivanS = new Student("_Ivan",15);
        Student _olgaS = new Student("_Olga",15);

        List<Student> studentList = new ArrayList<>();
        studentList.add(_ivanS);
        studentList.add(_olegS);
        studentList.add(_denS);
        studentList.add(_dimaS);

        System.out.println("____________________Студенты_______________________");
        Print.PrintListStudent(studentList);

        System.out.println("___________________________________________________");
        ClassLesson classMath = new ClassLesson(Ivan,Lesson.Math,studentList);
        Print.PrintClassLesson(classMath);
        System.out.println("___________________________________________________");


        classMath.getStudents().remove(_ivanS);
        classMath.getStudents().add(_olgaS);
        Print.PrintClassLesson(classMath);
    }
}
