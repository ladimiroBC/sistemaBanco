/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabanco2;

import java.util.Scanner;

public class CuentaAhorro extends Persona{
    Scanner in=new Scanner(System.in);
    private int dep, retiro, resultado, resultado2;  // resultado=deposito-500-->(minimo deposito)
    private float interes, porcentaje; 
    
    public CuentaAhorro(String nombre, int identificacion, int deposito){
        super(nombre, identificacion);
        this.dep=deposito;
    }
    
    public int obtenDeposito(){
        return dep;
    }
    
    public void verDeposito(){
        obtenDeposito();
        System.out.println("El deposito de "+obtenNombre()+" es de $"+dep);
    }
    
    public void interesAnual(){
        interes=this.dep*(porcentaje/100);
    }
    
    public void obtenInteres(){
        interesAnual();
        System.out.println("Los intereses para la cuenta segun el saldo"
                    + "\nen la cuenta es de: $"+interes);
    }
    
       
    public void aperturaCuenta(){
        System.out.println("Digite nuevamente el numero IDE del cliente: ");
        int validacion=in.nextInt();
        
        if((obtenDeposito()>=1000)&& ide==validacion){
            System.out.println("Su apertura de cuenta de ahorro fue existosa");
            System.out.println("Digite el porcentaje de interes anual: ");
            porcentaje=in.nextFloat();
            obtenInteres();
                       
        }
        else{
            System.out.println("Su apertura de cuenta de ahorro no fue existosa"
                    + "\nfondo insuficiente para el deposito o IDE erroneo");
        }
    }
    
    public void retiroCuenta(){
        System.out.println("Cuanto desea retirar: $");
        retiro=in.nextInt();
        resultado=this.dep-500;
        if(retiro<=resultado){
            System.out.println("Su saldo anterior fue de: $"+obtenDeposito());
            resultado2=this.dep-retiro;
            this.dep=resultado2;
            System.out.println("Su saldo actual es de: $"+obtenDeposito());
        }
        else{
            System.out.println("Lo sentimos, no puede retirar dinero,"
                    + "\ntiene que dejar un deposito minimo de $500");
        }
    }
    
    public void accionesCuenta(){
        System.out.println("***RED DE CAJAS BANCO INC***"
                + "\nQue desea hacer hoy"
                + "\nA. Consultar Cuenta de ahorro, B. Retiro de cuenta de ahorro");
        System.out.println("Digite una opcion de la pantalla:");
        char opcion=in.next().charAt(0);
        if(opcion=='A'||opcion=='a'){
            System.out.println("Su saldo actual es de: $"+obtenDeposito());
        }
        else if((opcion=='B')||(opcion=='b')){
            retiroCuenta();
        }
        
    }
    
}
