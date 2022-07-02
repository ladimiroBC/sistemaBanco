
package sistemabanco2;

import java.util.Scanner;

public class SistemaBanco2 {

   
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String nombre;
        int identificacion, deposito;
        
        String msn="***BIENVENIDO A NUESTRO SOFTWARE BANCARIO***";
        System.out.println(msn);
        
        String msn1="¿Que accion desea realizar?"
                + "\nA. Abrir Cuenta de Ahorro, B. Abrir Cuenta de Inversion"
                + "\nC. Determinar Informacion o Dias de Vacaciones de un Empleado";
        System.out.println(msn1);
        
        System.out.println("Introduzca la opcion del tipo de cuenta: ");
        char opcion=in.next().charAt(0);
        
        if(opcion=='A'||opcion=='a'){
            System.out.println("***Bienvenido a la apertura de la cuenta de ahorro***");
            System.out.println("Digite el nombre del cliente");
            nombre=in.next();
            System.out.println("Digite la identificacion del cliente");
            identificacion=in.nextInt();
            Persona cuenta=new Persona(nombre, identificacion);
            System.out.println("Ingrese el deposito a la cuenta: $");
            deposito=in.nextInt();
            CuentaAhorro acciones=new CuentaAhorro(nombre, identificacion, deposito);
            acciones.aperturaCuenta();
            acciones.accionesCuenta();
        }
        
        else if(opcion=='B'||opcion=='b'){
            System.out.println("***Bienvenido a la apertura de la cuenta de inversion***");
            System.out.println("Digite el nombre del cliente");
            nombre=in.next();
            System.out.println("Digite la identificacion del cliente");
            identificacion=in.nextInt();
            Persona cuenta=new Persona(nombre, identificacion);
            System.out.println("Ingrese el deposito a la cuenta: $");
            deposito=in.nextInt();
            CuentaInversion acciones=new CuentaInversion(nombre, identificacion, deposito);
            acciones.aperturaCuenta();
            //acciones.accionesCuenta();
        }
        
        else if(opcion=='C'||opcion=='c'){
            Empleados informacion=new Empleados("jose", 47856, "Ingeniero", 65000, 45);
            informacion.infoEmpleado();
            informacion.obtenerVacaciones();
        }
    }
    
}
