import java.util.UUID;

public class Cliente {
    private UUID id;
    private String nombre;
    private String mail;
    private float descuento;

    public Cliente (String nombre,String mail,float descuento){
        this.descuento=descuento;
        this.id=UUID.randomUUID();
        this.mail=mail;
        this.nombre=nombre;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public float getDescuento() {
        return descuento;
    }

    public String getMail() {
        return mail;
    }

    public UUID getId() {
        return id;
    }
    public void mostrarCliente(){
        System.out.println("CLiente:[ "+ " Nombre: " + this.nombre + " Id: "+ this.id + " Email: " + this.mail + " Descuento: " + this.descuento);
    }
}
