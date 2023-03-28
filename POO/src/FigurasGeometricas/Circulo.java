package FigurasGeometricas;
import java.util.Scanner;

public class Circulo {
    float pi;
    float Rad;
    //metodo constructor

    public Circulo() {
        this.pi = pi;
        this.Rad = Rad;
    }
    //metodos accesores

    public float getpi() {
        return pi;
    }
    public float getRadio() {
        return Rad;
    }

    public void setDiametro(float pi) {
        this.pi = pi;  
    }
    public void setradio(float Radio) {
        this.Rad = Rad;  
        
    }

    
    //métodos propios

    //creamos el metodo pedir datos 
    public void pedirDatosCirculo(){
        
        Scanner contraer= new Scanner(System.in);

        System.out.println("Digite el valor de pi");
        pi=contraer.nextFloat();

        System.out.println("Digite el radio");
        Rad=contraer.nextFloat();

        contraer.close();
    }


    public void calcularAreaCirculo(){
    float areaCirculo;
    areaCirculo= (pi)*(Rad)*2;
    System.out.println("El area del circulo es: "+areaCirculo+" /ndeterminado por "+pi+ " y "+Rad);

    }

    
    
}

