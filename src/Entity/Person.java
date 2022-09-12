package Entity;

import java.util.List;

public abstract class Person <T> implements Skill {

   private String name;
   private Integer age;

   private List<T> skill;

  public Person(String name, Integer age,List<T> skill){

      this.name = name;
      this.age = age;
      this.skill = skill;
  }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<T> getSkill() {
        return skill;
    }

    public void setSkill(List<T> skill) {
        this.skill = skill;
    }
}
