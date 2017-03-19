package oop.ao_AbstractFactory_GOF_pattern;

/**
 * Created by codefire on 19.03.17.
 */
public class Win10GuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new WindowsButton("wwwww");
    }
}
