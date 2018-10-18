public class TP2L3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DOMICILIO domicilio1 = new DOMICILIO();
        domicilio1.setCalle("Alberdi");
        domicilio1.setNumeroCalle(56);
        
        CLIENTE cliente1 = new CLIENTE();
        cliente1.setDenominacion("Florencia Zapata");
        cliente1.setCuit("34917816");
        cliente1.setDomicilioCliente(domicilio1);
        
        ARTICULO articulo1 = new ARTICULO();
        articulo1.setNombre("LENOVO LAPTOP");
        articulo1.setPrecio(16000.00);
        
        ARTICULO articulo2 = new ARTICULO();
        articulo2.setNombre("ASUS LAPTOP");
        articulo2.setPrecio(22000.00);
        
        ARTICULO articulo3 = new ARTICULO();
        articulo3.setNombre("ACER LAPTOP");
        articulo3.setPrecio(19000.00);
        
//        FACTURADETALLE detalle1 = new FACTURADETALLE();
//        detalle1.setArticuloDetalle((List<ARTICULO>) articulo3);
////        detalle1.setArticuloDetalle((List<ARTICULO>) articulo2);
////        detalle1.setArticuloDetalle((List<ARTICULO>) articulo1);
        
        FACTURA factura1 = new FACTURA();
        factura1.setClienteFactura(cliente1);
//        factura1.setDetalleFactura((List<FACTURADETALLE>) detalle1);
        factura1.setNumero(0000000L);
        factura1.setTotal(articulo1.getPrecio()+articulo2.getPrecio()+articulo3.getPrecio());
        
        
        System.out.println("FACTURA\nNumero Factura - "+factura1.getNumero()
                +"\nCliente - "+factura1.getClienteFactura().getDenominacion()+"\nCuit - "+factura1.getClienteFactura().getCuit()
                +"\nDetalle Factura\n"+factura1.getDetalleFactura()
                +"\nTotal - "+factura1.getTotal());
        
    }
    
}
