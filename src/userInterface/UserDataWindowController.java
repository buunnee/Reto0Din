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
 * Controlador de la ventana de datos del usuario.
 * Se encarga de cargar y mostrar la información del usuario en la interfaz gráfica.
 * 
 * @author Lucian
 */
public class UserDataWindowController {

    @FXML
    private Label dniLabel;      // Etiqueta para mostrar el DNI del usuario
    @FXML
    private Label nombreLabel;   // Etiqueta para mostrar el nombre del usuario
    @FXML
    private Label apellidoLabel;  // Etiqueta para mostrar el apellido del usuario
    @FXML
    private Label telefonoLabel;  // Etiqueta para mostrar el teléfono del usuario

    /**
     * Carga los datos del usuario desde el acceso a datos y los muestra en las etiquetas correspondientes.
     *
     * @throws Exception si ocurre un error al acceder a los datos del usuario.
     */
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

    /**
     * Método para mostrar los datos del usuario (no implementado).
     *
     * @param user el objeto User que contiene los datos del usuario.
     * @throws UnsupportedOperationException si se llama a este método, ya que no está implementado.
     */
    void displayUserData(User user) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose Tools | Templates.
    }
}
