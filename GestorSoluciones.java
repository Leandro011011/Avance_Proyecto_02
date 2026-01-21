import java.util.ArrayList;
import java.util.List;

public class GestorSoluciones {
    //Atributos
    private List<Solucion> soluciones;
    //Metodos
    public GestorSoluciones() {
        this.soluciones = new ArrayList<Solucion>();
    }

    public List<Solucion> getSoluciones() {
        ordenarSolucionesPorIdBurbuja();
        return soluciones;
    }
    public void agregarSolucion(Solucion solucion) {
        this.soluciones.add(solucion);
        ordenarSolucionesPorIdBurbuja();
    }
    public boolean eliminarSolucion(int idSolucion){
        int i = 0;
        int f = soluciones.size() - 1;
        int m;
        while (i <= f){
            m = (i + f) / 2;
            if (soluciones.get(m).getIdSolucion() == idSolucion){
                soluciones.remove(m);
                return true;
            }
            if (soluciones.get(m).getIdSolucion() < idSolucion){
                i = m + 1;
            } else {
                f = m - 1;
            }
        }
        return false;
    }
    public Solucion buscarSolucionPorIdLineal(int id){
        for (Solucion solucion : soluciones) {
            if (solucion.getIdSolucion() == id) {
                return solucion;
            }
        }
        return null;
    }

    //Metodo para que no se repita los IDs de las soluciones
    public boolean existeIdSolucion(int id){
        for (Solucion actualId: soluciones){
            if ( actualId.getIdSolucion() == id ){
                return true;
            }
        }
        return false;
    }


    public void ordenarSolucionesPorIdBurbuja() {
        Solucion aux;
        for (int i = 0; i < soluciones.size() - 1; i++) {
            for (int j = i + 1; j < soluciones.size(); j++) {
                if (soluciones.get(i).getIdSolucion() > soluciones.get(j).getIdSolucion()) {
                    aux = soluciones.get(i);
                    soluciones.set(i, soluciones.get(j));
                    soluciones.set(j, aux);
                }
            }
        }
    }

}
