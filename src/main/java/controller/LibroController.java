/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import beans.Libro;
import com.google.gson.Gson;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.sql.Timestamp;

/**
 *
 * @author nganfornina
 */
public class LibroController implements ILibroController {

    @Override
    public String listar(boolean ordenar, String orden) {
        Gson gson = new Gson();

        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM libros";

        if (ordenar == true) {
            sql += " order by genero " + orden;
        }

        List<String> libros = new ArrayList<String>();

        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String genero = rs.getString("genero");
                String autor = rs.getString("titulo");
                int copias = rs.getInt("copias");
                boolean novedad = rs.getBoolean("novedad");

                Libro libro = new Libro(id, titulo, genero, autor, copias, novedad);

                libros.add(gson.toJson(libro));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return gson.toJson(libros);
    }

    @Override
    public String alquilar(int id, String username) {

        Timestamp fecha = new Timestamp(new Date().getTime());
        DBConnection con = new DBConnection();
        String sql = "Insert into alquiler values ('" + id + "', '" + username + "', '" + fecha + "')";

        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

            String modificar = modificar(id);

            if (modificar.equalsIgnoreCase("true")) {
                return "true";
            }

        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            con.desconectar();
        }

        return "false";
    }

    @Override
    public String modificar(int id) {
        
        DBConnection con = new DBConnection();
        String sql = "update libros set copias = (copias - 1) where id = " + id;

        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

            return "true";
        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            con.desconectar();
        }

        return "false";
    }

    @Override
	public String devolver(int id, String username) {
		
		
		DBConnection con = new DBConnection();
		String sql = "Delete from alquiler where id= " + id + " and username = '" + username + "' limit 1";
		
		try {
			Statement st = con.getConnection().createStatement();
			st.executeQuery(sql);
			
			this.sumarCantidad(id);
			
			return "true";
		}
		catch(Exception ex) {
			System.out.println(ex.toString());
		}
		finally {
			con.desconectar();
		}
		
		return "false";
	}
        @Override
	public String sumarCantidad(int id) {
		
		DBConnection con = new DBConnection();
		
		String sql = "Update libros set copias = (Select copias from libros where id = " + id + ") + 1 where id = " + id;
		
		try {
			Statement st = con.getConnection().createStatement();
			st.executeQuery(sql);
			
			return "true";
		}
		catch(Exception ex) {
			System.out.println(ex.toString());
		}
		finally {
			con.desconectar();
		}
		
		return "false";
		
	}
 
    
}
