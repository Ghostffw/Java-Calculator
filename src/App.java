import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader carregador = new FXMLLoader(getClass().getResource("Calculadora layout.fxml"));
        Parent root = carregador.load();
        Scene tela = new Scene(root);

        primaryStage.setTitle("Calculadora");
        primaryStage.setScene(tela);
        primaryStage.show();
    }

    public static void main(String[] args) throws Exception {
        launch();
    }
}
