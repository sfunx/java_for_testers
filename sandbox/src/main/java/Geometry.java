import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class Geometry {
    private static String getDefaultCharSet() {
        OutputStreamWriter writer = new OutputStreamWriter(new ByteArrayOutputStream());
        String enc = writer.getEncoding();
        return enc;
    }
    public static void main(String[] args) {
        var a = 5;

//        Charset.defaultCharset()
//        System.out.println("Default Charset=" + Charset.defaultCharset());
//        System.setProperty("file.encoding", "CP1251");
//        System.out.println("file.encoding=" + System.getProperty("file.encoding"));
//        System.out.println("Default Charset=" + Charset.defaultCharset());
//        System.out.println("Default Charset in Use=" + getDefaultCharSet());
        System.out.println("Площадь квадрата со стороной " + a + " = " + a * a);
    }
}
