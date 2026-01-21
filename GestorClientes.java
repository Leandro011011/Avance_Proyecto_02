import java.util.ArrayList;
import java.util.List;

public class GestorClientes {
    //Atributos
    private List<Cliente> clientes;
    //Metodos
    public GestorClientes() {
        this.clientes = new ArrayList<Cliente>();
    }

    public List<Cliente> getClientes() {
        ordenarClientesPorIdBurbuja();
        return clientes;
    }
    public void agregarCliente(Cliente cliente) {
        this.clientes.add(cliente);
        ordenarClientesPorIdBurbuja();
    }
    public boolean eliminarCliente(int idCliente){
        int i = 0;
        int f = clientes.size() - 1;
        int m;
        while (i <= f){
            m = (i + f) / 2;
            if (clientes.get(m).getIdCliente() == idCliente){
                clientes.remove(m);
                return true;
            }
            if (clientes.get(m).getIdCliente() < idCliente){
                i = m + 1;
            } else {
                f = m - 1;
            }
        }
        return false;
    }
    public Cliente buscarClientePorIdBinaria(int idCliente){
        int i = 0;
        int f = clientes.size() - 1;
        int m;
        while (i <= f){
            m = (i + f) / 2;
            if (clientes.get(m).getIdCliente() == idCliente){
                return clientes.get(m);
            }
            if (idCliente < clientes.get(m).getIdCliente()){
                f = m - 1;
            } else {
                i = m + 1;
            }
        }
        return null;
    }

    //Netodo para que no repita los IDs de los clientes
    public boolean existeIdCliente(int id){
        for (Cliente actualId: clientes){
            if ( actualId.getIdCliente() == id ){
                return true;
            }
        }
        return false;
    }

    public void ordenarClientesPorNombreBurbuja(){
        Cliente aux;
        for (int i = 0; i < clientes.size() - 1; i++) {
            for (int j = i + 1; j < clientes.size(); j++) {
                if (clientes.get(i).getNombre().compareTo(clientes.get(j).getNombre()) > 0) {
                    aux = clientes.get(i);
                    clientes.set(i, clientes.get(j));
                    clientes.set(j, aux);
                }
            }
        }
    }

    public void ordenarClientesPorIdBurbuja() {
        Cliente aux;
        for (int i = 0; i < clientes.size() - 1; i++) {
            for (int j = i+1; j < clientes.size(); j++) {
                if (clientes.get(i).getIdCliente() > clientes.get(j).getIdCliente()) {
                    aux = clientes.get(i);
                    clientes.set(i, clientes.get(j));
                    clientes.set(j, aux);
                }
            }
        }
    }

}
