public class Cuadrado extends FiguraGeometrica {
    private double lado;

    public Cuadrado(double lado) {
        super(lado, lado);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public String toString() {
        return "Cuadrado con lados: " + lado + ", " + lado + ", " + lado + ", " + lado;
    }
}