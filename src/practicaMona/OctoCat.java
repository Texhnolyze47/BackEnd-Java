package practicaMona;

public class OctoCat {

    private String nombre;
    private String autor;
    private String tematica;

    public OctoCat() {
    }

    public OctoCat(String nombre, String autor, String tematica) {
        this.nombre = nombre;
        this.autor = autor;
        this.tematica = tematica;
    }

    public String getNombre() {  return nombre;  }

    public String getAutor() {  return autor;  }

    public String getTematica() {  return tematica;  }

    public void doSomething(){
        System.out.println("OctoCat te saluda");
    }
}
