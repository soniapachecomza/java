public class Main
{
    public static void main(String[] args) {

     // ciclo for 
     // for (Inicialización; Condición; Iteración){}
     
     for(int numero = 8, x = 1; x < 11;){
         
         int resultado =numero * x;
         String mensaje = numero + " * " + x + " = " + resultado;
         
          System.out.println(mensaje);
          x++;
     }
   }
}

