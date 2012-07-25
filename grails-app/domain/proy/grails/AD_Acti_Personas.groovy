package proy.grails

class AD_Acti_Personas {
    
    String nombre_Actividad
    String descripcion_Actividad
    String observacion_Actividad
    static hasMany = [ad_personas:AD_Personas]

    static constraints = {
        nombre_Actividad (blank:false)
        descripcion_Actividad (nullable:true)
        observacion_Actividad (nullable:true)
        
    }
}
