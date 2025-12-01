import java.util.ArrayList;
import java.util.List;

public class Cliente {
    //Atributos
    private int idCliente;
    private String nombre;
    private String empresa;
    private String telefono;
    private String correo;
    //Metodos
    public Cliente(int idCliente, String nombre, String empresa, String telefono, String correo) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.empresa = empresa;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cliente: " +
                " | Id Cliente: " + idCliente +
                " | Nombre: " + nombre +
                " | Empresa: " + empresa  +
                " | Telefono: " + telefono  +
                " | Correo: " + correo;
    }
}
