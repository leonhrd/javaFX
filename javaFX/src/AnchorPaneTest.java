import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
/**
 *
 * @author kalt
 */
public class AnchorPaneTest extends Application {
    private AnchorPane anchor;
    @Override
    public void start(Stage stage)  {
        anchor  = new AnchorPane();

        Button b2  = new Button("Boton 2");
        Button b3 = new Button("Boton 3");
        AnchorPane.setTopAnchor(b2, 10.0);
        AnchorPane.setRightAnchor(b2, 10.0);

        AnchorPane.setBottomAnchor(b3, 20.0);
        AnchorPane.setLeftAnchor(b3, 20.0);

        anchor.getChildren().addAll(new Button("Boton 1"), b2, b3);

        Scene s = new Scene(anchor);
        stage.setScene(s);
        stage.show();
    }
}