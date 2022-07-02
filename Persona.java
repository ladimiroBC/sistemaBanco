
package sistemabanco2;


public class Persona {
    protected String nom;
    protected int ide;
    
    public Persona(String nombre, int identificacion){
        this.nom=nombre;
        this.ide=identificacion;
    }
    
    public String obtenNombre(){
        return nom;
    }
    
    public int obtenIde(){
        return ide;
    }
}
