/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import beans.Libro;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author nganfornina
 */
public class OperacionesBD {
    public static void main(String [] args){
        
        
        actualizarLibro(1, "Histórica");
        System.out.println("HECHO CON EXITO");
        listarLibro();
    }
    
    public static void  actualizarLibro(int id , String genero){
     
        DBConnection conn = new DBConnection();
        String sql = "UPDATE libros SET genero = '" + genero + "' where id = " + id; 
        
        try{
            Statement st = conn.getConnection().createStatement();
            st.executeQuery(sql);
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
        finally{
            conn.desconectar();
        }
        
    }
    public static void listarLibro(){
        
        DBConnection conn = new DBConnection();
        String sql = "Select * from Libros" ; 
        
     
        try{
            Statement st = conn.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String genero = rs.getString("genero");
                String autor = rs.getString("autor");
                int copias = rs.getInt("copias");
                boolean novedad = rs.getBoolean("novedad");
                
                Libro libro = new Libro(id,titulo,genero,autor,copias,novedad);
                System.out.println("Libro agregado con exito");
                System.out.println(libro.toString());
            }
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
        finally{
            conn.desconectar();
        }
    }
}
