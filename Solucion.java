public class Solucion {
    //Atributos
    private int idSolucion;
    private String descripcion;
    private String fechaRegistro;
    private int tecnicoResponsable;
    private int casoAsociado;
    private String notaAdicional;
    //Metodos
    public Solucion(int idSolucion, String descripcion, String fechaRegistro, int tecnicoResponsable, int casoAsociado, String notaAdicional) {
        this.idSolucion = idSolucion;
        this.descripcion = descripcion;
        this.fechaRegistro = fechaRegistro;
        this.tecnicoResponsable = tecnicoResponsable;
        this.casoAsociado = casoAsociado;
        this.notaAdicional = notaAdicional;
    }

    public int getIdSolucion() {
        return idSolucion;
    }

    public void setIdSolucion(int idSolucion) {
        this.idSolucion = idSolucion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getTecnicoResponsable() {
        return tecnicoResponsable;
    }

    public void setTecnicoResponsable(int tecnicoResponsable) {
        this.tecnicoResponsable = tecnicoResponsable;
    }

    public int getCasoAsociado() {
        return casoAsociado;
    }

    public void setCasoAsociado(int casoAsociado) {
        this.casoAsociado = casoAsociado;
    }

    public String getNotaAdicional() {
        return notaAdicional;
    }

    public void setNotaAdicional(String notaAdicional) {
        this.notaAdicional = notaAdicional;
    }

    @Override
    public String toString() {
        return "Solucion: " +
                " | Id Solucion: " + idSolucion +
                " | Descripcion: " + descripcion  +
                " | Fecha Registro: " + fechaRegistro  +
                " | ID Tecnico Responsable: " + tecnicoResponsable +
                " | ID Caso Asociado: " + casoAsociado +
                " | Nota Adicional: " + notaAdicional;
    }
}
