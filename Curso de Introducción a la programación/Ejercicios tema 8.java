public class Main{
    public static void main(String[] args){
        Persona persona1 = new Persona();
        persona1.setNombre("Carlos");
        persona1.setEdad(36);
        persona1.setTelefono(958632158);

        Persona persona2 = new Persona();
        persona2.setNombre("Elizabeth");
        persona2.setEdad(36);
        persona2.setTelefono(657927559);

        System.out.println(persona1.getNombre() + " - " + persona1.getEdad() + " - " + persona1.getTelefono());
        System.out.println(persona2.getNombre());
        System.out.println(persona2.getEdad());
        System.out.println(persona2.getTelefono());

    }
}
class Persona {
    private String nombre;
    private int edad;
    private int telefono;
    public void setTelefono(int telefono) {
        this.telefono=telefono;
    }
    public int getTelefono (){
        return this.telefono;
    }
    public void setEdad(int edad) {
        this.edad=edad;
    }
    public int getEdad (){
        return this.edad;
    }
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public String getNombre (){
        return this.nombre;
    }
}
