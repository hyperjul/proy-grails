package proy.grails

class PD_Movimiento_Turno {
    
    Date f_Inicial_Despacho
    Date f_Final_Despacho
    Double cantidad_Despacho
    Double vlr_Venta_Despacho
    Double vlr_Iva_Despacho
    PD_Mangueras pd_Mangueras
    AD_Producto ad_Producto
    PD_Turno pd_Turno

    static constraints = {
    }
}
