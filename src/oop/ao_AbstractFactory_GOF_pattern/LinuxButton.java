package oop.ao_AbstractFactory_GOF_pattern;

/**
 * Created by root on 19.03.17.
 */
public class LinuxButton implements Button {
    private String look;

    public LinuxButton(String look) {
        this.look = look;
    }

    @Override
    public String getLook() {
        return look;
    }
}
