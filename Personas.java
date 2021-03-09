/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;
/**
 *
 * @author crist
 */
public class Personas {
    static class Persona{
        public String nombre;
        public int  edad;
        
        //Constructor
        public Persona(String nombre, int edad){
            this.nombre=nombre;
            this.edad=edad;
        }
    }
    
    //static Persona[] personas = {    };
    /**
     * @param args the command line arguments
     */
    public static void ImprimeArreglo(Persona[] array){
        for(int i=0;i<array.length;i++){
            System.out.println((i+1)+". "+array[i].nombre+"edad:"+array[i].edad);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Persona[] personas = new Persona[10];
        personas[0] = new Persona("Andres",25);
        personas[1] = new Persona("Pedro", 30);
        personas[2] = new Persona("Jonathan", 18);
        personas[3] = new Persona("Michael", 23);
        personas[4] = new Persona("Julian", 35);
        personas[5] = new Persona("Cristhian", 32);
        personas[6] = new Persona("David", 19);
        personas[7] = new Persona("Anderson", 20);
        personas[8] = new Persona("Francisco", 26);
        personas[9] = new Persona("John", 24);
                        
        System.out.println("Datos de personas aleatorio");
        ImprimeArreglo(personas);
        
        //for(Persona per : personas){
        //    System.out.println(per);
        //}
                
    }
    
}
