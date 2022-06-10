/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa12_clasefactura;

/**
 *
 * @author ernes
 */
public class Factura {
    private java.text.DecimalFormat formato = new java.text.DecimalFormat("0.00");
    private String numerop;
    private String dpieza;
    private double narticulos;
    private double precioa;
    private String obtenerMontoFactura;

    public Factura() {
    }

    public Factura(String numerop, String dpieza, double narticulos, double precioa) {
        this.numerop = numerop;
        this.dpieza = dpieza;
        this.narticulos = narticulos;
        this.precioa = precioa;
    }

    Factura(String text, String text0, double parseDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNumerop() {
        return numerop;
    }

    public void setNumerop(String numerop) {
        this.numerop = numerop;
    }

    public String getDpieza() {
        return dpieza;
    }

    public void setDpieza(String dpieza) {
        this.dpieza = dpieza;
    }

    public double getNarticulos() {
        return narticulos;
    }

    public void setNarticulos(double narticulos) {
        this.narticulos = narticulos;
    }

    public double getPrecioa() {
        return precioa;
    }

    public void setPrecioa(double precioa) {
        this.precioa = precioa;
    }

    public String getObtenerMontoFactura() {
        Double resultado = narticulos * precioa;
        if (resultado<0){
        String e = "Error";
        }
        String mresultado = formato.format(resultado);
        String mnumerop = numerop;
        String mdpieza = dpieza;

        obtenerMontoFactura = ("Descripcion del articulo" + "\n" + mdpieza + "\n"
                + "Numero de piezas" + "\n" +mnumerop+"\n"+"Su total es de"+mresultado);
        return obtenerMontoFactura;
    }

    public void setObtenerMontoFactura(String obtenerMontoFactura) {
        this.obtenerMontoFactura = obtenerMontoFactura;
    }

}
