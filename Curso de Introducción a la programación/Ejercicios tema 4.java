public class Main {

    public static void main(String[] args) {

        int numerolf = -1;

        if (numerolf == 0){
            System.out.println("Es cero");
        } else if (numerolf > 0) {
            System.out.println("Es positivo");
        } else if (numerolf < 0) {
            System.out.println("Es negativo");
        }

        int numeroWhile = 0;

        System.out.println("Valor variable numeroWhile = " + numeroWhile);
        while (numeroWhile <= 3){
            numeroWhile = numeroWhile + 1;
            System.out.println("Valor variable numeroWhile = " + numeroWhile);
        }

        do {
            numeroWhile = numeroWhile + 1;
            System.out.println("Entramos una vez en Do While = " + numeroWhile);
        } while (numeroWhile < 5);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1){
            System.out.println("Valor de numeroFor = " + numeroFor);
        }

        var estacion = "OTOÑO";

        switch (estacion){
            case "VERANO":
                System.out.println("es verano");
                break;
            case "INVIERNO":
                System.out.println("es invierno");
                break;
            case "PRIMAVERA":
                System.out.println("es primavera");
                break;
            case "OTOÑO":
                System.out.println("es otoño");
                break;
            default:
                System.out.println(estacion);
        }
    }
}
