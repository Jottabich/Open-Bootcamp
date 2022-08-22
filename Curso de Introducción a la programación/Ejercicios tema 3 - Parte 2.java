public class Main {

    public static void main(String[] args) {
        coche miCoche = new coche();
        miCoche.incrementar_puertas();
        System.out.println(miCoche.puertas);
    }
}
    class coche {
        public int puertas = 0;
        public void incrementar_puertas() {
            this.puertas ++;
        }
    }
