/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta1_pc2;

/**
 *
 * @author WILLIAM
 */
public class usuario {
    String web;
    String usuario;
    String contrasena;

    public usuario() {
    }

    public usuario(String web, String usuario, String contrasena) {
        this.web = web;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
   
}
