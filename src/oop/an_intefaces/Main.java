package oop.an_intefaces;

import oop.am_abstract.Cat;
import oop.am_abstract.Pet;

/**
 * Created by codefire on 18.03.17.
 */
public class Main {
    public static void main(String[] args) {
        Pet barsik = new Cat();
        Hamburger doubleChiz = new Hamburger();
        barsik.eat(doubleChiz);

        Wiskas wiskas = new Wiskas();
        barsik.eat(wiskas);
    }
}
