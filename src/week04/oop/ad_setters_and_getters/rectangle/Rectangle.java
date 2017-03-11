package week04.oop.ad_setters_and_getters.rectangle;

/**
 * Created by codefire on 26.02.17.
 */
public class Rectangle {
    public static final String NAME = "REctangle";

    public int width;
    public int height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    public int getWidth() {
        return width;
    }
    public int getHeight(){
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
