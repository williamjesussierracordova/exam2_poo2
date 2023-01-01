/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta1_pc2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author WILLIAM
 */
public class usuario_array {
     String linea;
    BufferedReader lector;
    String partes[] = null;
    String nom = "usuario.txt";

    private final ArrayList<usuario> usuario_a = new ArrayList();
    
    public void inicializar() {
        try {
            lector = new BufferedReader(new FileReader(nom));
            while ((linea = lector.readLine()) != null) {
                partes = linea.split(",");
                usuario usuario1=new usuario();
                usuario1.setWeb(partes[0]);
                usuario1.setUsuario(partes[1]);
                usuario1.setContrasena(partes[2]);
                
                usuario_a.add(usuario1);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public int rows() {
        return usuario_a.size();
    }
    
    public usuario get(int pos) {
        return usuario_a.get(pos);
    }
    
    public void agregar(usuario obj) {
        usuario_a.add(obj);
    }
    
    public void grabar_archivo(usuario obj) {

        try {
            FileWriter f = new FileWriter(nom, true);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);

            pw.print(obj.getWeb()+","+obj.getUsuario()+","+obj.getContrasena());
            pw.print("\n");
            pw.flush();
            pw.close();

        } catch (IOException e) {
            System.out.println("Ocurrio un error al grabar en el archivo!!!");
        }
    }
    
    public void grabarModificareliminar(){
        try
        {
            FileWriter f = new FileWriter(nom,false);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter pw = new PrintWriter(b);
            for(usuario obj:usuario_a)
            {
               pw.println(obj.getWeb()+","+obj.getUsuario()+","+obj.getContrasena());
            }
            
            pw.flush();
            pw.close();
        } catch ( IOException e ){
            System.out.println(e);
        }
   }
}
