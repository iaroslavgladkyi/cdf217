package oop.ao_AbstractFactory_GOF_pattern;

/**
 * Created by codefire on 19.03.17.
 */
public class Main {
    public static void main(String[] args) {
        GuiFactory factory = getAppropriateGUIFactory();
        Button button = factory.createButton();
        showButton(button);
    }

    // сюда нам нужна Кнопка
    public static void showButton(Button button) {
        // some implementation
        //...
        System.out.println(button.getLook());
    }

    // отсюда мы получаем правильную для ОС Фабрику кнопок и тд.
    public static GuiFactory getAppropriateGUIFactory() {
        // some implementation
        //...
        GuiFactory[] factories = {new UbuntuGuiFactory(), new Win10GuiFactory()};
        int idx = (int)(Math.random() * 2);
        GuiFactory factory = factories[idx];
        return factory;
    }
}
