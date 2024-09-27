package dataAcces;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class UserManageFactory {

    public static DataAccessible getDataAccess() throws IOException {
        Properties config = new Properties();

        // Carga user.properties desde el classpath
        InputStream input = UserManageFactory.class.getResourceAsStream("/dataAcces/user.properties");

        if (input == null) {
            System.out.println("El archivo user.properties no se encuentra en el classpath.");
            return null;
        }

        config.load(input);

        // Obtener el tipo de acceso a datos, si no se encuentra, se establecerá a 'file' por defecto
        String dataAccessType = config.getProperty("dataAccessType", "file"); // 'file' es el valor predeterminado

        if ("file".equalsIgnoreCase(dataAccessType)) {
            return new FileUserDataAccess();  // Cambia a FileUserDataAccess
        } else if ("database".equalsIgnoreCase(dataAccessType)) {
            return new DbUserDataAccess();     // Asegúrate de tener esta implementación para la base de datos
        }

        return null;
    }
}
