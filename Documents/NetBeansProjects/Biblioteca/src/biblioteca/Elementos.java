package biblioteca;

public abstract class Elementos {
    String titulo, tematica;
    int stock, categoria, estado, id;
    
    public abstract void crearElementos();
    
    public abstract void consultarElementos();
    
    public abstract void editarElementos();
    
    public abstract void desactivarElementos();
}
