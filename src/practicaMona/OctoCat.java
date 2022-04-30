package practicaMona;

//clase padre
public class OctoCat {
    //atributos
    private String nombre;
    private String autor;
    private String tematica;


    //constructor
    public OctoCat(String nombre, String autor, String tematica) {
        this.nombre = nombre;
        this.autor = autor;
        this.tematica = tematica;
    }

    //getters
    public String getNombre() {  return nombre;  }

    public String getAutor() {  return autor;  }

    public String getTematica() {  return tematica;  }
    //metodos de la clase padre
    public void doSomething(){
        System.out.println("OctoCat te saluda");
    }
}
