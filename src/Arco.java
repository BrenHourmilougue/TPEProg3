public class Arco <T> {

    private Vertice verticeOrigen;
    private Vertice vericeDestino;
    private T etiqueta;

    public Arco(Vertice verticeOrigen, Vertice vericeDestino, T etiqueta) {
        this.verticeOrigen = verticeOrigen;
        this.vericeDestino = vericeDestino;
        this.etiqueta = etiqueta;
    }

    public Vertice getVerticeOrigen() {
        return verticeOrigen;
    }

    public void setVerticeOrigen(Vertice verticeOrigen) {
        this.verticeOrigen = verticeOrigen;
    }

    public Vertice getVericeDestino() {
        return vericeDestino;
    }

    public void setVericeDestino(Vertice vericeDestino) {
        this.vericeDestino = vericeDestino;
    }

    public T getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(T etiqueta) {
        this.etiqueta = etiqueta;
    }
}
