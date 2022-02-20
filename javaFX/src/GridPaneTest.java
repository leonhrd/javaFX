import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
/**
 *
 * @author kalt
 */
public class GridPaneTest extends Application {
    private GridPane grid;
    @Override
    public void start(Stage stage)  {
        grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);
        grid.add(new Button("Posicion 0, 0"), 0, 0);
        grid.add(new Button("Posicion 1, 0"), 1, 0 );
        grid.add(new Button("Posicion 0, 1"), 0, 1);
        grid.add(new Button("Posicion 1, 1"), 1, 1);
        grid.add(new Button("Posicion 0, 2"), 0, 2);
        grid.add(new Button("Posicion 1, 2"), 1, 2);

        grid.add(new Button("Posicion Col 9 Fila 2"), 9, 2);

        Scene s = new Scene(grid);
        stage.setScene(s);
        stage.show();
    }
}