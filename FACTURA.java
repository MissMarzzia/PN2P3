import java.util.Date;


public class FACTURA {
    private Date fecha;
    private Long numero;
    private double total;

    public FACTURA() {
    }

    public FACTURA(Date fecha, Long numero, double total) {
        this.fecha = fecha;
        this.numero = numero;
        this.total = total;
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
    
    
}
