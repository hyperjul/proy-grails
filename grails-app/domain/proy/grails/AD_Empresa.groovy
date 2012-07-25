package proy.grails

class AD_Empresa {
    
    Integer nit_Empresa
    String nombre_Empresa
    String actividad_Empresa
    String direccion_Empresa
    AD_Provincia ad_provincia
    static hasMany = [ad_Personas:AD_Personas]
    static hasMany2 = [ad_Vehiculos:AD_Vehiculos]

    static constraints = {
        nit_Empresa (blank:false,size:6..12,unique:true)
        nombre_Empresa (blank:false,unique:true)
        actividad_Empresa (nullable:true)
        direccion_Empresa (nullable:true)
        
    }
}
