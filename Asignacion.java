public class Asignacion {
    //Atributos
    private int idAsignacion;
    private int caso;
    private int tecnico;
    private String fechaAsignacion;
    private String fechaInicioAtencion;
    private String fechaFinAtencion;
    private String estadoAsignacion;
    //Metodos
    public Asignacion(int idAsignacion, int caso, int tecnico, String fechaAsignacion, String fechaInicioAtencion, String fechaFinAtencion, String estadoAsignacion) {
        this.idAsignacion = idAsignacion;
        this.caso = caso;
        this.tecnico = tecnico;
        this.fechaAsignacion = fechaAsignacion;
        this.fechaInicioAtencion = fechaInicioAtencion;
        this.fechaFinAtencion = fechaFinAtencion;
        this.estadoAsignacion = estadoAsignacion;
    }

    public int getIdAsignacion() {
        return idAsignacion;
    }

    public void setIdAsignacion(int idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    public int getCaso() {
        return caso;
    }

    public void setCaso(int caso) {
        this.caso = caso;
    }

    public int getTecnico() {
        return tecnico;
    }

    public void setTecnico(int tecnico) {
        this.tecnico = tecnico;
    }

    public String getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(String fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public String getFechaInicioAtencion() {
        return fechaInicioAtencion;
    }

    public void setFechaInicioAtencion(String fechaInicioAtencion) {
        this.fechaInicioAtencion = fechaInicioAtencion;
    }

    public String getFechaFinAtencion() {
        return fechaFinAtencion;
    }

    public void setFechaFinAtencion(String fechaFinAtencion) {
        this.fechaFinAtencion = fechaFinAtencion;
    }

    public String getEstadoAsignacion() {
        return estadoAsignacion;
    }

    public void setEstadoAsignacion(String estadoAsignacion) {
        this.estadoAsignacion = estadoAsignacion;
    }

    public void marcarEnAtencion(){
        this.estadoAsignacion = "En Atencion";

    }
    public void marcarFinalizado(){
        this.estadoAsignacion = "Finalizado";
    }

    @Override
    public String toString() {
        return "Asignacion: " +
                " | Id Asignacion: " + idAsignacion +
                " | ID Caso: " + caso +
                " | Tecnico: " + tecnico +
                " | Fecha Asignacion: " + fechaAsignacion +
                " | Fecha InicioAtencion: " + fechaInicioAtencion  +
                " | Fecha FinAtencion: " + fechaFinAtencion  +
                " | Estado Asignacion: " + estadoAsignacion;
    }
}
