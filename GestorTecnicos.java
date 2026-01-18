import java.net.IDN;
import java.util.ArrayList;
import java.util.List;

public class GestorTecnicos {
    //Atributos
    private List<Tecnico> listaTecnicos;
    //Metodos
    public GestorTecnicos() {
        this.listaTecnicos = new ArrayList<Tecnico>();
    }

    public List<Tecnico> getListaTecnicos() {
        return listaTecnicos;
    }
    public void agregarTecnico(Tecnico tecnico) {
        this.listaTecnicos.add(tecnico);
        ordenarTecnicosPorIdBurbuja();
    }
    public boolean eliminarTecnico(int idTecnico){
        int i = 0;
        int f = listaTecnicos.size() - 1;
        int m;
        while (i <= f){
            m = (i + f) / 2;
            if (listaTecnicos.get(m).getIdTecnico() == idTecnico){
                listaTecnicos.remove(m);
                return true;
            }
            if (listaTecnicos.get(m).getIdTecnico() < idTecnico){
                i = m + 1;
            } else {
                f = m - 1;
            }
        }
        return false;
    }

    public Tecnico buscarTecnicoPorIdBinaria(int idTecnico){
        int i = 0;
        int f = listaTecnicos.size() - 1;
        int m;
        while (i <= f){
            m = (i + f) / 2;
            if (listaTecnicos.get(m).getIdTecnico() == idTecnico){
                return listaTecnicos.get(m);
            }
            if (listaTecnicos.get(m).getIdTecnico() < idTecnico){
                i = m + 1;
            } else {
                f = m - 1;
            }
        }
        return null;
    }

    // Metodo para que no se repita los IDs de los tecnicos
    public boolean existeIdTecnico(int id){
        for (Tecnico actualId: listaTecnicos){
            if ( actualId.getIdTecnico() == id){
                return true;
            }
        }
        return false;
    }

    public Tecnico buscarTecnicoNombre(String nombre){
        for (Tecnico tecnico: listaTecnicos){
            if (tecnico.getNombre().trim().equals(nombre)){
                return tecnico;
            }
        }
        return null;
    }

    public void ordenarTecnicosPorNombreBurbuja(){
        Tecnico aux;
        for (int i = 0; i < listaTecnicos.size() - 1; i++) {
            for (int j = i + 1; j < listaTecnicos.size(); j++) {
                if (listaTecnicos.get(i).getNombre().compareTo(listaTecnicos.get(j).getNombre()) > 0) {
                    aux = listaTecnicos.get(i);
                    listaTecnicos.set(i, listaTecnicos.get(j));
                    listaTecnicos.set(j, aux);
                }
            }
        }
    }

    public void ordenarTecnicosPorNivelExperienciaBurbuja(){
        Tecnico aux;
        for (int i = 0; i < listaTecnicos.size() - 1; i++) {
            for (int j = i + 1; j < listaTecnicos.size(); j++) {
                if (listaTecnicos.get(i).getNivelExperiencia() > listaTecnicos.get(j).getNivelExperiencia()) {
                    aux = listaTecnicos.get(i);
                    listaTecnicos.set(i, listaTecnicos.get(j));
                    listaTecnicos.set(j, aux);
                }
            }
        }
    }


    public void ordenarTecnicosPorIdBurbuja() {
        Tecnico aux;
        for (int i = 0; i < listaTecnicos.size() - 1; i++) {
            for (int j = i + 1; j < listaTecnicos.size(); j++) {
                if (listaTecnicos.get(i).getIdTecnico() > listaTecnicos.get(j).getIdTecnico()) {
                    aux = listaTecnicos.get(i);
                    listaTecnicos.set(i, listaTecnicos.get(j));
                    listaTecnicos.set(j, aux);
                }
            }
        }
    }

}
