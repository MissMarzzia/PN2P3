public class ARTICULO {
    private int nombre;
    private double precio;

    public ARTICULO() {
    }

    public ARTICULO(int nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
