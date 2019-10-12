
public class no_percedero extends Productos{
        private int clave;

    public no_percedero(int clave, String nombre, float precio, String descripcion) {
        super(nombre, precio, descripcion);
        this.clave = clave;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "no_percedero{" + "clave=" + clave + '}';
    }

public float calcular(int cantidad_productos){
        System.out.println("No perecedero");
        float fin = getPrecio() * cantidad_productos;
        setPrecio(fin);
        return fin;
}


    
}
