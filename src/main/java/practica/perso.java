/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author Jhosep
 */
public class perso {

    private int idpers;
    private String nombre;
    private static int contaid;

    public perso(String nombre) {
        this.nombre=nombre;
        perso.contaid++;
        this.idpers = perso.contaid;
        
    }
    
    
    

    public int getIdpers() {
        return idpers;
    }

    public void setIdpers(int idpers) {
        this.idpers = idpers;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContaid() {
        return contaid;
    }

    public static void setContaid(int aContaid) {
        contaid = aContaid;
    }

    @Override
    public String toString() {
        return "perso{" + "idpers=" + idpers + ", nombre=" + nombre + '}';
    }
    
  
}
 

