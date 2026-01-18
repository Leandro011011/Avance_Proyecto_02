public class PrioridadCaso {

    // Atributos
    private int nivel;
    private String descripcion;

    // Metodos
    public PrioridadCaso(int nivel) {
        this.nivel = nivel;
        this.descripcion = generarDescripcion(nivel);
    }

    private String generarDescripcion(int nivel) {
        if (nivel == 1) return "Baja";
        if (nivel == 2) return "Media";
        if (nivel == 3) return "Alta";
        if (nivel == 4) return "Critica";
        if (nivel == 5) return "Super Importante";
        return "Desconocida";
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
        this.descripcion = generarDescripcion(nivel);
    }

    public String getDescripcion() {
        return descripcion;
    }

    // Comparar prioridades
    public boolean esMasUrgenteQue(PrioridadCaso otra) {
        return this.nivel > otra.nivel;
    }

    @Override
    public String toString() {
        return descripcion + " (nivel " + nivel + ")";
    }
}
