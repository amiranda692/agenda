package angenda;

import java.util.ArrayList;


public class Agenda {

    private ArrayList<Contacto> contactos;
    private int ultimoId;
    
    public Agenda(){
        this.contactos = new ArrayList<>();
        this.ultimoId = 0;
    }
    
    public void listarContactos(){
        if(contactos.isEmpty()){
            System.out.println("No hay contactos en la agenda");
        } else {
            for (Contacto contacto : contactos) {
                System.out.println("------------------");
                System.out.println(contacto);
            }
        }
    
    }
    
    public void agregarContacto(String nombre, String apellido, int telefono, String correo){
        ultimoId ++;
        Contacto nuevoContacto = new Contacto(ultimoId, nombre, apellido, telefono, correo);
        contactos.add(nuevoContacto);
        System.out.println("contacto agregado con exito!");
        System.out.println("-----------------------------");
        System.out.println(nuevoContacto.toString());
    
    }
    
    public void borrarContacto(int id){
        boolean isFound = false;
        for(Contacto contacto : contactos){
            if(contacto.getId() ==id){
            contactos.remove(contacto);
            System.out.println("Contacto eliminado!");
            isFound = true;
            break;
            }
        }
        if (!isFound){
        System.out.println("Contacto no encontrado!");
        }
    }
    
    public void buscarContacto(int id){
        boolean isFound =false;
        for (Contacto contacto : contactos){
            if (contacto.getId() == id){
            System.out.println(contacto);
            isFound = true;
            break;
            }
        }
        if(!isFound){
            System.out.println("Contacto con ID" +id + " no encontrado.");
        }
    
    }
    
}
