package entidades;

public class Cliente {
    private int id;
    private String nombre;
    private String apaterno;
    private String amaterno;
    private char tipo;/* L=Local F=Foráneo*/
    private String telefono;
    private String correo;
    
    //contructores
    public Cliente() {
        id=0;
        nombre=apaterno=amaterno=telefono=correo="";
        tipo='L';
    }
    
    public Cliente(int id, String nombre, String apaterno, String amaterno, char tipo, String telefono, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apaterno = apaterno;
        this.amaterno = amaterno;
        this.tipo = tipo;
        this.telefono = telefono;
        this.correo = correo;
    }
    
     public Cliente(int id, String nombre, String apaterno, String amaterno) {
        this.id = id;
        this.nombre = nombre;
        this.apaterno = apaterno;
        this.amaterno = amaterno;
        this.tipo='L';
        this.telefono="";
        this.correo=""; 
    }
    
    //(Métodos set y get) setter y getter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApaterno() {
        return apaterno;
    }

    public void setApaterno(String apaterno) {
        this.apaterno = apaterno;
    }

    public String getAmaterno() {
        return amaterno;
    }

    public void setAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String getTipoTXT(char tipo){
        if (tipo=='L') {
            return "Local";
        }else if(tipo=='F'){
            return "Foráneo";
        }else{
            return "Deconocido";
        }
    }
    
    @Override
    public String toString(){
        String cliente_txt="";
        cliente_txt+="--------------Cliente "+id+"---------------"+"\n";
        cliente_txt+="ID:"+id+"\n";
        cliente_txt+="Nombre:"+nombre+"\n";
        cliente_txt+="Apellido Paterno:"+apaterno+"\n";
        cliente_txt+="Apellido Materno:"+amaterno+"\n";
        cliente_txt+="Tipo:"+getTipoTXT(tipo)+"\n";
        cliente_txt+="Teléfono:"+telefono+"\n";
        cliente_txt+="Correo:"+correo+"\n";
        return cliente_txt;
    }
    
}
