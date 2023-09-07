/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author Jhosep
 */
public class retu {
    public static void main(String[] args) {
        Persona persona = new Persona();
          
        String per = "carlos";
         
        ret(per);
        System.out.println(persona);
    }
    
    public static String ret(String per){
        if(per==null){
            System.out.println("valor no encontrado");
            return null;
        }else if(per=="Karla") {
            
            System.out.println("el nombre es " +per);
           return per;
        }
        System.out.println("no esta el nomre");
        return per;
        
    }
}
