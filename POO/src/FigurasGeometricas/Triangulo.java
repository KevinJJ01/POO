package FigurasGeometricas;
import java.util.Scanner;

public class Triangulo {
 //atributos
 float base;
 float altura;
 float d2;
 //metodo constructor

 public Triangulo(float base, float altura, float d2) {
     this.base = base;
     this.altura = altura;
     this.d2 = d2 ;
 }
 //metodos accesores

 public Triangulo() {
}

public float getbase() {
     return base;
 }
 public float getaltura() {
    return altura;
}
public float getd2() {
    return d2;
}



 public void setbase(float base) {
     this.base = base;
 }
 public void setaltura(float altura) {
    this.altura = altura;
}
public void setd2(float d2) {
    this.d2 = d2;
}
//métodos propios
//métodos propios

//creamos el metodo pedir datos 
public void pedirDatosTriangulo(){
        
Scanner contraer= new Scanner(System.in);

System.out.println("Digite el valor de la base");
base=contraer.nextFloat();

System.out.println("Digite la altura");
altura=contraer.nextFloat();
}
    
    


 public void calcularAreaTriangulo(){
 float AreaTriangulo;
 AreaTriangulo=base*altura/2/2;
 System.out.println("El area del triangulo es: "+AreaTriangulo);
 }
 
    
}
