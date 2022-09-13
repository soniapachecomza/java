public class Main
{
    public static void main(String[] args) {

    //for each
    
    int calificaciones[] = { 9, 8, 7, 10, 10, 9, 8, 8, 10, 9};
    int suma = 0;
    
    // sum / cantidad
    //for( int indice = 0; indice < calificaciones.length; indice++) {
    for ( int valorPorIndice : calificaciones)  {
        
        System.out.println(valorPorIndice);
        
    }
    float promedio = suma / calificaciones.length;
    System.out.println("La promedio es " + promedio);

   }
}

