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
                    System.out.println("Digite el valor a cambiar: ");
                    double valor=entrada.nextDouble();
                    double rate1 = converter.convert("USD", "ARS");
                    double resultado=valor*rate1;
                    System.out.println("Tasa de cambio de USD a ARS: " + rate1);
                    System.out.println(valor + " Dolares Corresponde a: " + resultado + " Pesos Argentinos");
                    break;
                case 2:
                    System.out.println("Digite el valor a cambiar: ");
                    double valor2=entrada.nextDouble();
                    double rate2 = converter.convert("ARS", "USD");
                    double resultado2=valor2*rate2;
                    System.out.println("Tasa de cambio de ARS a USD: " + rate2);
                    System.out.println(valor2 + " Pesos Argentinos Corresponde a: " + resultado2 + " Dolares");
                    break;
                case 3:
                    System.out.println("Digite el valor a cambiar: ");
                    double valor3=entrada.nextDouble();
                    double rate3 = converter.convert("USD", "BRL");
                    double resultado3=valor3*rate3;
                    System.out.println("Tasa de cambio de USD a BRL: " + rate3);
                    System.out.println(valor3 + " Dolares Corresponde a: " + resultado3 + " Real Brasilero");
                    break;
                case 4:
                    System.out.println("Digite el valor a cambiar: ");
                    double valor4=entrada.nextDouble();
                    double rate4 = converter.convert("BRL", "USD");
                    double resultado4=valor4*rate4;
                    System.out.println("Tasa de cambio de BRL a USD: " + rate4);
                    System.out.println(valor4 + " Reales Brasileros Corresponde a: " + resultado4 + " Dolares");
                    break;
                case 5:
                    System.out.println("Digite el valor a cambiar: ");
                    double valor5=entrada.nextDouble();
                    double rate5 = converter.convert("USD", "COP");
                    double resultado5=valor5*rate5;
                    System.out.println("Tasa de cambio de USD a COP: " + rate5);
                    System.out.println(valor5 + " Dolares Corresponde a: " + resultado5 + " Pesos Colombianos");
                    break;
                case 6:
                    System.out.println("Digite el valor a cambiar: ");
                    double valor6=entrada.nextDouble();
                    double rate6 = converter.convert("COP", "USD");
                    double resultado6=valor6*rate6;
                    System.out.println("Tasa de cambio de COP a USD: " + rate6);
                    System.out.println(valor6 + " Pesos Colombianos Corresponden a: " + resultado6 + " Dolares");
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