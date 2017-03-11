package week04.oop.am_abstract;

/**
 * Created by codefire on 11.03.17.
 */
public class Cat extends Pet {

    // implementation specific to Cat
    public void voice() {
        System.out.println("Meaaaw");
    }

    // implementation specific to Cat
    public void doMorningExercises() {
        System.out.println("cat doing exercises..");
    }
}
