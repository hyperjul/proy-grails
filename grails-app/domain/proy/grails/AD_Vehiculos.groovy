package proy.grails

class AD_Vehiculos {
    
    String placa_Vehiculo
    String marca_Vehiculo
    String tipo_Vehiculo
    String modelo_Vehiculo
    Date frecuencia_Vehiculo
    String proviene_Vehiculo
    Integer tarjeta_Vehiculo
    AD_Personas ad_Personas
    AD_Empresa ad_Empresa
    

    static constraints = {
        tipo_Vehiculo (inList:['Vehiculo','Campero','Camion','Volqueta','Ser. Publico'])
        modelo_Vehiculo (nullable:true)
        frecuencia_Vehiculo (nullable:true)
        proviene_Vehiculo (inList:['Personal','Empresarial'])
        ad_Personas (nullable:true)
        ad_Empresa (nullable:true)
        tarjeta_Vehiculo (unique:true)
    }
}
