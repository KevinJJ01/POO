package Salud;

import java.util.Scanner;


public class Persona {

    //creamos los atributos(Tipo privado), declaramos tipo de variable y por ultimo damos el valor  
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido; 
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;
    private double pesoActual;

    //creación metodo constructor con parametros incluidos
    public Persona(String tipoDoc2, int documento2, String nombre2, String apellido2, int peso2, int estatura2,
            int edad2, String sexo2, double pesoActual2) {
    }
    /*Metodo get siempre tendra valor de retorno al mismo dato del tipo de atributo(envia) */
    /*El metodo set no retorna valores y se requiere como parametro el valor del atributo (muestra) */    
    //Creación del constructor persona 
    //Constructor vacio
    public Persona() {}
    
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public double getPesoActual() {
        return pesoActual;
    }
    public void setPesoActual(int pesoActual) {
        this.pesoActual = pesoActual;
    }

    //creamos metodo constructor de la clase persona con Parametros con nombres diferentes a los atributos 
    /*public void Persona( String _tipoDoc, int _documento, String _nombre, String _apellido,  int _peso, int _estatura, int _edad, String _sexo) {
    tipoDoc= _tipoDoc;
    documento= _documento;
    nombre= _nombre;
    apellido=_apellido; 
    peso=_peso;  
    estatura=_estatura; 
    edad=_edad;  
    sexo= _sexo;
    }
     //creamos metodo constructor de la clase persona con Parametros con nombres iguales a los atributos 
    public void Persona( String _tipoDoc, int _documento, String _nombre, String _apellido,  int _peso, int _estatura, int _edad, String _sexo) {
    this.tipoDoc= tipoDoc;
    this.documento= documento;
    this.nombre= nombre;
    this.apellido= apellido; 
    this.peso= peso;  
    this.estatura= estatura; 
    this.edad= edad;  
    this.sexo= _sexo;
        }
    */
//creamos el metodo pedir datos 
    public void pedirDatos(){
        
        Scanner contraer= new Scanner(System.in);

        System.out.println("Digite el tipo de documento");
        tipoDoc=contraer.next();

        System.out.println("Digite el número documento");
        documento=contraer.nextInt();

        System.out.println("Digite su nombre");
        nombre=contraer.next();

        System.out.println("Digite su apellido");
        apellido=contraer.next();

        /*System.out.println("Digite el peso");
        peso=contraer.nextInt();

        System.out.println("Digite la estatura");
        estatura=contraer.nextInt();*/

        System.out.println("Digite la edad");
        edad=contraer.nextInt();

        System.out.println("Digite el tipo de sexo");
        sexo=contraer.next();
    }

    

    //ceramos el metodo mostrar datos sin parametros
    public void mostrarPersona(){

        System.out.println("tipo documento: "+tipoDoc);
        
        System.out.println("documento: "+documento);

        System.out.println("nombre: "+nombre);

        System.out.println("apellido: "+apellido);
       
        System.out.println("peso: "+peso);
    
        System.out.println("estatura: "+estatura);
    
        System.out.println("edad: "+edad);

        System.out.println("sexo: "+sexo);
    }





    //METODO PARA CALCULAR IMC
        //metodo con retorno
    public double calcularImc(double peso, double estatura){
        pesoActual=(estatura)/(peso)*2;
        return pesoActual;
    }
    /*metodo sin retorno
    public void calcularImc(){

        pesoActual=(peso/estatura)*2;
        
        if(pesoActual<20){
            System.out.println("El peso no es el ideal, debes mejorar");
        }else if(pesoActual>=21){
            System.out.println("Tienes un peso ideal");
        }else if(pesoActual>26){
            System.out.println("Tienes sobre peso");

        }
    }*/ 

    

    //METODO PARA DETEMINAR MAYOR DE EDAD
    private void mayorEdad() {
        if (edad>17){
            System.out.println("Eres mayor de edad, que bien");
        }else if(edad<=17){
            System.out.println("Eres menor de edad, que bien");
        }
        
    }
    
}


