public class Autor {
    private String apellido;
    private String genero;
    private String nombre;
    private String mail;

    public Autor(String nombre, String genero, String apellido, String mail) {
        this.apellido = apellido;
        this.genero = genero;
        this.nombre = nombre;
        this.mail = mail;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getApellido() {
        return apellido;
    }

    public String getGenero() {
        return genero;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Nombre = " + nombre +" "+  apellido + "Mail: "+ mail + "Genero: " + genero;
    }
}

