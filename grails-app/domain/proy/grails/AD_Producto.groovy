package proy.grails

class AD_Producto {
    
    String nombre_Producto
    String descripcion_Producto
    Double inv_Min_Producto
    Double inv_Max_Producto
    Double precio_Base
    Float descuento1
    Float descuento2
    Float descuento3
    String tipo_Proovedor
    static hasMany = [pd_Mangueras:PD_Mangueras]
    static hasMany2 = [pd_Movimiento_Turno:PD_Movimiento_Turno]

    static constraints = {
        nombre_Producto (maxSize:100)
        descripcion_Producto (maxSize:250)
        descuento1 (nullable:true)
        descuento2 (nullable:true)
        descuento3 (nullable:true)
        tipo_Proovedor (inList:['Personal','Empresarial'])
    }
}
