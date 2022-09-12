import Entity.Lesson;
import Entity.Person;
import Model.Student;
import Model.Teacher;
import view.Print;

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

        List<Person> teacherList = Arrays.asList(Ivan,Den,Oleg,Dima,Sergey);
        System.out.println("____________________Учетиля_______________________");
        Print.PrintList(teacherList);

        Student _dimaS = new Student("Dima",15);
        Student _olegS = new Student("Oleg",15);
        Student _denS = new Student("Den",15);
        Student _ivan = new Student("Ivan",15);

        List<Person> studentList = Arrays.asList(_dimaS,_olegS,_denS,_ivan);
        System.out.println("____________________Студенты_______________________");
        Print.PrintList(studentList);
    }
}
