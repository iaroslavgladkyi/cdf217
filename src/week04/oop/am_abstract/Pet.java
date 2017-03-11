package week04.oop.am_abstract;

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

}
