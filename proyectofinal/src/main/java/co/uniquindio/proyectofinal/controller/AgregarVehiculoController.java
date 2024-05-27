package co.uniquindio.proyectofinal.controller;

import java.net.URL;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AgregarVehiculoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bntAgregarVehiculo;

    @FXML
    private TextField txHoraEntrada;

    @FXML
    private TextField txMarca;

    @FXML
    private TextField txPlaca;

    @FXML
    private TextField txPropietario;

    @FXML
    private TextField txVehiculo;

    @FXML
    void AgregarVehiculo(ActionEvent event) {

        javax.swing.JOptionPane.showMessageDialog(null, "Vehiculo Agregado ");

    }

    @FXML
    void initialize() {

    }

}