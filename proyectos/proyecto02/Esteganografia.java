import java.util.Scanner;

public class Esteganografia{
    
    public String descifraNulo(String original, int n){

        Scanner scanner = new Scanner(original);
        String mensajeResuelto = "";

        while (scanner.hasNext()) {
            String palabra = scanner.next();
            if (palabra.length() > n) {
                mensajeResuelto += palabra.charAt(n);
            }
        }

        scanner.close();

        return mensajeResuelto;
    }

    public String descifraNulo(String original){

        Scanner scanner = new Scanner(original);
        String mensajeResuelto = "";

        int n = 0;
        
        for (int i = original.length() - 1; i>0 && original.charAt(i) == ' '; i--){
            n++;
        }

        while (scanner.hasNext()) {
            String palabra = scanner.next();
            if (palabra.length() > n) {
                mensajeResuelto += palabra.charAt(n);
            }
        }

        scanner.close();

        return mensajeResuelto;
    }

    public boolean contieneNombre(String mensaje, String nombre){

        String mensajeLimpio = "";
        String nombreLimpio = nombre.toLowerCase();

        for (int i = 0; i < mensaje.length(); i++) {
            String temp = mensaje.substring(i, i+1).toLowerCase();
            if (temp.compareTo("a") >= 0 && temp.compareTo("z") <= 0) {
                mensajeLimpio += temp;
            }
        }

        return mensajeLimpio.contains(nombreLimpio);
    }

    public String descifraPalabrasMarcadas(String m, String e){
         
        Scanner scanner = new Scanner(m);
        Scanner scanner2 = new Scanner(e);

        String mensajeResuelto = "";

        while (scanner.hasNext() && scanner2.hasNext()) {
            String palabram = scanner.next();
            String palabrae = scanner2.next();

            if (!palabram.equals(palabrae)) {
                mensajeResuelto += palabram + " ";
            }
        }

        scanner.close();
        scanner2.close();

        return mensajeResuelto;
    }

    public String descifraLetrasMarcadas(String m, String e){
         
        String mensajeResuelto = "";

        for (int i = 0; i<m.length() && i<e.length(); i++) {
            String letram = m.substring(i, i+1);
            String letrae = e.substring(i, i+1);

            if (!letram.equals(letrae)) {
                mensajeResuelto += letram;
            }
        }

        return mensajeResuelto;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Esteganografia e = new Esteganografia();

        System.out.println("Tomaremos la n-esima letra de cada palabra para obtener el mensaje oculto.");
        System.out.println("Danos un mensaje: ");
        String mensajeOculto1 = scanner.nextLine();
        System.out.println("Danos un indice: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("El mensaje oculto es: " + e.descifraNulo(mensajeOculto1, n));

        System.out.println("Tomaremos la n-esima letra de cada palabra, considerando el indice segun los espacios al final del mensaje dado, para obtener el mensaje oculto.");
        System.out.println("Danos un mensaje: ");
        String mensajeOculto2 = scanner.nextLine();
        System.out.println("El mensaje oculto es: " + e.descifraNulo(mensajeOculto2));

        System.out.println("Buscaremos un nombre oculto en un texto arbitrario ignorando espacios, signos de puntuacion y sin hacer distinciones entre mayusculas y minusculas.");
        System.out.println("Danos un texto: ");
        String texto = scanner.nextLine();
        System.out.println("Danos el nombre a buscar: ");
        String nombre = scanner.nextLine();
        System.out.println("Encontramos el nombre?" + e.contieneNombre(texto, nombre));

        System.out.println("Reconstruiremos el mensaje oculto a partir de las palabras especiales que se obtienen al comparar dos textos.");
        System.out.println("Danos el primer texto: ");
        String texto1 = scanner.nextLine();
        System.out.println("Danos el segundo texto: ");
        String texto2 = scanner.nextLine();
        System.out.println("El mensaje oculto es: " + e.descifraPalabrasMarcadas(texto1, texto2));

        System.out.println("Reconstruiremos el mensaje oculto a partir de las letras especiales que se obtienen al comparar dos textos.");
        System.out.println("Danos el primer texto: ");
        String texto3 = scanner.nextLine();
        System.out.println("Danos el segundo texto: ");
        String texto4 = scanner.nextLine();
        System.out.println("El mensaje oculto es: " + e.descifraLetrasMarcadas(texto3, texto4));

        scanner.close();
    }
}