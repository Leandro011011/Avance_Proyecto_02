import java.util.ArrayList;
import java.util.List;

public class GestorCasos {
    //Atributos
    private List<Caso> casos;
    //Metodos
    public GestorCasos(){
        this.casos = new ArrayList<Caso>();
    }

    public List<Caso> getCasos() {
        return casos;
    }
    public void agregarCaso(Caso caso) {
        this.casos.add(caso);
        ordenarCasosPorIdSeleccion();
    }
    public boolean eliminarCaso(int idCaso){
        int i = 0;
        int f = casos.size() - 1;
        int m;
        while (i <= f){
            m = (i + f) / 2;
            if (casos.get(m).getIdCaso() == idCaso){
                casos.remove(m);
                return true;
            }
            if (casos.get(m).getIdCaso() < idCaso){
                i = m + 1;
            } else {
                f = m - 1;
            }
        }
        return false;
    }

    public Caso buscarCasoPorIdBinaria(int idCaso){
        int i = 0;
        int f = casos.size() - 1;
        int m;
        while (i <= f){
            m = (i + f) / 2;
            if (casos.get(m).getIdCaso() == idCaso){
                return casos.get(m);
            }
            if (casos.get(m).getIdCaso() < idCaso){
                i = m + 1;
            } else {
                f = m - 1;
            }
        }
        return null;
    }

    // Metodo para que no repita IDs en los casos
    public boolean existeIdCaso(int id){
        for (Caso actualId: casos){
            if ( actualId.getIdCaso() == id ){
                return true;
            }
        }

        return false;
    }

    public void ordenarCasosPorPrioridadBurbuja(){
        Caso aux;
        for (int i = 0; i < casos.size() - 1; i++) {
            for (int j = i + 1; j < casos.size(); j++) {
                if (casos.get(i).getPrioridad() > casos.get(j).getPrioridad()) {
                    aux = casos.get(i);
                    casos.set(i, casos.get(j));
                    casos.set(j, aux);
                }
            }
        }
    }

    public void ordenarCasosPorIdSeleccion(){
        Caso aux;
        for (int i = 0; i < casos.size() - 1; i++) {
            for (int j = i + 1; j < casos.size(); j++) {
                if (casos.get(i).getIdCaso() > casos.get(j).getIdCaso()) {
                    aux = casos.get(i);
                    casos.set(i, casos.get(j));
                    casos.set(j, aux);
                }
            }
        }
    }
}
