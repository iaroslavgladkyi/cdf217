package task_preInheritance.figures;

/**
 * Created by codefire on 04.03.17.
 */
public class Main {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(10,15);
        Rectangle rectangle2 = new Rectangle(20,10);

        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(20);
        Circle circle3 = new Circle(25);

        Triangle T1 = new Triangle(5,10,15);
        Triangle T2 = new Triangle(5,3,7);

        System.out.println("rectangle1: "+rectangle1.info());
        System.out.println("rectangle1: "+rectangle2.info());
        System.out.println("circle1: "+circle1.info());
        System.out.println("circle2: "+circle2.info());
        System.out.println("circle3: "+circle3.info());
        System.out.println(T1);
        System.out.println(T2);
    }
}
