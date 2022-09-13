public class Main
{
    public static void main(String[] args) {

     // switch
     String colorLuz = "Rojo";
     
     switch(colorLuz){
         case "Verde" :
             System.out.println("Puede continuar");
             //
             break;
         case "Amarillo" :
             System.out.println("Alto parcial");
             //
             break;
         case "Rojo" :
             System.out.println("Alto total");
             //
             break;
             
        default:
            System.out.println("Color no válido");
     }
     
   
}

