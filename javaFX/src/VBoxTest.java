import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/**
 *
 * @author kalt
 */
public class VBoxTest extends Application {

    private VBox cajaVertical;//Declaramos un objeto de tipo VBox

    @Override
    public void start(Stage stage) {
        cajaVertical = new VBox();//Inicializamos el objeto

        cajaVertical.getChildren().add(new Button("Boton 1"));//agregamos un nodo hijo de tipo Button
        cajaVertical.getChildren().add(new Button("Boton 2"));//agregamos un nodo hijo de tipo Button
        cajaVertical.getChildren().add(new Button("Boton 3"));//agregamos un nodo hijo de tipo Button

        Scene s = new Scene(cajaVertical);//Creamos la escena y le pasamos como parámetro nuestro layout
        stage.setScene(s);//Seteamos en la ventana el layout
        stage.show();//y mostramos la ventana
    }
}