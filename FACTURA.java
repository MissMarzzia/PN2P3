import java.util.Date;


public class FACTURA {
    private Date fecha;
    private Long numero;
    private double total;
    private CLIENTE clienteFactura; // faltaba una N! // y la C DE factura
    private List<FACTURADETALLE> detalleFactura;

    public FACTURA() {
    }

    public FACTURA(Date fecha, Long numero, double total, CLIENTE clienteFactura, List<FACTURADETALLE> detalleFactura) {
        this.fecha = fecha;
        this.numero = numero;
        this.total = total;
        this.clienteFactura = clienteFactura; // faltaba s, re distraida!
        this.detalleFactura = detalleFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public CLIENTE getClienteFactura(){
        return clienteFactura;
    }
    
    public void setClienteFactura(CLIENTE clienteFactura){
        this.clienteFactura = clienteFactura;
    }
    
    public List<FACTURADETALLE> getDetalleFactura() {
        return detalleFactura;
    }

    public void setDetalleFactura(List<FACTURADETALLE> detalleFactura) {
        this.detalleFactura = detalleFactura;
    }
    
}
