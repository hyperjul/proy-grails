package proy.grails

class AD_Estado {
    
    String nombre_Estado
    AD_Pais ad_Pais
    static hasMany = [ad_Provincia:AD_Provincia]

    static constraints = {
        nombre_Estado (blank:false)
    }
}
