package task_preInheritance.figures;

class Circle {
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }
    public String info() {
        double square=getRadius()*Math.PI;
        return (Double.toString(square));
    }
    public double getRadius(){
        return this.radius;
    }
    public String toString(){
        String C =""+area();
        return C;
}
