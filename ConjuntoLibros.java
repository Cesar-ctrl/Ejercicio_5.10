package RatingLibros;

public class ConjuntoLibros {
    private Libro[] conjunto;
    private int poslb;
    private String estanteria;

    public ConjuntoLibros(String temp){
        conjunto = new Libro[10];
        poslb = 0;
        estanteria = temp;
    }

    public int AnadirLibro(String ttlo, String auttor, int paglb, int califf){
        if (poslb>= conjunto.length){
            throw new RuntimeException("Se ha alcanzado el maximo de libros permitidos");
        }else{
            conjunto[poslb] = new Libro(ttlo, auttor, paglb, califf);
            poslb++;
            return califf;
        }
    }

    private int AutoroTitulo(String autorotitulo){
        int pos = 0;
        boolean esta = false;
        for (int i = 0; i < poslb; i++){
            if (conjunto[i].getAutor() == autorotitulo){
                esta = true;
            } else if(conjunto[i].getTitulo() == autorotitulo){
                esta = true;
            }
        }
        if (!esta) throw new RuntimeException("No existe el titulo/autor dado.");
        return pos;
    }

    public void EliminarLibro(String tituloautor){
        int pos = AutoroTitulo(tituloautor);
        for (int i = pos; i < conjunto.length - 2; i++){
            conjunto[i] = conjunto[i + 1];
        }
        poslb--;
    }

    public void CambiarCalif(String autorotitulo,int num){
        int pos = AutoroTitulo(autorotitulo);
        conjunto[pos].setCalificacion(num);
    }

    /* Este es mi intento para ordenar los libros por calificacion.
    public void OrdenarCalif(){
        int pos = 0;
        for (int i = 0; i < poslb; i++){
            for (int x = 0; x < poslb-i-1; i++){
                if(conjunto[x].getCalificacion() < conjunto[x+1].getCalificacion()){
                    int tmp = conjunto[x+1].getCalificacion();
                    conjunto[x+1].getCalificacion() = conjunto[x].getCalificacion();
                    conjunto[x].getCalificacion() = tmp;
                }
            }
            System.out.println(conjunto[]);
        }
    }*/

    public String toString(){
        String res = "Estantería "+ estanteria +": [  ";
        for (int i = 0; i < poslb; i++){
            res = res + "\n" + conjunto[i].toString();
        }
        return res;
    }
}
