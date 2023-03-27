import java.util.Arrays;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        Autor[] autores = new Autor[10];

        Autor joshua = new Autor("Joshua","Masculino","Bosch","Joshua@gmail.com");
        System.out.println(joshua);

        Autor perro = new Autor("Luis","Masculino","Borges","LuisBorgues@gmail.com");

        autores[0] = joshua;
        autores[1] = perro;

        Libro libroJoshua = new Libro(autores,"Java",150,450.0f);
        System.out.println(libroJoshua);

        libroJoshua.setPrecio(500);
        libroJoshua.setStock(libroJoshua.getStock()+50);
        System.out.println(libroJoshua);
        Cliente pedro = new Cliente("Pedro","Pedro@gmail.com",25.0f);
        pedro.mostrarCliente();
        Factura facturaPedro =new Factura(pedro,800.0f);
        facturaPedro.mostrarFactura();



    }

}