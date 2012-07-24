package proy.grails

class AD_Usuarios {
    
    String nick_Usuario
    String tipo_Usuario

    static constraints = {
        nick_Usuario (blank:false, size:5..50)
        tipo_Usuario (blank:false, inList:['Administrador','Operador','Gerencial','Cliente_Externo'])
    }
}
