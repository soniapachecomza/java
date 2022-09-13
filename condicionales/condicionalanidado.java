public class Main
{
    public static void main(String[] args) {

     // El promedio mínimo para aprobar es de 7
     // Si el promedio es de 10 = Muchas felicidades
     // Si el promedio es aprobatorio pero menor a 10 = felicidades
     // Si el promedio no es aprobatorio = Es necesario repasar bloques
     
     int promedio = 8;
     
    if (promedio >= 7){
        
        // El promedio es aprobatorio
        
        if (promedio == 10) {
        System.out.println("Muchas felicidades");
    } else {
        
        System.out.println("felicidades");
    }
    } else {
        
        // El promedio No es aprobatorio
        System.out.println("Es necesario repasar bloques");
    }
    }
}
