package Entity;

public enum Lesson {
    Math("Матиматика"),
    Russian("Русский"),
    gymnastics("Гимнастика"),
    History("История"),
    Geography("География");
    private String title;
    Lesson(String title){
        this.title = title;
    }
    @Override
    public String toString() {
        return title;
    }
}
