import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //LECTURA DE DATOS
        int opcion=0;
        Scanner entrada=new Scanner(System.in);

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
                    System.out.println("opc1");
                    break;
                case 2:
                    System.out.println("opc2");
                    break;
                case 3:
                    System.out.println("opc3");
                    break;
                case 4:
                    System.out.println("opc4");
                    break;
                case 5:
                    System.out.println("opc5");
                    break;
                case 6:
                    System.out.println("opc6");
                    break;
                case 7:
                    System.out.println("opc7");
                    break;
                default:
                    System.out.println("Opción inválida...");
            }
        }
    }
}