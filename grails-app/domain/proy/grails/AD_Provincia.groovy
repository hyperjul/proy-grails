package proy.grails

class AD_Provincia {
    
    String nombre_Provincia

    static constraints = {
        nombre_Provincia (blank:false)
    }
}
