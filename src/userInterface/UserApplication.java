/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 2dam
 */

public class UserApplication extends Application {

    private static final Logger logger = Logger.getLogger(UserApplication.class.getName());

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/userInterface/UserDataView.fxml"));
            Scene scene = new Scene(loader.load());
            primaryStage.setScene(scene);
            primaryStage.setTitle("Datos del Usuario");
            primaryStage.show();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error al iniciar la aplicación", e);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
