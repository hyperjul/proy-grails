package proy.grails

class AD_Pais {
    
    String nombre_Pais
    static hasMany = [ad_Estado:AD_Estado]
    
    static constraints = {
        nombre_Pais (blank:false)
    }
}
