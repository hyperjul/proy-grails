package proy.grails

class PD_Surtidor {
    
    String descripcion_Surtidor
    Integer mangueras_Surtidor
    PD_Isla pd_Isla
    static hasMany = [pd_Mangueras:PD_Mangueras]

    static constraints = {
        mangueras_Surtidor (size:1..2)
        descripcion_Surtidor (nullable:true)
    }
}
