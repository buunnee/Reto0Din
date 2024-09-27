package dataAcces;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import modelDataTransfer.User;

public class FileUserDataAccess implements DataAccessible {

    private User user;

    public FileUserDataAccess() throws IOException {
        loadUserData();
    }

    private void loadUserData() throws IOException {
        Properties userProperties = new Properties();
        InputStream input = getClass().getResourceAsStream("/dataAcces/user.properties");

        if (input == null) {
            throw new IOException("El archivo user.properties no se encuentra en el classpath.");
        }

        userProperties.load(input);

        // Cargar los datos del usuario desde el archivo
        // Utilizar el constructor de User para crear la instancia
        String dni = userProperties.getProperty("dni");
        String nombre = userProperties.getProperty("nombre");
        String apellido = userProperties.getProperty("apellido");
        int telefono = Integer.parseInt(userProperties.getProperty("telefono"));

        // Crear el objeto User usando el constructor
        user = new User(dni, nombre, apellido, telefono);
    }

    @Override
    public User getUser() {
        return user;
    }
}
