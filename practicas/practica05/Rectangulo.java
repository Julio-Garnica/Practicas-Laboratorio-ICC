public class Rectangulo extends FiguraGeometrica {
    private double lado1, lado2;

    public Rectangulo(double base, double altura) {
        super(base, altura);
        this.lado1 = base;
        this.lado2 = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (lado1 + lado2);
    }

    @Override
    public String toString() {
        return "Rectangulo con lados: " + lado1 + ", " + lado2 + ", " + lado1 + ", " + lado2;
    }
}