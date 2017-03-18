package oop.am_abstract;

/**
 * Created by codefire on 11.03.17.
 */
public class Main {
    public static void main(String[] args) {
        //Pet pet = new Cat(); // LSP
        Pet[] mypets = new Pet[] {new Cat(), new Cat(), new Dog()};
        for (Pet pet: mypets) {
            pet.weakUp();
        }
    }
}
//sdfj,hjASD fSD //