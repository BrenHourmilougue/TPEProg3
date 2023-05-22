public interface Grafo<T> {

    public void agregarVertice( int verticeID );
    public void eliminarVertice(int verticeID );
    public void agregarVertice(Vertice v);
    public void eliminarVertice(Vertice v);

    public void agregarArco(Arco a);
    public void eliminarArco(Arco a);

}
