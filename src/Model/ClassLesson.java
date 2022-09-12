package Model;

import Entity.Lesson;
import Entity.Person;

import java.util.List;

public class ClassLesson {


    private Teacher teacher;
    private Lesson lesson;
    private List<Student> students;

    public ClassLesson(Teacher teacher, Lesson lesson, List<Student> students) {
        this.teacher = teacher;
        this.lesson = lesson;
        this.students = students;
    }

    public void AddClassLessonStudent(Student student) {
        students.add(student);
    }
    public void DellClassLessonStudent(Student student) {
        students.remove(student);
    }
    public void UpdateClassLessonTeacher(Teacher teacher) {
        this.teacher= teacher;
    }
    public void DellClassLessonTeacher(Teacher teacher) {
        students.remove(teacher);
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
