public class Main{
    
    public static void main(String[] args){
        System.err.println("--------------------");
        System.err.println("---Listas Ligadas---");
        System.err.println("--------------------");
        ListaLigada lista = new ListaLigada();
        System.out.println(lista.toString());
        lista.insertarFinal(1);
        lista.insertarFinal(2);
        lista.insertarFinal(3);
        lista.insertarFinal(4);
        lista.insertarFinal(5);
        System.out.println(lista.toString());
        lista.eliminar(1);
        System.out.println(lista.toString());
        lista.eliminar(4);
        System.out.println(lista.toString());
    }
}