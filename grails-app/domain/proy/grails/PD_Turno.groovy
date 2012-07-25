package proy.grails

class PD_Turno {
    
    Date f_Inicio_Turno
    Date f_Final_Turno
    AD_Usuarios ad_Usuarios
    PD_Isla pd_Isla
    static hasMany = [pd_Movimiento_Turno:PD_Movimiento_Turno]

    static constraints = {
        f_Inicio_Turno (blank:false)
        f_Final_Turno (nullable:true)
    }
}
