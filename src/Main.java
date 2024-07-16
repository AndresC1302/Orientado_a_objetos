import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner usuario= new Scanner(System.in);
        ConsultarMoneda convertir= new ConsultarMoneda();
        String Bienvenida = """
                ***************************************************
                Sea bienvenido al conversor de moneda =]
                
                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar=>> Real brasileño
                4) Real brasileño =>>  Dólar
                5) Dólar =>> Peso colombiano
                6) Peso colombiano =>> Dólar
                7) Salir
                Elija una opción valida:
                ***************************************************
                """;
        int eleccion=0;
        while(eleccion != 7){
            switch (eleccion) {
                case 1:
                    System.out.println("Escriba la cantidad que desea convertir");
                    try {
                        double cantidad = usuario.nextDouble();
                        Moneda moneda = convertir.convertirMoneda(cantidad,"USD","ARS");
                        System.out.println("El valor "+ cantidad + moneda.getBase_code() + " corresponde al valor final de =>>> "+moneda.getConversion_result()+moneda.getTarget_code());
                    } catch (NumberFormatException e) {
                        System.out.println("Cantidad no covertida " + e.getMessage());
                    }

                    break;
                case 2:
                    System.out.println("Escriba la cantidad que desea convertir");
                    try {
                        double cantidad = usuario.nextDouble();
                        Moneda moneda = convertir.convertirMoneda(cantidad,"ARS","USD");
                        System.out.println("El valor "+ cantidad + moneda.getBase_code() + " corresponde al valor final de =>>> "+moneda.getConversion_result()+moneda.getTarget_code());
                    } catch (NumberFormatException e) {
                        System.out.println("Cantidad no covertida " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Escriba la cantidad que desea convertir");
                    try {
                        double cantidad = usuario.nextDouble();
                        Moneda moneda = convertir.convertirMoneda(cantidad,"USD","BRL");
                        System.out.println("El valor "+ cantidad + moneda.getBase_code() + " corresponde al valor final de =>>> "+moneda.getConversion_result()+moneda.getTarget_code());
                    } catch (NumberFormatException e) {
                        System.out.println("Cantidad no covertida " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Escriba la cantidad que desea convertir");
                    try {
                        double cantidad = usuario.nextDouble();
                        Moneda moneda = convertir.convertirMoneda(cantidad,"BRL","USD");
                        System.out.println("El valor "+ cantidad + moneda.getBase_code() + " corresponde al valor final de =>>> "+moneda.getConversion_result()+moneda.getTarget_code());
                    } catch (NumberFormatException e) {
                        System.out.println("Cantidad no covertida " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Escriba la cantidad que desea convertir");
                    try {
                        double cantidad = usuario.nextDouble();
                        Moneda moneda = convertir.convertirMoneda(cantidad,"USD","COP");
                        System.out.println("El valor "+ cantidad + moneda.getBase_code() + " corresponde al valor final de =>>> "+moneda.getConversion_result()+moneda.getTarget_code());
                    } catch (NumberFormatException e) {
                        System.out.println("Cantidad no covertida " + e.getMessage());
                    }
                    break;
                case 6:
                    System.out.println("Escriba la cantidad que desea convertir");
                    try {
                        double cantidad = usuario.nextDouble();
                        Moneda moneda = convertir.convertirMoneda(cantidad,"COP","USD");
                        System.out.println("El valor "+ cantidad + moneda.getBase_code() + " corresponde al valor final de =>>> "+moneda.getConversion_result()+moneda.getTarget_code());
                    } catch (NumberFormatException e) {
                        System.out.println("Cantidad no covertida " + e.getMessage());
                    }
            }
            System.out.println(Bienvenida);
            eleccion= usuario.nextInt();
        }
    }
}