/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import java.util.Map;

/**
 *
 * @author nganfornina
 */
public interface IUsuarioController {
    
    public String login(String username , String contrasena);
    
    public String register(String username, String contrasena, String nombre , String apellidos , String email , double saldo , boolean premium);
    
    public String pedir(String username);
    
    public String restarDinero(String username , double nuevoSaldo);
    
    public String modificar(String username , String nuevaContrasena , String nuevoNombre , String nuevoApellidos , String nuevoEmail , double nuevoSaldo, boolean nuevoPremium);
    
    public String verCopias(String username);
    
    public String devolverLibros(String username, Map<Integer, Integer> copias);
    
    public String eliminar(String username);

}
