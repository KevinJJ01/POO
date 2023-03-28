//Creamos paquete Salud
package Salud;
//importamos la clase Scanner 
import java.util.Scanner;
//Creamos la clase Scanner

public class inicio {
    //declaramos el metodo de entrada Main
    public static void main(String[] args) {
         //instanciamos la clase Scanner
         Scanner contraer= new Scanner(System.in);
    
        //Declramos variables//
        String tipoDoc;
        int documento;
        String nombre;
        String apellido; 
        double peso;
        double estatura;
        int edad;
        String sexo;
        double pesoActual;

        //Crear un objeto, instancia a la clase
        Persona person=new Persona();


        //llamamos el metodo pedir datos 
        //person.pedirDatos();



        //Invocamos metodos
        //person.mostrarPersona(); 

        
        System.out.println("Digite el tipo de documento");
        tipoDoc=contraer.next();

        System.out.println("Digite el número documento");
        documento=contraer.nextInt();

        System.out.println("Digite su nombre");
        nombre=contraer.next();

        System.out.println("Digite su apellido");
        apellido=contraer.next();

        //Imprimimos un mensaje para que el usuario ingrese datos requeridos, y damos valor a la variable con el metodo de entrada
        System.out.println("Digite el peso");
        peso=contraer.nextDouble();
            
        //Imprimimos un mensaje para que el usuario ingrese datos requeridos, y damos valor a la variable con el metodo de entrada
        System.out.println("Digite la estatura");
        estatura=contraer.nextDouble();
        
        

        System.out.println("Digite la edad");
        edad=contraer.nextInt();

        System.out.println("Digite el tipo de sexo");
        sexo=contraer.next();
        
        pesoActual=person.calcularImc(peso, estatura);
        //Creamos condicional, para la impresión del resultado de la condición 
        if(pesoActual<20){
            System.out.println("El peso es bajo");
        }else if(pesoActual>=20 && pesoActual<=25){
            System.out.println("El peso es el ideal");
        }else if(pesoActual>25){
            System.out.println("Sobrepeso ");
        }
        System.out.println("SU PESO ES: " +pesoActual);


        Empleado empleo=new Empleado(tipoDoc, documento, nombre, apellido, peso, estatura, edad, sexo, pesoActual );

        person.pedirDatos();
        empleo.calcularHonorarios();
        empleo.imprimirInfo();


        }
        
        
    }
