package RatingLibros;

public class Estanteria {
    public static void main (String [] args){
        ConjuntoLibros c = new ConjuntoLibros("Estantería 1");
        int libro1 = c.AnadirLibro("Don Quijote", "Cervantes", 1345, 10);
        int libro2 = c.AnadirLibro("El Principito", "Antoine", 111, 7);
        System.out.println(c);
        System.out.println("Voy a cambiar las valoraciones");
        c.CambiarCalif("Don Quijote", 6);
        c.CambiarCalif("Antoine", 8);
        System.out.println(c);
        System.out.println("Ahora voy a eliminar de la estanteria los dos libros y voy a meter 2 nuevos.");
        c.EliminarLibro("Cervantes");
        c.EliminarLibro("El Principito");
        int libro3 = c.AnadirLibro("Cien años de soledad", "Gabriel García Márquez", 471, 8);
        int libro4 = c.AnadirLibro("Historia de dos ciudades", "Charles Dickens", 608, 9);
        System.out.println(c);
    }
}

