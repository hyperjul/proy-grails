package proy.grails

class AD_Personas {
    
    Integer id_Persona
    String nombre_Persona
    String pApellido_Persona
    String sApellido_Persona
    String sexo_Persona
    Date f_Nac_Persona
    Date f_Ing_Persona
    Integer tel_F_Persona
    Integer tel_C_Persona
    String esp_Persona
    String dir_Persona
    String email_Persona
    AD_Usuarios ad_Usuarios
    AD_Provincia ad_Provincia
    AD_Acti_Personas ad_Acti_Personas
    AD_Empresa ad_Empresa
    static hasMany = [ad_Vehiculos:AD_Vehiculos]
    

    static constraints = {
        id_Persona (blank:false,size:6..12,unique:true)
        nombre_Persona (blank:false,size:5..50)
        pApellido_Persona (blank:false,size:5..50)
        sApellido_Persona (size:5..50,nullable:true)
        f_Nac_Persona (nullable:true)
        email_Persona (email:true,unique:true,nullable:true)
        sexo_Persona (inList:['HOMBRE','MUJER'])
        tel_F_Persona (size:5..12,nullable:true)
        tel_C_Persona (matches: "3[1-9]{10}",nullable:true)
        esp_Persona (size:5..250,nullable:true)
        dir_Persona (size:5..100,nullable:true)
        ad_Usuarios (nullable:true)
        ad_Acti_Personas (nullable:true)
        
        
    }
}
