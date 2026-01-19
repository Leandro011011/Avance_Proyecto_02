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
            // si el referente de la mitad es menor al id que se busca
            // pues acortamos el inicio, porque todos esos son menores, incluido el actual
            } else if(listaAsignaciones.get(m).getIdAsignacion() < id){
                i = m + 1;
            } else { // y si es mayor el de la mitad pues acortamos el final
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

    //Metodo de busqueda lineal para que los IDs no se repitan
    public boolean existeIdAsignacion(int id){
        for(Asignacion actualId: listaAsignaciones){// busca entre todos los ids de la lista
            if (actualId.getIdAsignacion() == id){// si existe ese id en la lista retorna true
                return true;
            }
        }
        return false;
    }


//    SE ORDENA LAS ASIGNACIONES SEGUN SU ID
    public void orderarAsignaciones(){
        Asignacion aux;
        for(int i = 0; i < listaAsignaciones.size() - 1; i++){
            for(int j = i + 1; j < listaAsignaciones.size(); j++){
//                SI ES MAYOR EL ANTERIOR , PUES ACPLICAMOS EL BURBUJEO
                if(listaAsignaciones.get(i).getIdAsignacion() > listaAsignaciones.get(j).getIdAsignacion()){
                    aux = listaAsignaciones.get(i);// GUARDAMOS EN AUX LO DE I
                    listaAsignaciones.set(i, listaAsignaciones.get(j)); // ESTABLECEMOS LO DE J EN I
                    listaAsignaciones.set(j, aux); // ESTABLECEMOS LO DE AUX(I) EN J
                }
            }
        }
    }

}
