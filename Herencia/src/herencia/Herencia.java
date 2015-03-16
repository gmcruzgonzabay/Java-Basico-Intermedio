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
public class Herencia
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Estudiante estudiante=new Estudiante();
        
        Estudiante estudiante1=new Estudiante(001,"Juan","Perez","Guayaquil",
                "09999999",1980,'S',200618361,5);
        
        Docente docente=new Docente();
        docente.setCodigo(002);
        docente.setNombres("Xavier");
        docente.setApellidos("Vera");
        docente.setAñoNacimiento(1982);
        docente.setCedula("098888888");
        docente.setDireccion("Malecón 100 y Loja");
        docente.setEstadoCivil('C');
        docente.setHorario("08:00 a 12:00");
        docente.setOficina("B-101");
        
        //Imprimir Datos
        
        estudiante1.ImprimirDatosBasico();
        System.out.println("Matricula:"+estudiante1.getMatricula());
        System.out.println("Factor P:"+estudiante1.getFactorP());
        
        System.out.println("***Docente****");
        docente.ImprimirDatosBasico();
        System.out.println("Horario:"+docente.getHorario());
        System.out.println("Oficina:"+docente.getOficina());
        
        
        
    }
    
}
