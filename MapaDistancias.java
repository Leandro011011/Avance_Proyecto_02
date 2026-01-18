public class MapaDistancias {

    public Grafo crearGrafoBaseParaTecnico(int idTecnico) {

        Grafo grafo = new Grafo();


        Nodo tecnico = new Nodo("T-" + idTecnico, "Tecnico " + idTecnico, "TECNICO");

        Nodo alcotech = new Nodo("C-Alcotech", "Alcotech", "CLIENTE");
        Nodo infoTech  = new Nodo("C-InfoTech", "InfoTech", "CLIENTE");
        Nodo antoTech  = new Nodo("C-AntoTech", "AntoTech", "CLIENTE");

        grafo.agregarNodo(tecnico);
        grafo.agregarNodo(alcotech);
        grafo.agregarNodo(infoTech);
        grafo.agregarNodo(antoTech);


        grafo.agregarArista(new Arista(tecnico, alcotech, 10));
        grafo.agregarArista(new Arista(tecnico, infoTech, 12));
        grafo.agregarArista(new Arista(tecnico, antoTech, 8));

        return grafo;
    }
}
