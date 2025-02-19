import java.util.Scanner;

public class Main {
    public static void imprimirCalculadora(){
        System.out.println("---------------");
        System.out.println("- CALCULADORA -");
        System.out.println("---------------");
    }
    public static void imprimirOpciones(){
        System.out.println("La opcion 1 suma dos numeros dados por el usuario.");
        System.out.println("La opcion 2 multiplica dos numeros dados por el usuario.");
        System.out.println("La opcion 3 divide dos numeros dados por el usuario.");
        System.out.println("La opcion 4 repite una oracion dada por el usuario");
    }
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        imprimirCalculadora();
        imprimirOpciones();

        System.out.println("Proporciona el numero de la opcion que te gustaria realizar.");
        int x = scanner.nextInt();
        scanner.nextLine();

        if (x==1) {
            System.out.println("Ingresa el primer numero");
            double y = scanner.nextDouble();
            System.out.println("Ingresa el segundo numero");
            double z = scanner.nextDouble();
            Double suma = y + z;
            System.out.println("La suma del primero numero mas el segundo es igual a: " + suma);
        }else if (x==2) {
            System.out.println("Ingresa el primer numero");
            double y = scanner.nextDouble();
            System.out.println("Ingresa el segundo numero");
            double z = scanner.nextDouble();
            Double producto = y * z;
            System.out.println("El producto del primer numero por el segundo es igual a: " + producto);
        }else if (x==3) {
            System.out.println("Ingresa el primer numero");
            double y = scanner.nextDouble();
            System.out.println("Ingresa el segundo numero");
            double z = scanner.nextDouble();
            Double division = y / z;
            System.out.println("La division del primer numero entre el segundo es igual a: " + division);
        }else if (x==4) {
            System.out.println("Teclea una oracion");
            String oracion = scanner.nextLine();
            System.out.println("La oracion dada por el usuario es: " + oracion);
        }else {
            System.out.println("No existe esa opcion. Ingresa un numero entre 1, 2 o 3.");
        }
        scanner.close();
    }
}