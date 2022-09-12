package Entity;

import java.util.List;

public interface Skill<T> {

      default void printSkill(List<T> skill){

           System.out.println(skill);
     }

}
