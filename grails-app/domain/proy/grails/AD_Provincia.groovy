package proy.grails

class AD_Provincia {
    
    String nombre_Provincia
    AD_Estado ad_Estado
    static hasMany = [ad_Personas:AD_Personas]
    static hasMany2 = [ad_Empresa:AD_Empresa]
    
    static constraints = {
        nombre_Provincia (blank:false)
    }
}
