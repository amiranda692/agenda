package angenda;

import java.util.Scanner;


public class Menu {
    
    private Agenda agenda;
    private Scanner scanner;
    
    public Menu(){
        this.agenda = new Agenda();
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu(){
        while(true){
        System.out.println("\nMenú:");
        System.out.println("1. Listar contactos");
        System.out.println("2. Agregar contacto");
        System.out.println("3. Borrar contacto");
        System.out.println("4. Buscar contacto");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        
        switch (opcion){
            
            case 1:
                agenda.listarContactos();
                break;
                
            case 2:
                agregarContacto();
                break;
                
            case 3:
                borrarContacto();
                break;
            
            case 4:
                buscarContacto();
                break;
                
            case 5:
                System.out.println("Saliendo...");
                scanner.close();
                return;
            default:
                System.out.println("Opción no válida");
        }        
    }    
}
    
    
    public void agregarContacto(){
    
        System.out.println("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese el apellido: ");
        String apellido = scanner.nextLine();
        
        System.out.println("Ingrese el telefono: ");
        int telefono = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el correo: ");
        String correo = scanner.nextLine();
        
        
        agenda.agregarContacto(nombre, apellido, telefono, correo);
        
    }
    
    public void borrarContacto(){
        
        System.out.println("Ingrese el ID del contacto a borrar: ");
        int id = scanner.nextInt();
        scanner.nextLine();        
        agenda.borrarContacto(id);
    }
    
    public void buscarContacto(){
        System.out.println("Introduzca el ID del usuario deseado: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        agenda.buscarContacto(id);        
    }
        
   
    
    
    public static void main(String[] args){
    
        Menu menu = new Menu();
        menu.mostrarMenu();
        
    }
    
    
    
}
