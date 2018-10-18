public class FACTURADETALLE {
    private int cantidad;
    private List<ARTICULO> articuloDetalle;

    public FACTURADETALLE() {
    }

    public FACTURADETALLE(int cantidad, List<ARTICULO> articuloDetalle) {
        this.cantidad = cantidad;
        this.articuloDetalle = articuloDetalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public List<ARTICULO> getArticuloDetalle() {
        return articuloDetalle;
    }

    public void setArticuloDetalle(List<ARTICULO> articuloDetalle) {
        this.articuloDetalle = articuloDetalle;
    }
    
    
}
