public class DOMICILIO {
    private String calle;
    private int numeroCalle;

    public DOMICILIO() {
    }

    public DOMICILIO(String calle, int numeroCalle) {
        this.calle = calle;
        this.numeroCalle = numeroCalle;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(int numeroCalle) {
        this.numeroCalle = numeroCalle;
    }
    
    
}
