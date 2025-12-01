import java.util.ArrayList;
import java.util.List;

public class Tecnico {
    //Atributos
    private int idTecnico;
    private String nombre;
    private String correoInstitucional;
    private String contrasena;
    private boolean activo;
    private String especialidad;
    private int nivelExperiencia;
    private boolean disponible;
    //Metodos
    public Tecnico(int idTecnico, String nombre, String correoInstitucional, String contrasena, boolean activo, String especialidad, int nivelExperiencia, boolean disponible) {
        this.idTecnico = idTecnico;
        this.nombre = nombre;
        this.correoInstitucional = correoInstitucional;
        this.contrasena = contrasena;
        this.activo = activo;
        this.especialidad = especialidad;
        this.nivelExperiencia = nivelExperiencia;
        this.disponible = disponible;
    }
    public int getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(int idTecnico) {
        this.idTecnico = idTecnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void setNivelExperiencia(int nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }




    @Override
    public String toString() {
        return "Tecnico: " +
                " | Id Tecnico: " + idTecnico +
                " | Nombre: " + nombre +
                " | Correo Institucional: " + correoInstitucional +
                " | Activo: " + activo +
                " | Especialidad: " + especialidad +
                " | Nivel Experiencia: " + nivelExperiencia +
                " | Disponible: " + disponible;
    }
}
