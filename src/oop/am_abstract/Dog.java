package oop.am_abstract;

/**
 * Created by codefire on 11.03.17.
 */
public class Dog extends Pet {

    // implementation specific to Dog
    public void voice() {
        System.out.println("Gav.!");
    }

    // implementation specific to Dog
    public void doMorningExercises() {
        System.out.println("dog go for a walk..");
    }
}
