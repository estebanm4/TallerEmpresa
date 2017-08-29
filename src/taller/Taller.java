package taller;
import java.util.Scanner;
public class Taller {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Empresa empresa = new Empresa("xxx", 123);
        
        int continuar = 0, opcion = 0; 
        do{
        System.out.println("1. Crear Departamento");
        System.out.println("2. Crear Empleado");
        System.out.println("3. Listar Departamento");
        opcion = in.nextInt();
        if(opcion ==1){
            System.out.println("Nombre Departamento");
            String nombre = in.next();
            Departamento nuevo = new Departamento(nombre);
            if(empresa.addDepartamento(nuevo)){
                System.out.println("Se agrego satisfactiriamente");
            } else {
                System.out.println("Problemas al registrar el departamento");
            }
            
        }else if (opcion == 2){
            
        } else if (opcion ==3){
            
        } else {
            System.out.println("Opción Inválida");
        }
        } while (continuar == 0);
    }
    
}
