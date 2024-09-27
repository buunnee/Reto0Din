package dataAcces;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Fábrica para gestionar el acceso a los datos del usuario.
 * Proporciona un método para obtener una instancia de DataAccessible según la configuración.
 */
public class UserManageFactory {

    /**
     * Obtiene una instancia de DataAccessible según la configuración especificada en el archivo config.properties.
     *
     * @return una instancia de DataAccessible, que puede ser FileUserDataAccess o DbUserDataAccess.
     * @throws IOException si ocurre un error al cargar el archivo de configuración.
     */
    public static DataAccessible getDataAccess() throws IOException {
        Properties config = new Properties();

        // Carga config.properties desde el classpath
        InputStream input = UserManageFactory.class.getResourceAsStream("/dataAcces/config.properties");

        if (input == null) {
            System.out.println("El archivo config.properties no se encuentra en el classpath.");
            return null;
        }

        config.load(input);

        // Obtener el tipo de acceso a datos desde el archivo de configuración
        String dataAccessType = config.getProperty("data.access", "file"); // 'file' es el valor predeterminado

        if (dataAccessType.equalsIgnoreCase("file")) {
            return new FileUserDataAccess();  // Cambia a FileUserDataAccess
        } else if (dataAccessType.equalsIgnoreCase("database")) {
            return new DbUserDataAccess();     // Asegúrate de tener esta implementación para la base de datos
        }

        return null; // Retorna null si el tipo de acceso a datos no es válido
    }
}
