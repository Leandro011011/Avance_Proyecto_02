import java.util.ArrayList;
import java.util.List;

public class Grafo {

    // Atributos
    private List<Nodo> nodos;
    private List<Arista> aristas;

    // Metodos
    public Grafo() {
        this.nodos = new ArrayList<>();
        this.aristas = new ArrayList<>();
    }

    // Agregar nodo al grafo
    public void agregarNodo(Nodo nodo) {
        nodos.add(nodo);
    }

    // Agregar arista al grafo
    public void agregarArista(Arista arista) {
        aristas.add(arista);
    }

    // Obtener todos los nodos
    public List<Nodo> getNodos() {
        return nodos;
    }

    // Obtener todas las aristas
    public List<Arista> getAristas() {
        return aristas;
    }

    // Obtener las aristas que salen de un nodo
    public List<Arista> obtenerAristasDesde(Nodo nodo) {
        List<Arista> resultado = new ArrayList<>();
        for (Arista arista : aristas) {
            if (arista.getOrigen().equals(nodo)) {
                resultado.add(arista);
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Grafo\n");
        sb.append("Nodos:\n");
        for (Nodo nodo : nodos) {
            sb.append("- ").append(nodo).append("\n");
        }
        sb.append("Aristas:\n");
        for (Arista arista : aristas) {
            sb.append("- ").append(arista).append("\n");
        }
        return sb.toString();
    }
}
