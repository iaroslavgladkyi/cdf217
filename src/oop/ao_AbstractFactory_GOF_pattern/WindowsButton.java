package oop.ao_AbstractFactory_GOF_pattern;

/**
 * Created by root on 19.03.17.
 */
public class WindowsButton implements Button {
    private String look;

    public WindowsButton(String look) {
        this.look = look;
    }

    @Override
    public String getLook() {
        return look;
    }
}
