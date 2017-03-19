package oop.ao_AbstractFactory_GOF_pattern;

/**
 * Created by codefire on 19.03.17.
 */
public class Main {
    public static void main(String[] args) {

    }

    public void showButton(Button button) {
        // some implementation
        //...
        System.out.println(button);
    }

    public GuiFactory getAppropriateGUIFactory() {
        //...
        return factory;
    }
}
