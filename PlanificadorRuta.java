import java.util.ArrayList;
import java.util.List;

public class PlanificadorRuta {

    // Atributos
    private Grafo grafo;

    // Metodos
    public PlanificadorRuta(Grafo grafo) {
        this.grafo = grafo;
    }

    public String generarRutaTextoParaTecnico(int idTecnico,
                                              GestorAsignaciones gestorAsignaciones,
                                              GestorCasos gestorCasos,
                                              GestorClientes gestorClientes) {

        Nodo nodoTecnico = buscarNodoPorId("T-" + idTecnico);
        if (nodoTecnico == null) {
            return "No existe el nodo del tecnico en el grafo.";
        }

        List<Caso> casosAsignados = new ArrayList<>();
        for (Asignacion asignacion : gestorAsignaciones.getListaAsignaciones()) {
            if (asignacion.getTecnico() == idTecnico) {
                Caso caso = gestorCasos.buscarCasoPorIdBinaria(asignacion.getCaso());
                if (caso != null) {
                    casosAsignados.add(caso);
                }
            }
        }

        if (casosAsignados.isEmpty()) {
            return "El tecnico " + idTecnico + " no tiene casos asignados.";
        }

        ordenarCasosPorPrioridadYDistancia(casosAsignados, nodoTecnico, gestorClientes);


        StringBuilder sb = new StringBuilder();
        sb.append("Esta es la ruta recomendada para el tecnico ").append(idTecnico).append(":\n");

        int contador = 1;
        for (Caso caso : casosAsignados) {
            Cliente cliente = gestorClientes.buscarClientePorIdBinaria(caso.getCliente());
            String empresa = (cliente != null) ? cliente.getEmpresa() : "Empresa desconocida";

            Nodo nodoCliente = buscarNodoPorNombre(empresa);
            int distancia = (nodoCliente != null) ? obtenerDistanciaKm(nodoTecnico, nodoCliente) : -1;

            sb.append(contador).append(") Atender caso ID ")
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

        return sb.toString();
    }


    private void ordenarCasosPorPrioridadYDistancia(List<Caso> casos, Nodo nodoTecnico, GestorClientes gestorClientes) {
        Caso aux;

        for (int i = 0; i < casos.size() - 1; i++) {
            for (int j = i + 1; j < casos.size(); j++) {

                Caso a = casos.get(i);
                Caso b = casos.get(j);

                if (a.getPrioridad() < b.getPrioridad()) {
                    aux = casos.get(i);
                    casos.set(i, casos.get(j));
                    casos.set(j, aux);
                } else if (a.getPrioridad() == b.getPrioridad()) {

                    int distA = distanciaCaso(nodoTecnico, a, gestorClientes);
                    int distB = distanciaCaso(nodoTecnico, b, gestorClientes);

                    if (distA >= 0 && distB >= 0 && distA > distB) {
                        aux = casos.get(i);
                        casos.set(i, casos.get(j));
                        casos.set(j, aux);
                    }
                }
            }
        }
    }

    private int distanciaCaso(Nodo nodoTecnico, Caso caso, GestorClientes gestorClientes) {
        Cliente cliente = gestorClientes.buscarClientePorIdBinaria(caso.getCliente());
        if (cliente == null) return -1;

        Nodo nodoCliente = buscarNodoPorNombre(cliente.getEmpresa());
        if (nodoCliente == null) return -1;

        return obtenerDistanciaKm(nodoTecnico, nodoCliente);
    }

    private int obtenerDistanciaKm(Nodo origen, Nodo destino) {
        for (Arista arista : grafo.getAristas()) {
            if (arista.getOrigen().equals(origen) && arista.getDestino().equals(destino)) {
                return arista.getDistanciaKm();
            }
        }
        return -1;
    }

    private Nodo buscarNodoPorId(String id) {
        for (Nodo nodo : grafo.getNodos()) {
            if (nodo.getId().equals(id)) {
                return nodo;
            }
        }
        return null;
    }

    private Nodo buscarNodoPorNombre(String nombre) {
        for (Nodo nodo : grafo.getNodos()) {
            if (nodo.getNombre().equals(nombre)) {
                return nodo;
            }
        }
        return null;
    }
}
