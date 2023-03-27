import java.util.UUID;

public class ItemVenta {
    private UUID id;
    private float precioUnitario;
    private String nombre;
    private String descripcion;

    public ItemVenta(float precioUnitario,String nombre,String descripcion){
        this.descripcion=descripcion;
        this.nombre=nombre;
        this.precioUnitario=precioUnitario;
        this.id=UUID.randomUUID();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getNombre() {
        return nombre;
    }

    public UUID getId() {
        return id;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
