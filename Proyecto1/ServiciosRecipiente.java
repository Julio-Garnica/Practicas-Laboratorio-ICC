public interface ServiciosRecipiente{
    public double capacidad ();
    public double capacidadRestante ();
    public boolean estaVacio ();
    public boolean estaLleno ();
    public double rellena (double cantidad);
    public double vacia ();
    public void vierte (Recipientes otro);
    public boolean mismasDimensiones (Recipientes otro);
    public boolean mismaCapacidad (Recipientes otro);
    public boolean contieneMas (Recipientes otro);
    public boolean cabeMas (Recipientes otro);
    public Recipientes creaContenedorJusto ();
    public String  muestra ();
}