//Creacion del paquete
package Salud;
//Creación de la subclase extensión de la clase persona
public class Empleado extends Persona {

//Atributos propios de la subclase
private String   cargo;
private int      valorhora;
private int      horastrabajadas;
private String   departamento;


//creamos el metodo constructor y empleamos los atributos de la super clase.
public Empleado(String tipoDoc, int documento, String nombre, String apellido,  int peso, int estatura, int edad, String sexo, double pesoActual, String cargo, int valorhora, int horastrabajadas, String departamento){
super(tipoDoc, documento, nombre, apellido, peso, estatura, edad, sexo, pesoActual);
this.cargo=cargo; this.valorhora=valorhora; this.horastrabajadas=horastrabajadas; this.departamento=departamento;

}


public Empleado(String tipoDoc, int documento, String nombre, String apellido, double peso, double estatura, int edad,
        String sexo, double pesoActual) {
}


//creación de metodos de la subclase
   public double calcularHonorarios(){
   int Honorarios =valorhora*horastrabajadas;
   double Reteica = Honorarios*0.00966;
   return Honorarios-Reteica;


   }


//imprimir lo que vera el usuario

public void imprimirInfo() {
    System.out.println("tipo de documento"+getTipoDoc());
    System.out.println("Número de documento"+getDocumento());
    System.out.println("Nombres: "+getNombre());
    System.out.println("Apellidos: "+getApellido());
    System.out.println("Cargo: "+cargo);
    System.out.println("Horas trabjadas: "+horastrabajadas);
    System.out.println("Valor por hora: "+valorhora);
    System.out.println("Total a pagar: "+calcularHonorarios());
    
}
}