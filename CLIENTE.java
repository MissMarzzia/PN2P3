public class CLIENTE {
    private String denominacion,
            cuit;
    private DOMICILIO domicilioCliente;
    
    public CLIENTE(){
    }

   public CLIENTE(String denominacion, String cuit, DOMICILIO domicilioCliente) {
        this.denominacion = denominacion;
        this.cuit = cuit;
        this.domicilioCliente = domicilioCliente;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public DOMICILIO getDomicilioCliente() {
        return domicilioCliente;
    }

    public void setDomicilioCliente(DOMICILIO domicilioCliente) {
        this.domicilioCliente = domicilioCliente;
    }
    
    
    
}
