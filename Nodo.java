import java.util.Objects;

public class Nodo {
    // Atributos
    private String id;
    private String nombre;
    private String tipo;

    // Metodos
    public Nodo(String id, String nombre, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Para comparar nodos por id
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nodo)) return false;
        Nodo nodo = (Nodo) o;
        return Objects.equals(id, nodo.id);
    }


    @Override
    public String toString() {
        return "Nodo: " +
                " | Id: " + id +
                " | Nombre: " + nombre +
                " | Tipo: " + tipo;
    }
}
