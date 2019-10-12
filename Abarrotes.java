
public class Abarrotes {

    
    public static void main(String[] args) {
        
        Productos[] productos = new Productos[6];
        productos[0] = new Producto_perecedero(5, "sal", 15, "Granos blancos");
        productos[1] = new Producto_perecedero(15, "Cafe", 30, "Granos de cafe tostado");
        productos[2] = new Producto_perecedero(30, "Rocaleta", 10, "Paleta esferica");
        productos[3] = new Producto_perecedero(12, "Rancheritoos", 12, "Totopos enchilados");
        productos[4] = new Producto_perecedero(32, "Enperador", 29, "Galleta con sabor a limon");
        productos[5] = new Producto_perecedero(71, "Obleas", 36, "Galletas obaladas");
        
        
         for(int i = 0; i < productos.length; i++){
            System.out.println("Precio del producto "+(i + 1) +" es "+ productos[i].getPrecio() + " x 5 productos");
            System.out.println("* Total a pagar: "+productos[i].calcular(5));
        }
        
       
    }
    
}
