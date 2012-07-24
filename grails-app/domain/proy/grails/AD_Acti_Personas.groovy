package proy.grails

class AD_Acti_Personas {
    
    String nombre_Actividad
    String descripcion_Actividad
    String observacion_Actividad

    static constraints = {
        nombre_Actividad (blank:false)
    }
}
