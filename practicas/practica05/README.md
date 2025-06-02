PASOS PARA EJECUTAR EL PROGRAMA. 
1. Ubicarse en su terminal con la ruta en donde se encuentra este archivo.
2. Compilar el código con: javac Main.java
3. Ejecutar el código con: java Main
4. Seguir las indicaciones propias del programa para obtener los resultados esperados.

Se decidió definir el método toString() dentro de la superclase FiguraGeometrica, pero sobreescribirlo en cada subclase. Esto se hizo con base en el principio de reutilización de código, ya que todas las figuras comparten la necesidad de representar su información como texto, pero cada una tiene una forma y valores particulares.