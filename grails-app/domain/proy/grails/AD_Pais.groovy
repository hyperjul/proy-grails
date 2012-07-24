package proy.grails

class AD_Pais {
    
    String nombre_Pais
    
    static constraints = {
        nombre_Pais (blank:false)
    }
}
