public class Main{
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.setNombre("Carlos Morató");
        cliente.setEdad(36);
        cliente.setTelefono(958632158);
        cliente.setCredito(0);

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Elizabeth Acosta");
        trabajador.setEdad(36);
        trabajador.setTelefono(657927559);
        trabajador.setSueldo("1200€");

        System.out.println("Cliente: " + cliente.getNombre() + " Edad: " + cliente.getEdad() + " Telefono: " + cliente.getTelefono() + " Saldo: " + cliente.getCredito() + "€");
        System.out.println("Trabajadora: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Telefono: " + trabajador.getTelefono());
        System.out.println(trabajador.getSueldo());

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
class Cliente extends Persona{
    int credito;
    public int getCredito(){
        return this.credito;
    }
    public void setCredito(int credito){
        this.credito = credito;
    }
}
class Trabajador extends Persona{
    String sueldo;
    public String getSueldo(){
        return "Mi sueldo es de: " + this.sueldo;
    }
    public void setSueldo(String sueldo){
        this.sueldo = sueldo;
    }
}
