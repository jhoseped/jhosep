/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhosep
 */
public class informacion {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre= JOptionPane.showInputDialog(null, "ingrese su nombre");
        
        JOptionPane.showMessageDialog(null,"su nombre es: " +persona.nombre);
        
        cambiar(persona);
        JOptionPane.showMessageDialog(null,"se modifico: " +persona.nombre);
        
        
    }
    
    public static Persona  cambiar(Persona pers){
        pers.nombre=JOptionPane.showInputDialog(null, "ingrese a un nombre que se va a ");
       return pers ;
    }
}
