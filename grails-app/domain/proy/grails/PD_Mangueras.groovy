package proy.grails

class PD_Mangueras {
    
    PD_Surtidor pd_Surtidor
    AD_Producto ad_Producto
    static hasMany = [pd_Movimiento_Turno:PD_Movimiento_Turno]
        
    static constraints = {
        
    }
}
