package models;

public class Clientes {
    //declaramos las variables para crear el objeto producto
    private Long idCliente;
    private String nombre;
    private String direccion;
    private String tipodoc;
    private int telefono;
    //Implementamso el contructor vacio

    public Clientes() {
    }

    public Clientes(Long idCliente, String nombre, String direccion, String tipodoc, int telefono) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipodoc = tipodoc;
        this.telefono = telefono;
    }

    //Métodos Get y set

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoDoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public int getTelefono() { return telefono; }

    public void setTelefono(int telefono) { this.telefono = telefono; }
}
