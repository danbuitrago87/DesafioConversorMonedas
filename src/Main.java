import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //LECTURA DE DATOS
        int opcion=0;
        Scanner entrada=new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        while(opcion!=7){

            System.out.println("*************************************************");
            System.out.println("Sea Bienvenido al conversor de monedas cuántico");
            System.out.println("1. Dolar            -----       Peso Argentino");
            System.out.println("2. Peso Argentino   -----       Dolar");
            System.out.println("3. Dolar            -----       Real Brasilero");
            System.out.println("4. Real Brasileño   -----       Dolar");
            System.out.println("5. Dolar            -----       Peso Colombiano");
            System.out.println("6. Peso Colombiano  -----       Dolar");
            System.out.println("7. Salir");
            System.out.println("*************************************************");

            System.out.println("Eliga una opción válida: ");
            opcion=entrada.nextInt();

            switch (opcion){
                case 1:
                    double rate1 = converter.convert("USD", "ARS");
                    System.out.println("Tasa de cambio de USD a ARS: " + rate1);
                    break;
                case 2:
                    double rate2 = converter.convert("ARS", "USD");
                    System.out.println("Tasa de cambio de ARS a USD: " + rate2);
                    break;
                case 3:
                    double rate3 = converter.convert("USD", "BRL");
                    System.out.println("Tasa de cambio de USD a BRL: " + rate3);
                    break;
                case 4:
                    double rate4 = converter.convert("BRL", "USD");
                    System.out.println("Tasa de cambio de BRL a USD: " + rate4);
                    break;
                case 5:
                    double rate5 = converter.convert("USD", "COP");
                    System.out.println("Tasa de cambio de USD a COP: " + rate5);
                    break;
                case 6:
                    double rate6 = converter.convert("COP", "USD");
                    System.out.println("Tasa de cambio de COP a USD: " + rate6);
                    break;
                case 7:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opción inválida...");
            }
        }
    }
}