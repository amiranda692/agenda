package angenda;



public class Contacto {

    private int id;
    private String nombre, apellido, correo;
    private int telefono;
    
    
    public Contacto(int id, String nombre, String apellido, int telefono, String correo){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public int getTelefono(){
        return telefono;
    }
    
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }
        
    
    @Override
    public String toString(){
        return "ID: " + id + " Nombre: " +nombre + " Apellido: " +apellido + " Telefono: " +telefono + " Correo: " +correo;
                
    }
}

    