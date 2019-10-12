
public class Producto_perecedero extends Productos {
    private int dias_para_caducar;

   
    
    public Producto_perecedero(int dias_para_caducar, String nombre, float precio, String descripcion) {
        super(nombre, precio, descripcion);
        this.dias_para_caducar = dias_para_caducar;
    }

    @Override
    public String toString() {
        return "Producto_perecedero{" + "dias_para_caducar=" + dias_para_caducar + '}';
    }

    public int getDias_para_caducar() {
        return dias_para_caducar;
    }

    public void setDias_para_caducar(int dias_para_caducar) {
        this.dias_para_caducar = dias_para_caducar;
    }
    
    float precio_total = 0;
    public float calcular(int cantidad_productos){
        System.out.println("Perecedero");
        float precio_final = super.calcular(cantidad_productos);
        System.out.println("Precio total:"+precio_final +" \n * El descuento es ...");
        if(getDias_para_caducar() == 5){
            precio_total = precio_final - (precio_final / 4);
            setPrecio(precio_total);
        }else if(getDias_para_caducar() == 15){
            precio_total = precio_final - (precio_final / 3);
            setPrecio(precio_total);
        }else if(getDias_para_caducar() == 30){
            precio_total = precio_final - (precio_final / 2);
            setPrecio(precio_total);
        }
        return precio_total;
    
    
     }
}
