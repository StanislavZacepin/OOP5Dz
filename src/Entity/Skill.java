package Entity;

public interface Skill {
     String skill = new String();
     default void printSkill(String skill){
          System.out.println(skill);
     }

}
