package boletin30;

import java.util.ArrayList;

public class Boletin30 {

    public static void main(String[] args) {
        //int dorsal, String demarcacion, int id, String nombre, String apellidos, int edad
        SeleccionFutbol futbolista=new Futbolista(1, "portero", 123456, "as", "bd",18);
        //String titulacion, int aniosExperiencia, int id, String nombre, String apellidos, int edad
        SeleccionFutbol masajista=new Masajista("Masajista", 20, 234567, "Javier", "López",36);
        //int idFederacion, int id, String nombre, String apellidos, int edad
        SeleccionFutbol entrenador=new Entrenador(1234, 345678, "Vicente", "Del Bosque",55);

        ArrayList<SeleccionFutbol> seleccion=new ArrayList();
        seleccion.add(futbolista);
        seleccion.add(masajista);
        seleccion.add(entrenador);

        for (SeleccionFutbol elemento : seleccion) {
            System.out.println(elemento.toString());
        }

    }

}
