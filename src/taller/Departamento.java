package taller;

public class Departamento {
    private String nombre;
    private Empleado [] Empleados;
    private Empleado director;
    private Empleado revisor;
    private int numEmpleados;
    
    public Departamento(String nombre){
        this.nombre = nombre;
        this.Empleados = new Empleado [20];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }

    public Empleado getRevisor() {
        return revisor;
    }

    public void setRevisor(Empleado revisor) {
        this.revisor = revisor;
    }
      
    public boolean addEmpleado(Empleado empleado) {
        if(this.numEmpleados < 20){
            this.Empleados[this.numEmpleados] = empleado;
            this.numEmpleados++;
            return true;
        } else 
            return false;
    }
    
    public boolean addDirector(Empleado director){
        this.director = director;
        return true;
    }
    
     public Empleado darDirector(){
        return this.director;
    }
        
    public boolean addRevisor(Empleado revisor){
        this.revisor = revisor;
        return true;
    }
   
}
