package modelDataTransfer;

public class User {
    private String dni;
    private String nombre;
    private String apellido;
    private int telefono;

    // Constructor
    public User(String dni, String nombre, String apellido, int telefono) {
        this.dni = dni;  
        this.nombre = nombre;  
        this.apellido = apellido;  
        this.telefono = telefono; 
    }

    // Getters
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    // Setters
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
