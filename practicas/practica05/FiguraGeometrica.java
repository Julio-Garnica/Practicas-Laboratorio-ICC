public abstract class FiguraGeometrica {
    protected double base;
    protected double altura;

    public FiguraGeometrica(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    public abstract String toString();
}