public class Arista {
    // Atributos
    private Nodo origen;
    private Nodo destino;
    private int distanciaKm;

    // Metodos
    public Arista(Nodo origen, Nodo destino, int distanciaKm) {
        this.origen = origen;
        this.destino = destino;
        this.distanciaKm = distanciaKm;
    }

    public Nodo getOrigen() {
        return origen;
    }

    public void setOrigen(Nodo origen) {
        this.origen = origen;
    }

    public Nodo getDestino() {
        return destino;
    }

    public void setDestino(Nodo destino) {
        this.destino = destino;
    }

    public int getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(int distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    @Override
    public String toString() {
        return "Arista: " +
                "Origen: " + origen.getNombre() +
                " -> Destino: " + destino.getNombre() +
                " | Distancia: " + distanciaKm + " km";
    }
}
