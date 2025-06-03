package org.example;

public class Principal {
    public static void main(String[] args) {
        Pelicula peli = new Pelicula();
        peli.titulo = "Rapunsel";
        peli.fechaDeLanzamiiento = 2019;
        peli.duracion = 300;

        System.out.println("nombre de la pelicula " + peli.titulo);
        System.out.println("fecha de lanzamiento " + peli.fechaDeLanzamiiento);
        System.out.println("Duracion  de la pelicula " + peli.duracion);

        //llamando el metodo
        peli.muestraFichaTecnica();
        peli.evalua(10);
        peli.evalua(5);
        System.out.println(peli.sumaEvaluaciones);
        System.out.println(peli.totalEvaluaciones);
        System.out.println(peli.cacalaMedia());


        //remplazando los valores del metodo
        Pelicula pelio = new Pelicula();
        pelio.titulo = "Randa";
        pelio.fechaDeLanzamiiento = 2019;
        pelio.duracion = 300;
        pelio.muestraFichaTecnica();
}
}
