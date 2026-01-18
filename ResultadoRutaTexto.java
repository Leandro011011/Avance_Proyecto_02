import java.util.List;

public class ResultadoRutaTexto {

    public String generarTextoRuta(int idTecnico,
                                   List<Caso> casosOrdenados,
                                   Nodo nodoTecnico,
                                   Grafo grafo,
                                   GestorClientes gestorClientes) {

        if (casosOrdenados == null || casosOrdenados.isEmpty()) {
            return "El tecnico " + idTecnico + " no tiene casos para atender.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Esta es la ruta recomendada para el tecnico ").append(idTecnico).append(":\n");
        sb.append("Orden por urgencia (y distancia si empatan):\n\n");

        int contador = 1;
        for (Caso caso : casosOrdenados) {

            Cliente cliente = gestorClientes.buscarClientePorIdBinaria(caso.getCliente());
            String empresa = (cliente != null) ? cliente.getEmpresa() : "Empresa desconocida";

            Nodo nodoCliente = buscarNodoPorNombre(grafo, empresa);
            int distancia = (nodoCliente != null) ? obtenerDistanciaKm(grafo, nodoTecnico, nodoCliente) : -1;

            sb.append(contador).append(") Atender primero caso ID ")
                    .append(caso.getIdCaso())
                    .append(" (prioridad ").append(caso.getPrioridad()).append(")")
                    .append(" - Cliente: ").append(empresa);

            if (distancia >= 0) {
                sb.append(" - Distancia: ").append(distancia).append(" km");
            } else {
                sb.append(" - Distancia: no disponible");
            }

            sb.append("\n");
            contador++;
        }

        sb.append("\nEsta es la ruta mas corta segun la prioridad definida (urgencia primero).");
        return sb.toString();
    }

    private Nodo buscarNodoPorNombre(Grafo grafo, String nombre) {
        for (Nodo nodo : grafo.getNodos()) {
            if (nodo.getNombre().equals(nombre)) {
                return nodo;
            }
        }
        return null;
    }

    private int obtenerDistanciaKm(Grafo grafo, Nodo origen, Nodo destino) {
        for (Arista arista : grafo.getAristas()) {
            if (arista.getOrigen().equals(origen) && arista.getDestino().equals(destino)) {
                return arista.getDistanciaKm();
            }
        }
        return -1;
    }
}
