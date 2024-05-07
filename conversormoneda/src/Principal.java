import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double cantidad;
        int opcion=0;

        ConsultaMoneda moneda=new ConsultaMoneda();

        while (opcion!=7){
            System.out.println("*******************************************");
            System.out.println("---Conversor de monedas---");
            System.out.println("1) Dolar =>> Peso Argentino");
            System.out.println("2) Peso argentino =>> Dolar");
            System.out.println("3) Dolar =>> Real brasileño");
            System.out.println("4) Real brasileño =>> Dolar");
            System.out.println("5) Dolar =>> Peso colombiano");
            System.out.println("6) Peso colombiano =>> Dolar");
            System.out.println("7) Salir");
            System.out.println("*******************************************");
            System.out.println("Ingresa la opcion");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese la cantidad a convertir de Dolares");
                    cantidad=sc.nextDouble();
                    Moneda moneda1=moneda.obtener("USD","ARS",cantidad);
                    System.out.println("El valor de "+cantidad+" USD "+moneda1);
                break;
                case 2:
                    System.out.println("Ingrese la cantidad a convertir de Pesos argentinos");
                    cantidad=sc.nextDouble();
                    Moneda moneda2=moneda.obtener("ARS","USD",cantidad);
                    System.out.println("El valor de "+cantidad+" ARS "+moneda2);
                break;
                case 3:
                    System.out.println("Ingrese la cantidad a convertir de Dolar");
                    cantidad=sc.nextDouble();
                    Moneda moneda3=moneda.obtener("USD","BRL",cantidad);
                    System.out.println("El valor de "+cantidad+" USD "+moneda3);
                break;
                case 4:
                    System.out.println("Ingrese la cantidad a convertir de Reales brasileños");
                    cantidad=sc.nextDouble();
                    Moneda moneda4=moneda.obtener("BRL","USD",cantidad);
                    System.out.println("El valor de "+cantidad+" BRL "+moneda4);
                break;
                case 5:
                    System.out.println("Ingrese la cantidad a convertir de Dolar");
                    cantidad=sc.nextDouble();
                    Moneda moneda5=moneda.obtener("USD","COP",cantidad);
                    System.out.println("El valor de "+cantidad+" USD "+moneda5);
                break;
                case 6:
                    System.out.println("Ingrese la cantidad a convertir de Pesos colombianos");
                    cantidad=sc.nextDouble();
                    Moneda moneda6=moneda.obtener("COP","USD",cantidad);
                    System.out.println("El valor de "+cantidad+" COP "+moneda6);
                break;
                case 7:
                    System.out.println("Saliendo....");
                    return;
                default:
                    System.out.println("Opcion no valida");
            }
        }

    }
}
