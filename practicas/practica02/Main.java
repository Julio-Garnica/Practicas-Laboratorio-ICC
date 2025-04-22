import java.util.Scanner;

public class Main{

    public static void main (String[] args){
        Reloj reloj = new Reloj(23, 59, 55);

        Scanner scanner = new Scanner (System.in);

        System.out.println("-----MENU-----");
        System.out.println("La opcion 1 ejecuta el programa con for.");
        System.out.println("La opcion 2 ejecuta el programa con while.");
        System.out.println("La opcion 3 ejecuta el programa con do-while.");

        System.out.println("Ingresa la opcion que deseas ejecutar.");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                for (int i=0; i<10; i++){
                    reloj.avanzarSegundo();
                    System.out.println(reloj.muestra());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case 2:
                int contador = 0;
                while (contador < 10) {
                    reloj.avanzarSegundo();
                    System.out.println(reloj.muestra());
                    contador++;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case 3:
                contador = 0;
                do{
                    reloj.avanzarSegundo();
                    System.out.println(reloj.muestra());
                    contador++;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } while (contador < 10);
                break;
            default:
                System.out.println("Opcion no valida, intente de nuevo.");
                break; 
        } 
        scanner.close();
    }
}