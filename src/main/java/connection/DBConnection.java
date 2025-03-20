/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author nganfornina
 */
public class DBConnection {
    static String bd = "libreria_udemy";
    static String port = "3306";
    static String login = "root";
    static String password = "root";
    //jdbc:mysql://ip:puerto/bd
    static String url = "jdbc:mariadb://localhost:" + port + "/" + bd;
    
    Connection connection = null ;
    
    public DBConnection(){
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            connection = DriverManager.getConnection(url,login,password);
            
            if(connection == null){
                System.out.println("La conexion a "+ bd + " ha fallado");
            }else {
                System.out.println("La conexion a " + bd + "ha sido exitosa");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public Connection getConnection(){
        return connection ;
    }
    public void desconectar(){
        connection = null ;
    }
}
