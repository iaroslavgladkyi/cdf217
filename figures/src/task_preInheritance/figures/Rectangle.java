package task_preInheritance.figures;

/**
 * Created by codefire on 04.03.17.
 */
class Rectangle {
    private double wight;
    private double height;

    public Rectangle(double wight, double height) {
        this.wight = wight;
        this.height = height;
    }

    public String info() {
        double square=getWight()*getHeight();
        return (Double.toString(square));
    }
    public double getWight(){
        return this.wight;
    }
    public double getHeight(){
        return this.height;
    }
}
