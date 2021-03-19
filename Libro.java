package RatingLibros;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;
    private int calificacion;

    public Libro(String titul, String autr, int pagna, int califcn) {
        super();
        this.titulo = titul;
        this.autor = autr;
        this.paginas = pagna;
        this.calificacion = califcn;
    }

    public String getTitulo() { return titulo; }

    public String getAutor() { return autor; }

    public int getPaginas() { return paginas; }

    public int getCalificacion() { return calificacion; }

    public void setCalificacion(int calificacion) { this.calificacion = calificacion; }

    public String toString(){
        return "El libro titulado "+ titulo +" lo escribió "+ autor +" tiene "+ paginas +" paginas y le doy un "+ calificacion +" de valoracion";
    }

}



