public class Main
{
    public static void main(String[] args) {

     // switch
   char calificacion = 'A';
   
   switch(calificacion) {
       case 'A' :
           System.out.println("Excelente!");
           break;
       case 'B' :
           System.out.println("Muy bien hecho");
           break;  
       case 'C' :
           System.out.println("Bien hecho");
           break;
       case 'D' :
           System.out.println("Aprobatorio");
           break;
       case 'E' :
           System.out.println("Puedes mejorar");
           break;
        default :
        System.out.println("Calificación no válida");
   }
     }
     
   
}

