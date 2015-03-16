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
public class Contrato extends Docente
{
    double sueldo;
    int años;
    
    //Implicito
    Contrato()
    {
        this.sueldo=0.0;
        this.años=0;
    }

    //Sobrecargado pero con los datos de la clase
    public Contrato(double sueldo, int años) 
    {
        this.sueldo = sueldo;
        this.años = años;
    }
    
    //Sobrecargado o explicito pero con los datos de la superclase o clase padre

    public Contrato(double sueldo, int años, int codigo, String nombres, String apellidos, String direccion, String cedula, int año_nacimiento, char estado_civil, String oficina, String horario) {
        super(codigo, nombres, apellidos, direccion, cedula, año_nacimiento, estado_civil, oficina, horario);
        this.sueldo = sueldo;
        this.años = años;
    }

    public double getSueldo() {
        return sueldo;
    }

    public int getAños() {
        return años;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setAños(int años) {
        this.años = años;
    }
    

    
   
    
    
    
    
}
