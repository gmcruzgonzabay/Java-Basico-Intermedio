/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author gregoriocruz
 */
public class Persona 
{
   private int    codigo;
   private String nombres;
   private String apellidos;
   private String direccion;
   private String cedula;
   private int    año_nacimiento;
   private char   estado_civil;
    
    //Constructores
    Persona()
    {
        this.codigo=0;
        this.nombres="";
        this.apellidos="";
        this.direccion="";
        this.cedula="";
        this.año_nacimiento=0;
        this.estado_civil=' ';
    }
    
    //Sobrecargado
    Persona(int codigo,String nombres,String apellidos,String direccion,String cedula
    ,int año_nacimiento,char estado_civil)
    {
     this.codigo=codigo;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.direccion=direccion;
        this.cedula=cedula;
        this.año_nacimiento=año_nacimiento;
        this.estado_civil=estado_civil;
    }
    
    //Metodo Set
    
    public void setCodigo(int codigo)
    {
        this.codigo=codigo;
    }
    public void setNombres(String nombres)
    {
        this.nombres=nombres;
    }
    
    public void setApellidos(String apellidos)
    {
        this.apellidos=apellidos;
    }
    
    public void setDireccion(String direccion)
    {
        this.direccion=direccion;
    }
    
    public void setCedula(String cedula)
    {
        this.cedula=cedula;
    }
    
    public void setAñoNacimiento(int año_nacimiento)
    {
        this.año_nacimiento=año_nacimiento;
    }
    
    public void setEstadoCivil(char estado_civil)
    {
        this.estado_civil=estado_civil;
    }
    
    //Get
    public int getCodigo()
    {
        return this.codigo;
    }
    public String getNombres()
    {
        return this.nombres;
    }
    public String getApellidos()
    {
        return this.apellidos;
    }
    
    public String getDireccion()
    {
        return this.direccion;
    }
    
    public String getCedula()
    {
        return this.cedula;
    }
    
    public int getAñoNacimiento()
    {
        return this.año_nacimiento;
    }
    
    public char getEstadoCivil()
    {
        return this.estado_civil;
    }
    
    
    
    public void ImprimirDatosBasico()
    {
        System.out.println("Codigo:"+this.getCodigo());
        System.out.println("Nombres:"+this.getNombres());
        System.out.println("Apellidos:"+this.getApellidos());
        System.out.println("Cedula:"+this.getCedula());
        System.out.println("Direccion:"+this.getDireccion());
        System.out.println("Año de Nacimiento:"+this.getAñoNacimiento());
        System.out.println("Estado Civil:"+this.getEstadoCivil());
    }
    
    
    
    
    
    
}//Fin clase persona
