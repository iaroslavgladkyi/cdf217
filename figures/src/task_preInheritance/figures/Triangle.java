package task_preInheritance.figures;

/**
 * Created by codefire on 04.03.17.
 */
 class Triangle {
    private double storona1;
    private double storona2;
    private double storona3;

    public Triangle(double storona1, double storona2, double storona3){
        this.storona1=storona1;
        this.storona2= storona2;
        this.storona3= storona3;
    }
    public double area() {
        double perumepr = (getStorona1()+getStorona2()+getStorona3())/2;
        double area =Math.sqrt(perumepr*(perumepr-getStorona1())*
                (perumepr-getStorona2())*(perumepr-getStorona3()));
        return area;
    }
     public String toString(){
         String T ="Triangle"+area();
         return T;
     }

    public double getStorona1(){
        return this.storona1;}
    public double getStorona2(){
        return this.storona2;}
    public double getStorona3(){
        return this.storona3;}
 }
