package main;

public class Main
{
    public static void main(String[] args) {
        //clases y objetos
        
        Perro lassie = new Perro();// Instancia
        
        lassie.nombre = "Lassie";
        lassie.raza = "Collie";
        lassie.edad = 4;
        
        System.out.println("El nombre es: "+ lassie.nombre);
        System.out.println("La raza es: "+ lassie.raza);
        System.out.println("La  es: "+ lassie.edad);
    }
}
