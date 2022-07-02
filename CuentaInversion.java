
package sistemabanco2;

import java.util.Scanner;

public class CuentaInversion extends Persona{
    Scanner in=new Scanner(System.in);
    private int dep, retiro, resultado, resultado2;
    
    public CuentaInversion(String nombre, int identificacion, int deposito){
        super(nombre, identificacion);
        this.dep=deposito;
    }
    
    public int obtenDeposito(){
        return dep;
    }
    
    public void aperturaCuenta(){
        System.out.println("Digite nuevamente el numero IDE del cliente: ");
        int validacion=in.nextInt();
        
        if((obtenDeposito()>=25000)&& ide==validacion){
            System.out.println("Su apertura de cuenta de inversion fue existosa");
        }
        else{
            System.out.println("Su apertura de cuenta de inversion no fue existosa"
                    + "\nfondo insuficiente para el deposito o IDE erroneo");
        }
    }
    
    public void retiroCuenta(){
        System.out.println("Cuanto desea retirar: $");
        retiro=in.nextInt();
        resultado=this.dep-10000;
        if(retiro<=resultado){
            System.out.println("Su saldo anterior fue de: $"+obtenDeposito());
            resultado2=this.dep-retiro;
            this.dep=resultado2;
            System.out.println("Su saldo actual es de: $"+obtenDeposito());
        }
        else{
            System.out.println("Lo sentimos, no puede retirar dinero,"
                    + "\ntiene que dejar un deposito minimo de $10000");
        }
    }
    
    public void accionesCuenta(){
        System.out.println("***RED DE CAJAS BANCO INC***"
                + "\nQue desea hacer hoy"
                + "\nA. Consultar Cuenta de inversion, B. Retiro de cuenta de inversion"
                + "\nC. Cancelar la cuenta de inversion");
        System.out.println("Digite una opcion de la pantalla:");
        char opcion=in.next().charAt(0);
        if(opcion=='A'||opcion=='a'){
            System.out.println("Su saldo actual es de: $"+obtenDeposito());
        }
        else if((opcion=='B')||(opcion=='b')){
            retiroCuenta();
        }
        else if((opcion=='C')||(opcion=='c')){
            System.out.println("Su cuenta ha sido cancelada su saldo anterior"
                    + "\nera de $"+obtenDeposito());
            resultado=this.dep-retiro;
            this.dep=resultado;
            System.out.println("El retiro total fue de $"+obtenDeposito());
            
        }
    }
}
