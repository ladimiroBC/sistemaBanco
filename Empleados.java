
package sistemabanco2;



public class Empleados extends Persona{
    private String puesto;
    private int salario, antiguedad; //antiguedad (en meses) 
    
    public Empleados(String nombre, int identificacion, String puesto, int salario, int antiguedad){
        super(nombre,identificacion);
        this.puesto=puesto;
        this.salario=salario;
        this.antiguedad=antiguedad;
    }
    
    public String obtenPuesto(){
        return puesto;
    }
    
    public int obtenSalario(){
        return salario;
    }
    
    public int obtenAntiguedad(){
        return antiguedad;
    }
    
    public void infoEmpleado(){
        System.out.println("***INFORMACION DEL EMPLEADO***");
        System.out.println("NOMBRE: "+nom+"\n"
                          +"IDENTIFICACION: "+ide+"\n"
                          +"PUESTO: "+obtenPuesto()+"\n"
                          +"SALARIO: $"+obtenSalario()+"\n"
                          +"ANTIGUEDAD: "+obtenAntiguedad()+"\n");
    }
    
    public void obtenerVacaciones(){
        //Puestos: Gerentes: $85000, Asistentes: $48000, Ingenieros: $65000, Administrativos: $52000.
        
        if(obtenAntiguedad()<=24){
            System.out.println("El empleado "+nom+" con el cargo de "+obtenPuesto()+"\n"
                    +"y una antiguedad de "+obtenAntiguedad()+" meses, sale por 10 dias de vacaciones");
        }
        
        else if(obtenAntiguedad()>25 && obtenAntiguedad()<=60){
            System.out.println("El empleado "+nom+" con el cargo de "+obtenPuesto()+"\n"
                    +"y una antiguedad de "+obtenAntiguedad()+" meses, sale por 25 dias de vacaciones");
        }
        else if(obtenAntiguedad()>61){
            System.out.println("El empleado "+nom+" con el cargo de "+obtenPuesto()+"\n"
                    +"y una antiguedad de "+obtenAntiguedad()+" meses, sale por 40 dias de vacaciones");
        }
    }
}
