package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class escaleno {
    @FXML
    ImageView circulo2;
    @FXML
    ImageView escaleno2;
    @FXML
    ImageView rectangulo2;
    @FXML
    RadioButton circle3;
    @FXML
    RadioButton escaleno3;
    @FXML
    RadioButton rectangular3;


    public void rb_escaleno1(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("correcto3.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Ayuda");
        stage.setScene(new Scene(root1));
        stage.show();
    }

    public void rb_rectangulo3(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("incorrecto3.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Ayuda");
        stage.setScene(new Scene(root1));
        stage.show();
    }

    public void rb_circulo3(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("incorrecto3.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Ayuda");
        stage.setScene(new Scene(root1));
        stage.show();
    }
}
