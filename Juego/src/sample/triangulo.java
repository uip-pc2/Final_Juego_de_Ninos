package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class triangulo {
    @FXML
    ImageView circulo1;
    @FXML
    ImageView triangulo1;
    @FXML
    ImageView rectangulo1;
    @FXML
    RadioButton circulo;
    @FXML
    RadioButton triangulo;
    @FXML
    RadioButton rectangulo;
    @FXML


    public void btn_rectangulo(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("incorrecto2.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Ayuda");
        stage.setScene(new Scene(root1));
        stage.show();
    }

    public void btn_triangulo(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("correcto2.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Ayuda");
        stage.setScene(new Scene(root1));
        stage.show();
    }

    public void btn_circulo(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("incorrecto2.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Ayuda");
        stage.setScene(new Scene(root1));
        stage.show();
    }
}
