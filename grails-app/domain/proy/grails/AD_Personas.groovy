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

    static constraints = {
        id_Persona (blank:false,size:6..12,unique:true)
        nombre_Persona (blank:false,size:5..50)
        pApellido_Persona (blank:false,size:5..50)
        email_Persona (email:true)
        sexo_Persona (inList:['HOMBRE','MUJER'])
        tel_F_Persona (size:5..12)
        tel_C_Persona (matches: "3[1-9]{10}")
    }
}
