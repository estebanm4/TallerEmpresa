package taller;
import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private int nit;
    private ArrayList <Empleado> empleados;
    private ArrayList <Departamento> departamentos;

    public Empresa(String nombre, int nit) {
        this.nombre = nombre;
        this.nit = nit;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }
    
    public boolean addEmpleado(Empleado empleado){
        if(this.empleados.add(empleado))
            return true;
        else
            return false;
    }
    
    public boolean addDepartemanto(Departamento departamento){
        if(this.departamentos.add(departamento))
            return true;
        else
            return false;
        
    }
    
    public ArrayList<Departamento> listarDepartamentos(){
        return this.departamentos;
    }
    
    public Empleado darDirector(String nombreDepartamento){
        for (int i; i < this.departamentos.size(); i++) {
            Departamento aux = this.departamentos.get(i);
            if(aux.getNombre().equals(nombreDepartamento)){
                director = aux.darDirector();
                break;
            }
        }
        return director;
    }
    
}
