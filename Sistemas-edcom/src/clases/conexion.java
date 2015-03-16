/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;
import java.sql.*;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Dpto de Computacion
 */
public class conexion 
{
    //VOY A IMPORTAR EL DRIVER 
    Connection con=null;
    public Connection ConectaBase()
    {
     try
     {
             Class.forName("com.mysql.jdbc.Driver");       
             
             //indico la base y el usuario al que me voy a conectar             
             con=DriverManager.getConnection("jdbc:mysql://localhost/db_ejemplo","root","");
            //MOSTRA MENSAJE DE CONEXION SE REALIZO CON EXITO
             System.out.println("Conexion realizada con exito");
             
      }
      catch(ClassNotFoundException | SQLException e )
     {
         System.out.println("Error en la conexion");
         JOptionPane.showMessageDialog(null, "Erro en la conexion a la base"+e);        
     }//FIND E LA FUNCION CONECTA BASE
     return con;
    }
    
}
