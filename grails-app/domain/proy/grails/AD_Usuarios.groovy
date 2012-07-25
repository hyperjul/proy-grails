package proy.grails

class AD_Usuarios {
    
    String nick_Usuario
    String tipo_Usuario
    AD_Personas ad_Personas
    static hasMany = [pd_Turno:PD_Turno]

    static constraints = {
        nick_Usuario (blank:false, size:5..50)
        tipo_Usuario (blank:false, inList:['Administrador','Operador','Gerencial','Cliente_Externo'])
    }
}
