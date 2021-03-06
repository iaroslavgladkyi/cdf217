package oop.am_abstract;

import oop.an_intefaces.Food;
import oop.an_intefaces.Hamburger;
import oop.an_intefaces.Wiskas;

/**
 * Created by codefire on 11.03.17.
 */
public abstract class Pet {

    public void weakUp() {
        voice();
        doMorningExercises();
    }

    /* // Simple incorrect way
    public void voice() {}
    public void doMorningExercises() {}
    */

    public abstract void voice();
    public abstract void doMorningExercises();

    public boolean eat(Food food) {
        System.out.println("Мой запас питательных веществ только что был увеличен на "
                + food.getKKal() + " KKal");
        return true;
    }
}

