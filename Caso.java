

public class Caso {
    //Atributos
    private int idCaso;
    private String titulo;
    private String descripcion;
    private int prioridad;
    private String estado;
    private String canalContacto;
    private String fechaCreacion;
    private String fechaCierre;
    private int cliente;
    //Metodos
    public Caso(int idCaso, String titulo, String descripcion, int prioridad, String estado, String canalContacto, String fechaCreacion, String fechaCierre, int cliente) {
        this.idCaso = idCaso;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = estado;
        this.canalContacto = canalContacto;
        this.fechaCreacion = fechaCreacion;
        this.fechaCierre = fechaCierre;
        this.cliente = cliente;
    }

    public int getIdCaso() {
        return idCaso;
    }

    public void setIdCaso(int idCaso) {
        this.idCaso = idCaso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCanalContacto() {
        return canalContacto;
    }

    public void setCanalContacto(String canalContacto) {
        this.canalContacto = canalContacto;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(String fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }



    @Override
    public String toString() {
        return "Caso: " +
                " | Id Caso: " + idCaso +
                " | Titulo: " + titulo +
                " | Descripcion: " + descripcion  +
                " | Prioridad: " + prioridad +
                " | Estado: " + estado +
                " | Canal Contacto: " + canalContacto  +
                " | Fecha Creacion: " + fechaCreacion  +
                " | Fecha Cierre: " + fechaCierre  +
                " | ID Cliente: " + cliente;
    }
}
