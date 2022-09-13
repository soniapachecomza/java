public class Main
{
    public static void main(String[] args) {

     // String
    String mensaje = "";
    String curso = "Java";
    
    float valor = 10.872040f;
    mensaje = String.format(" El total de %d articulos es %.2f %s", 3, valor, "pesos");
    
    System.out.println(mensaje);
    System.out.printf(" El total de %d articulos es %.5f %s", 4, valor, "pesos");
    }
}
