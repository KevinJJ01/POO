package Reto5;

import java.util.Random;
import java.util.Scanner;

public class piedraPapelTijera implements Juego { 
    //ATRIBUTOS
    private int tiro;
    private int tiroAleatorio;
    private String Jugador;

    //Instancia para capturar los datos
    Scanner captura = new Scanner(System.in);

    //Solicitar los datos
    public void iniciar(){
    System.out.println(" \nIngrese su nombre: ");
    Jugador=captura.next();
    }
    public void jugar(){
    System.out.println(Jugador + " Elija una opción: (piedra:1 papel:2 tijera:3)");
    tiro=captura.nextInt();
    Random aleatorio=new Random();
    tiroAleatorio=aleatorio.nextInt(3)+1;
    System.out.println("Su opción fue elegida, esta cargando...");
    }
    public void finalizar(){
        if(tiroAleatorio==1 && tiro==1){
            System.out.println(Jugador + " Su opción fue: " + tiro + "es empate y la opción de la maquina fue: " +tiroAleatorio);
        }
        
        else if(tiroAleatorio==2 && tiro==2){
            System.out.println(Jugador + " Su opción fue: " + tiro + "es empate y la tiro de la maquina fue: " +tiroAleatorio);
        }
        
        else if(tiroAleatorio==3 && tiro==3){
            System.out.println(Jugador + " Su opción fue: " + tiro + "es empate y la tiro de la maquina fue: " +tiroAleatorio);
        }
        
        else if(tiroAleatorio==2 && tiro==1){
            System.out.println(Jugador + " Su opción fue: " + tiro + "perdio  y la tiro de la maquina fue: " +tiroAleatorio);
        }
        
        else if(tiroAleatorio==3 && tiro==2){
            System.out.println(Jugador + " Su opción fue: " + tiro + "perdio  y la tiro de la maquina fue: " +tiroAleatorio);
        }
        
        else if(tiroAleatorio==1 && tiro==3){
            System.out.println(Jugador + " Su opción fue: " + tiro + "perdio  y la tiro de la maquina fue: " +tiroAleatorio);
        }
        
        else if(tiroAleatorio==3 && tiro==1){
            System.out.println(Jugador + " Su opción fue: " + tiro + "gano  y la tiro de la maquina fue: " +tiroAleatorio);
        }
        
        else if(tiroAleatorio==1 && tiro==2){
            System.out.println(Jugador + " Su opción fue: " + tiro + "gano  y la tiro de la maquina fue: " +tiroAleatorio);
        }
        
        else if(tiroAleatorio==2 && tiro==3){
            System.out.println(Jugador + " Su opción fue: " + tiro + "gano  y la tiro de la maquina fue: " +tiroAleatorio);
        }
}
}
