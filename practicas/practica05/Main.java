public class Main {
        public static void main(String[] args) {
        Triangulo t1 = new Triangulo(4, 3, 3, 4, 5);
        FiguraGeometrica t2 = new Triangulo(5, 4, 4, 5, 6);

        Rectangulo r = new Rectangulo(6, 3);
        Cuadrado c = new Cuadrado(5);

        System.out.println(t1.toString() + ", area: " + t1.calcularArea() + ", perimetro: " + t1.calcularPerimetro());
        System.out.println(t2.toString() + ", area: " + t2.calcularArea() + ", perimetro: " + t2.calcularPerimetro());
        System.out.println(r.toString() + ", area: " + r.calcularArea() + ", perimetro: " + r.calcularPerimetro());
        System.out.println(c.toString() + ", area: " + c.calcularArea() + ", perimetro: " + c.calcularPerimetro());
    }
}