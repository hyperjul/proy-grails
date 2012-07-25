package proy.grails

class PD_Isla {
    
    String nombre_Isla
    Integer numero_Surtidores
    Boolean estado_Isla
    static hasMany = [pd_Surtidor:PD_Surtidor]
    static hasMany2 = [pd_turno:PD_Turno]
    
    static constraints = {
        nombre_Isla (blank:false)
        numero_Surtidores (size:1..2)
        
    }
}
