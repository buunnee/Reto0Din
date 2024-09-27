package userInterface;

import dataAcces.DataAccessible;
import dataAcces.UserManageFactory;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import modelDataTransfer.User;

import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 2dam
 */


public class UserDataWindowController {

    @FXML
    private Label dniLabel;
    @FXML
    private Label nombreLabel;
    @FXML
    private Label apellidoLabel;
    @FXML
    private Label telefonoLabel;

    @FXML
    public void loadUserData() throws Exception {
        try {
            // Obtener la instancia de acceso a datos
            DataAccessible dataAccess = UserManageFactory.getDataAccess();
            User user = dataAccess.getUser();

            // Mostrar los datos del usuario en los Label
            if (user != null) {
                dniLabel.setText(user.getDni());
                nombreLabel.setText(user.getNombre());
                apellidoLabel.setText(user.getApellido());
                telefonoLabel.setText(String.valueOf(user.getTelefono()));
            } else {
                dniLabel.setText("No se encontraron datos");
            }
        } catch (IOException e) {
            e.printStackTrace();
            dniLabel.setText("Error al cargar datos");
        }
    }

    void displayUserData(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}