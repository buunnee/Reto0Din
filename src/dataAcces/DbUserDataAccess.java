package dataAcces;

import modelDataTransfer.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que proporciona acceso a los datos del usuario desde una base de datos.
 * Implementa la interfaz DataAccessible para definir cómo se obtienen los datos del usuario.
 * 
 * @author Lucian
 */
public class DbUserDataAccess implements DataAccessible {

    private static final Logger logger = Logger.getLogger(DbUserDataAccess.class.getName());

    /**
     * Obtiene el objeto User desde la base de datos.
     *
     * @return el objeto User con los datos cargados desde la base de datos.
     * @throws Exception si ocurre un error al acceder a la base de datos.
     */
    @Override
    public User getUser() throws Exception {
        String url = "jdbc:mysql://localhost:3306/reto0_din?serverTimezone=Europe/Madrid&useSSL=false";
        String username = "root";  
        String password = "abcd*1234";  

        String query = "SELECT dni, nombre, apellido, telefono FROM Usuario";  

        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            if (resultSet.next()) {
                String dni = resultSet.getString("dni");
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                int telefono = resultSet.getInt("telefono");
                return new User(dni, nombre, apellido, telefono);
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error al acceder a la base de datos", e);
            throw e;
        }
        return null; // Retorna null si no se encuentra ningún usuario
    }
}
