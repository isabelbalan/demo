package eus.ehu;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {

    // 1. Declaramos la etiqueta que el FXML va a usar
    @FXML
    private Label messageLabel;

    @Override
    public void start(Stage stage) throws Exception {
        // 2. Cargamos el diseño
        Parent root = FXMLLoader.load(getClass().getResource("/eus/ehu/primary.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("JavaFX Basic App");
        stage.setScene(scene);
        stage.show();
    }

    // 3. El método que se ejecuta al pulsar el botón
    @FXML
    private void handleButtonClick() {
        messageLabel.setText("¡Funciona correctamente!");
        messageLabel.setVisible(true);
    }

    public static void main(String[] args) {
        launch(args);
    }
}