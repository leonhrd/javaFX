import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneTest extends Application {
    private FlowPane flow;
    @Override
    public void start(Stage stage)  {
        flow = new FlowPane(Orientation.VERTICAL);//Establecemos la orientación
        flow.getChildren().addAll(new Button("Boton 1"), new Button("Boton 2"), new Button("Boton 3"));

        Scene s = new Scene(flow);
        stage.setScene(s);
        stage.show();
    }
}