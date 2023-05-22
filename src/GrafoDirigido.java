public class GrafoDirigido<T> implements Grafo {

    private ListaVinculada<Vertice> vertices;
    private ListaVinculada<Arco> arcos;

    public GrafoDirigido() {
        this.vertices = new ListaVinculada<Vertice>();
        this.arcos = new ListaVinculada<Arco>();
    }

    @Override
    public void agregarVertice(int verticeID) {
        Vertice vertice = this.vertices.buscarID(verticeID);
        this.vertices.agregar(vertice);
    }

    @Override
    public void eliminarVertice(int verticeID) {
        Vertice vertice = this.vertices.buscarID(verticeID);
        this.vertices.eliminar(vertice);
    }

    @Override
    public void agregarVertice(Vertice v) {
        this.vertices.agregar(v);
    }

    @Override
    public void eliminarVertice(Vertice v) {
        this.vertices.eliminar(v);
    }

    public void agregarArco(Arco a) {
        this.arcos.agregar(a);
    }

    public void eliminarArco(Arco a) {
        this.arcos.eliminar(a);
    }
}
