package dataAcces;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import modelDataTransfer.User;

/**
 * Clase que proporciona acceso a los datos del usuario desde un archivo de propiedades.
 * Implementa la interfaz DataAccessible para definir cómo se obtienen los datos del usuario.
 */
public class FileUserDataAccess implements DataAccessible {

    private User user;

    /**
     * Constructor de la clase FileUserDataAccess.
     * Carga los datos del usuario desde el archivo de propiedades al crear una instancia.
     *
     * @throws IOException si ocurre un error al cargar el archivo de propiedades.
     */
    public FileUserDataAccess() throws IOException {
        loadUserData();
    }

    /**
     * Carga los datos del usuario desde el archivo user.properties.
     *
     * @throws IOException si ocurre un error al cargar el archivo de propiedades o si el archivo no se encuentra.
     */
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

    /**
     * Obtiene el objeto User cargado desde el archivo de propiedades.
     *
     * @return el objeto User con los datos cargados.
     */
    @Override
    public User getUser() {
        return user;
    }
}
