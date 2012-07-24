package proy.grails

class AD_Estado {
    
    String nombre_Estado

    static constraints = {
        nombre_Estado (blank:false)
    }
}
