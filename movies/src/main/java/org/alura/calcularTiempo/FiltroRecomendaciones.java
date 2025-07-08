package org.alura.calcularTiempo;

public class FiltroRecomendaciones {

     public static void filtra(Clasificacion clasificacion) {
        if(clasificacion.getClasificacion() >= 4){
            System.out.println("buena evaluacion " + clasificacion.getClasificacion());
        }else if(clasificacion.getClasificacion() >= 2){
            System.out.println("Popular por el momento " + clasificacion.getClasificacion());
        }else{
            System.out.println("mala evaluacion " + clasificacion.getClasificacion());
        }
    }
}
