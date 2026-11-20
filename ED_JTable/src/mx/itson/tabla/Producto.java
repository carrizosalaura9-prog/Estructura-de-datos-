package mx.itson.tabla;

/**
 *
 * @author Dell
 */
public class Producto {
    
    private String nombre;
    private int piezas;
    private double precio;

    public Producto(String nombre, int piezas, double precio) {
        this.nombre = nombre;
        this.piezas = piezas;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPiezas() {
        return piezas;
    }

    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
