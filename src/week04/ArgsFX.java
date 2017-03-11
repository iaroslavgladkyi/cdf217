package week04;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.List;

/**
 * Open Terminal, compile and run the program as:
 * java week04.ArgsFX Hello Vasya
 */
public class ArgsFX extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parameters parameters = getParameters();
        List<String> arguments = parameters.getRaw();
        String argLine = Arrays.toString(arguments.toArray());
        Label label = new Label(argLine);
        label.setFont(new Font(32));
        Parent root = new BorderPane(label);
        stage.setScene(new Scene(root, 320, 200));
        stage.show();
    }
}
