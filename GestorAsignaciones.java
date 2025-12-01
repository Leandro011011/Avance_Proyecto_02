import java.util.ArrayList;
import java.util.List;

public class GestorAsignaciones {
    //Atributos
    private List<Asignacion> listaAsignaciones;
    //Metodos
    public GestorAsignaciones() {
        this.listaAsignaciones = new ArrayList<Asignacion>();
    }

    public List<Asignacion> getListaAsignaciones() {
        return listaAsignaciones;

    }

    public void agregarAsignacion(Asignacion asignacion) {
        this.listaAsignaciones.add(asignacion);
        orderarAsignaciones();
    }
    public boolean eliminarAsignacion(int id ){
        int i =0;
        int f = listaAsignaciones.size() - 1;
        int m;
        while(i <= f){
            m = (i + f) / 2;
            if(listaAsignaciones.get(m).getIdAsignacion() == id){
                listaAsignaciones.remove(m);
                return true;
            } else if(listaAsignaciones.get(m).getIdAsignacion() < id){
                i = m + 1;
            } else {
                f = m - 1;
            }
        }
        return false;
    }

    public Asignacion buscarAsignacion(int id){
        int i =0;
        int f = listaAsignaciones.size() - 1;
        int m;
        while(i <= f){
            m = (i + f) / 2;
            if(listaAsignaciones.get(m).getIdAsignacion() == id){
                return listaAsignaciones.get(m);
            } else if(listaAsignaciones.get(m).getIdAsignacion() < id){
                i = m + 1;
            } else {
                f = m - 1;
            }
        }
        return null;
    }

    public void orderarAsignaciones(){
        Asignacion aux;
        for(int i = 0; i < listaAsignaciones.size() - 1; i++){
            for(int j = i + 1; j < listaAsignaciones.size(); j++){
                if(listaAsignaciones.get(i).getIdAsignacion() > listaAsignaciones.get(j).getIdAsignacion()){
                    aux = listaAsignaciones.get(i);
                    listaAsignaciones.set(i, listaAsignaciones.get(j));
                    listaAsignaciones.set(j, aux);
                }
            }
        }
    }

}
