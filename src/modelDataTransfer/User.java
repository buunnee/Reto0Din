package modelDataTransfer;

/**
 * Clase que representa un usuario con información personal.
 * Contiene atributos como DNI, nombre, apellido y teléfono.
 * 
 * @author Lucian
 */
public class User {
    private String dni;        // DNI del usuario
    private String nombre;     // Nombre del usuario
    private String apellido;   // Apellido del usuario
    private int telefono;      // Teléfono del usuario

    /**
     * Constructor que inicializa un objeto User con los datos proporcionados.
     *
     * @param dni      el DNI del usuario
     * @param nombre   el nombre del usuario
     * @param apellido el apellido del usuario
     * @param telefono el número de teléfono del usuario
     */
    public User(String dni, String nombre, String apellido, int telefono) {
        this.dni = dni;  
        this.nombre = nombre;  
        this.apellido = apellido;  
        this.telefono = telefono; 
    }

    // Getters

    /**
     * Obtiene el DNI del usuario.
     *
     * @return el DNI del usuario
     */
    public String getDni() {
        return dni;
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return el nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el apellido del usuario.
     *
     * @return el apellido del usuario
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Obtiene el teléfono del usuario.
     *
     * @return el número de teléfono del usuario
     */
    public int getTelefono() {
        return telefono;
    }

    // Setters

    /**
     * Establece el DNI del usuario.
     *
     * @param dni el nuevo DNI del usuario
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Establece el nombre del usuario.
     *
     * @param nombre el nuevo nombre del usuario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece el apellido del usuario.
     *
     * @param apellido el nuevo apellido del usuario
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Establece el teléfono del usuario.
     *
     * @param telefono el nuevo número de teléfono del usuario
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
