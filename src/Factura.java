import java.time.LocalDateTime;
import java.util.UUID;

public class Factura {
    private Cliente cliente;
    private UUID id;
    private float montoTotal;
    private LocalDateTime fecha;
    private ItemVenta[] ventas= new ItemVenta[10];
    public Factura(Cliente cliente,float montoTotal,ItemVenta[] item){
        this.ventas=item;
        this.cliente=cliente;
        this.montoTotal=calcularTotal();
        this.id=UUID.randomUUID();
        this.fecha=LocalDateTime.now();
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    public UUID getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public float getMontoTotal() {
        return montoTotal;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public float totalConDescuento (){
        return montoTotal=((100-cliente.getDescuento())*montoTotal/100);
    }
    public void mostrarFactura(){
        System.out.println("Nombre del cliente: "+ cliente.getNombre() + " Id Factura: "+id + " Monto: "+ montoTotal + " Monto Con descuento: " + totalConDescuento());
        for (int i=0;i<ventas.length;i++){
            System.out.println("NOmbre: "+ ventas[i].getNombre() + " Precio: "+ ventas[i].getPrecioUnitario());
        }
    }

    public ItemVenta[] getVentas() {
        return ventas;
    }

    public void setVentas(ItemVenta[] ventas) {
        this.ventas = ventas;
    }
    public float calcularTotal(){
        float total=0;
        for (int i=0;i< ventas.length;i++){
            total=total + ventas[i].getPrecioUnitario();
        }
        return total;
    }
}
