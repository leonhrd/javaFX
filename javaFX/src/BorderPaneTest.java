import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneTest extends Application {

    private BorderPane raiz;

    @Override
    public void start(Stage stage)  {
        raiz = new BorderPane();

        raiz.setTop(new Button("TOP"));
        raiz.setBottom(new Button("BOTTOM"));
        raiz.setLeft(new Button("LEFT"));
        raiz.setRight(new Button("RIGHT"));
        raiz.setCenter(new Button("CENTER"));

        Scene scene = new Scene(raiz);

        stage.setScene(scene);
        stage.show();
    }
}