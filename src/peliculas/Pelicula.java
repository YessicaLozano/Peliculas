package peliculas;

public class Pelicula {
   
    private String nombre;
    private String director;
    private int ano;
    int cant;
    private String resena;
    private Pelicula enlace;
    
    public Pelicula(){ 
        this.nombre = "";
        this.director = "";
        this.ano = 0;
        this.cant = 0;
        this.resena = "";
        this.enlace = null;
    }
 
    public Pelicula(String nombre, String director, int ano, int cant, String resena){ 
        this.nombre = nombre;
        this.director = director;
        this.ano = ano;
        this.cant = cant;
        this.resena = resena;
        this.enlace = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getResena() {
        return resena;
    }

    public void setResena(String resena) {
        this.resena = resena;
    }

    public Pelicula getEnlace() {
        return enlace;
    }

    public void setEnlace(Pelicula enlace) {
        this.enlace = enlace;
    }
    @Override
    public String toString(){
        return ("Pelicula: "+nombre+" Directores: "+director+" Año: "+ano+" Sinopsis: "+resena);

    }
 
}