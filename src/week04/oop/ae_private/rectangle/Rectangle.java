package week04.oop.ae_private.rectangle;

/**
 * Created by codefire on 26.02.17.
 */
public class Rectangle {
    public static final String NAME = "REctangle";

    private int width;
    private int height;

    public Rectangle(int w, int h) {
        setWidth(w);
        setHeight(h);
    }

    public int getWidth() {
        return width;
    }
    public int getHeight(){
        return height;
    }

    public void setWidth(int width) {
        if (width >= 0) {
            this.width = width;
        }
    }

    public void setHeight(int height) {
        if (height >= 0) {
            this.height = height;
        }
    }
}
