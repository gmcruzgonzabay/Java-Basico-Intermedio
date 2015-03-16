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
public class Estudiante extends Persona
{
    int matricula;
    int factorP;
    
    //implicito
    Estudiante()
    {
        
        this.matricula=0;
        this.factorP=0;
    }
    
    
    Estudiante(int codigo,String nombres,String apellidos,String direccion,String cedula
    ,int año_nacimiento,char estado_civil,int matricula,int factorP)
    {
        super(codigo,nombres,apellidos,direccion,cedula,año_nacimiento,estado_civil);
        this.matricula=matricula;
        this.factorP=factorP;
    
    }
    
    //Set
    public void setMatricula(int matricula)
    {
        this.matricula=matricula;
    }
    
    public void setFactorP(int factorP)
    {
        this.factorP=factorP;
    }
    
    //get
    public int getMatricula()
    {
        return this.matricula;
    }
    
    public int getFactorP()
    {
        return this.factorP;
    }
    
    
    
}
