public class Recipiente implements ServiciosRecipiente{
    private double radio;
    private double altura;
    private double cantidadLiquido;
    private double cantidadVacia;
    private double cantidadRellena;
    private double excedente;
    private double cantidadTemp;
    private static final double PI = 3.1416;

    public Recipiente(double radio, double altura, double cantidadLiquido) {
        this.radio = radio;
        this.altura = altura;
        this.cantidadLiquido = cantidadLiquido;
    }

    public static void imprimirEncabezado() {
        System.out.println("-----------------------------------------");
        System.out.println("---PROYECTO 1. RECIPIENTES CILINDRICOS---");
        System.out.println("-----------------------------------------");
    }

    public double capacidad() {
        double capacidadTotal = radio * radio * altura * PI;
        return capacidadTotal;
    }

    public double capacidadRestante() {
        double restante = capacidad() - cantidadLiquido;
        return restante;
    }

    public boolean estaVacio() {
        return cantidadLiquido == 0;
    }

    public boolean estaLleno() {
        return capacidad() == cantidadLiquido;
    }

    public double rellena(double cantidad) {
       double nuevaCantidad = cantidadLiquido + cantidad;
       cantidadRellena = ((nuevaCantidad > capacidad()) ? capacidad() : nuevaCantidad);
       excedente = (nuevaCantidad - capacidad()) * ((nuevaCantidad > capacidad()) ? 1 : 0);
       return excedente;
    }

    public double vacia() {
        double liquidoAnterior = cantidadLiquido;
        cantidadVacia = cantidadLiquido * 0;
        return liquidoAnterior;
    }

    public void vierte(Recipiente otro) {
        double espacioLibre = otro.capacidad() - otro.cantidadLiquido;
        double cantidadAVertir = cantidadLiquido;
        cantidadAVertir = (cantidadAVertir > espacioLibre) ? espacioLibre : cantidadAVertir;
        cantidadTemp = cantidadLiquido - cantidadAVertir;
        otro.cantidadLiquido += cantidadAVertir;
    }

    public boolean mismasDimensiones (Recipiente otro) {
       boolean dimensiones = (radio == otro.radio && altura == otro.altura);
        return dimensiones;
    }

    public boolean mismaCapacidad (Recipiente otro) {
        return capacidad() == otro.capacidad();
    }

    public boolean contieneMas (Recipiente otro){
        return cantidadLiquido > otro.cantidadLiquido;
    }

    public boolean cabeMas (Recipiente otro){
        return capacidadRestante() > otro.capacidadRestante();
    }

    public Recipiente creaContenedorJusto (){
        double nuevaAltura = altura * (cantidadLiquido/capacidad());
        return new Recipiente (radio, nuevaAltura, 0);
    }

    public String muestra (){
        return "Radio: " + radio + "cm, " + "Altura: " + altura + "cm, " + "Volumen: " + capacidad() + "cm3, " + "Cantidad actual de liquido: " + cantidadLiquido + "cm3.";
    }

    public double getRadio() {
        return radio;
    }

    public double getAltura() {
        return altura;
    }

    public double getCantidadLiquido() {
        return cantidadLiquido;
    }

    public double getCantidadRellena(){
        return cantidadRellena;
    }

    public double getCantidadTemp(){
        return cantidadTemp;
    }

    public double getExcedente(){
        return excedente;
    }

    public double getCantidadVacia(){
        return cantidadVacia;
    }

    public static void main(String[] args) {
        Recipiente cilindro1 = new Recipiente(9, 20, 3100.20);
        Recipiente cilindro2 = new Recipiente(5, 10, 505.5);

        imprimirEncabezado();
        System.out.println("Capacidad total: " + cilindro1.capacidad() + " cm3");
        System.out.println("Capacidad restante: " + cilindro1.capacidadRestante() + " cm3");
        System.out.println("Esta vacio? " + cilindro1.estaVacio());
        System.out.println("Esta lleno? " + cilindro1.estaLleno());
        cilindro1.rellena(2500);
        System.out.println("La cantidad actual del recipiciente es igual a: " + cilindro1.getCantidadRellena() +  ", y la cantidad excedente es de: " + cilindro1.getExcedente());
        System.out.println("Despues de vaciarlo, la cantidad actual del recipientes es igual a: " + cilindro1.getCantidadVacia() + ", antes de vaciarlo tenia la cantidad de: " + cilindro1.vacia() + " cm3.");
        cilindro1.vierte(cilindro2);
        System.out.println("La cantidad de liquido en cilindro 1 despues de verter: " + cilindro1.getCantidadTemp() + " cm3." + ", y la cantidad de liquido en el cilindro 2 es: " + cilindro2.getCantidadLiquido() + " cm3.");
        System.out.println("Tienen las mismas dimesiones el cilindro 1 y el cilindro 2?" + cilindro1.mismasDimensiones(cilindro2));
        System.out.println("Tienen la misma capacidad el cilindro 1 y el cilindro 2?" + cilindro1.mismaCapacidad(cilindro2));
        System.out.println("El cilindro 1, tiene mayor cantidad de liquido que el cilindro2?" + cilindro1.contieneMas(cilindro2));
        System.out.println("El cilindro 1, tiene mayor capacidad restante que el cilindro 2?" + cilindro1.cabeMas(cilindro2));
        Recipiente cilindroJusto = cilindro1.creaContenedorJusto();
        System.out.println("El radio, la altura y el liquido vertido en el nuevo cilindro son los siguientes respectivamente: " + cilindroJusto.getRadio() + "cm, " + cilindroJusto.getAltura() + "cm, " +  cilindroJusto.getCantidadLiquido() + "cm3.");
        System.out.println(cilindro1.muestra());
    }
}