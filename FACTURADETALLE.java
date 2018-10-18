public class FACTURADETALLE {
    private int cantidad;
    private ARTICULO articuloDetalle;

    public FACTURADETALLE() {
    }

    public FACTURADETALLE(int cantidad, ARTICULO articuloDetalle) {
        this.cantidad = cantidad;
        this.articuloDetalle = articuloDetalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public ARTICULO getArticuloDetalle(){
        return articuloDetalle;
    }
    
    public void setArticuloDetalle(ARTICULO articuloDetalle){
        this.articuloDetalle = articuloDetalle; //Faltaba este cachito. 
    }
    
    
}
