package Model;

import Entity.Lesson;
import Entity.Person;

import java.util.List;

public class Teacher extends Person {
    private Lesson lesson;

    public Teacher(String name, Integer age, Lesson lesson) {
        super(name, age);
        this.lesson = lesson;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    @Override
    public void printSkill() {
        System.out.println("Меня зовут "+this.getName().toString()+". Я учитель "+this.lesson.toString());
    }
}
