import Entity.Lesson;
import Entity.Skill;
import Model.Teacher;

import java.awt.geom.Area;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        for (Teacher teacher : teacherList) {
            teacher.printSkill();
        }
    }
}
