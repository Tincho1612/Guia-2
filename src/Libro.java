public class Libro {
    private String Titulo;
    private int stock;
    private float precio;

    private Autor[] autores = new Autor[10];

    public void setAutores(Autor[] autores) {
        this.autores = autores;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    public Libro (Autor[] autores,String titulo,int stock,float precio){
        this.autores=autores;
        this.precio=precio;
        this.stock=stock;
        this.Titulo=titulo;
    }

    public Autor[] getAutor() {
        return autores;
    }

    public float getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public String getTitulo() {
        return Titulo;
    }

    public StringBuilder imprimirAutores()
    {
        StringBuilder imprimir = new StringBuilder();
        for(Autor autor: autores)
        {
            if(autor!=null){
                imprimir.append(autor.getNombre());
                imprimir.append(" ");
                imprimir.append(autor.getApellido());
                imprimir.append(" ");
            }
        }
        return imprimir;
    }

    @Override
    public String toString() {
        return "Titulo: " + Titulo + "Autores: " + imprimirAutores() + "Precio: " + precio;
    }
}
