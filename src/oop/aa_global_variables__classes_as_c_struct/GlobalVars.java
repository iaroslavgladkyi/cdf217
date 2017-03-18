package oop.aa_global_variables__classes_as_c_struct;

// import static oop.aa_global_variables__classes_as_c_struct.GlobalVars.m;

/**
 * Created by codefire on 26.02.17.
 */
public class GlobalVars {

    public static int a;
    public static int b;

    public static void init() {
        a = 35;
        b = 50;
    }

    public static void m() {
        System.out.println("m() : a = " + a);
        System.out.println("m() : b = " + b);
    }
}

class Main {
    public static void main(String[] args) {
        GlobalVars.init();
        GlobalVars.m();
        System.out.println(GlobalVars.a);
    }
}
