/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_futuro;

/**
 *
 * @author edu
 */
public class Proyecto_Futuro {

    private static String Veredicto(String Valor1, String Valor2){
    
       if (Valor1.equals(Valor2))
    
       return "Debes estudiar mas tiempo...";
       
       if (Integer.valueOf(Valor2) < Integer.valueOf(Valor1))
       
       return "Estudias poco tiempo para las asignaturas que tienes...";
       
       if (Integer.valueOf(Valor2) >= (Integer.valueOf(Valor1)*2))
           
       return "Vale sigue asin";
       
       return "Estudias mas horas que las asignaturas que tienes";
       
    }
       
    public static void main(String[] args) {
        
        System.out.println("Estudiante "+args[0]);
        //llamamos al metodo Veredicto pasandole los correspondientes valores de los argumentos
        System.out.println(Veredicto(args[1],args[2]));//el metodo nos devolvera una cadena segun el resultado
        //la cadena la mostraremos mediante System
    }
    
}
