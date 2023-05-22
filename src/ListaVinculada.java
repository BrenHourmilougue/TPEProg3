public class ListaVinculada<T> {
    
    private Nodo primero;

    public ListaVinculada() {
        this.primero = null;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public void agregar (T objeto){
        Nodo n = new Nodo(objeto);
        //iterar por los nodos hasta que alguno tenga siguiente == null y ahi siguiente = n
    }

    public void eliminar(T objeto) {
        //Buscar el nodo que tenga contenido objeto y desvincularlo de la lista
    }

    public T buscarID(int id) {
        T obj = null;
        return obj;
    }
}
