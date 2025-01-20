import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class Geometry {
//    private static String getDefaultCharSet() {
//        OutputStreamWriter writer = new OutputStreamWriter(new ByteArrayOutputStream());
//        String enc = writer.getEncoding();
//        return enc;
//    }
    public static void main(String[] args) {
        printSquareArea( 7);
        printSquareArea( 5);
        printSquareArea( 3);

        printRectangleArea( 4.0, 5.0 );
        printRectangleArea( 5.0, 7.0 );
    }

    static void printRectangleArea(double a, double b) {
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + squareRectangle(a,b));
    }

    private static double squareRectangle(double a, double b) {
        return a * b;
    }

    static void printSquareArea(double side) {
        System.out.println("Площадь квадрата со стороной " + side + " = " + squareArea(side));
    }

    private static double squareArea(double side) {
        return side * side;
    }
}
