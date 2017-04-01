package plf.fx.canvas.image;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import oop.ao_AbstractFactory_GOF_pattern.Button;
/**
 * Created by codefire on 01.04.17.
 */
public class CanvasDemo0 extends Application {

    public static final int WIDTH = 480;
    public static final int HEIGHT = 320;

    @Override
    public void start(Stage stage) throws Exception {
        Picture picture = new Picture();
        Pane pane = new Pane();
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        canvas.addEventHandler(MouseEvent.MOUSE_PRESSED, (event) -> {
            GraphicsContext gc = canvas.getGraphicsContext2D();
            picture.drawPicture(gc);
            /*gc.strokeLine(10, 20, 100, 150);
            gc.strokeLine(10, 20, 100, 150);*/
        });
        GraphicsContext gc = canvas.getGraphicsContext2D();
        picture.drawPicture(gc);

        /*gc.moveTo(10, 10);
        gc.lineTo(100, 200);*/

        pane.getChildren().add(canvas);

        Scene value = new Scene(pane);
        //pane.setBackground();
        stage.setScene(value);
        stage.setTitle("Canvas Demo 0");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

class Picture {
    public void drawPicture(GraphicsContext gc) {
        //gc.setStroke(Color.BLACK);
        //gc.setLineWidth(3);
        //gc.strokeLine(10, 20, 100, 150);
        //gc.stro
        gc.setStroke(new Color(Math.random(), Math.random(), Math.random(), 1));
        int maxWidth = CanvasDemo0.WIDTH;
        int maxHeight = CanvasDemo0.HEIGHT;
        gc.strokeLine (0, maxHeight/2, maxWidth, maxHeight/2);
        gc.strokeLine (maxWidth/2, 0, maxWidth/2, maxHeight);
        gc.strokeOval(maxWidth/2, 0, maxWidth/2, maxHeight);
        int x1 = (int) (Math.random() * maxWidth),
            y1 = (int) (Math.random() * maxHeight),
            x2 = (int) (Math.random() * maxWidth),
            y2 = (int) (Math.random() * maxHeight);
        int x = (int) (Math.random() * maxWidth),
            y = (int) (Math.random() * maxWidth),
            w = (int) (Math.random()* maxHeight);

        gc.strokeLine (x1, y1, x2, y2);
        gc.strokeOval(x, y, w,maxHeight);
    }
}
