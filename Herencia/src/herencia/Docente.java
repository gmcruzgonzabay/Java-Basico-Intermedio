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
public class Docente extends Persona
{
    String oficina;
    String horario;
    
    Docente()
    {
        this.oficina="";
        this.horario="";
    }        
    
    Docente(int codigo,String nombres,String apellidos,String direccion,String cedula
    ,int año_nacimiento,char estado_civil,String oficina,String horario)
    {
         super(codigo,nombres,apellidos,direccion,cedula,año_nacimiento,estado_civil);
         this.oficina=oficina;
         this.horario=horario;
    
    }
    
    //Set
    
    public void setOficina(String oficina)
    {
        this.oficina=oficina;
        
    }
    
    public void setHorario(String horario)
    {
        this.horario=horario;
    }
    
    public String getOficina()
    {
        return this.oficina;
    }
    
    public String getHorario()
    {
        return this.horario;
    }
    
    
    
}
