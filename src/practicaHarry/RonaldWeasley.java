package practicaHarry;

//Atributos
public class RonaldWeasley {
    private String casa;
    private String genero;
    private String nombre;
    private String boggart;
    private String patronuns;


    //Constructor
    public RonaldWeasley(String casa, String genero, String nombre, String boggart, String patronuns) {
        this.casa = casa;
        this.genero = genero;
        this.nombre = nombre;
        this.boggart = boggart;
        this.patronuns = patronuns;
    }
    //getters
    public String getCasa() {  return casa;  }

    public String getGenero() {  return genero;  }

    public String getNombre() {  return nombre;  }

    public String getBoggart() {  return boggart;  }

    public String getPatronuns() {  return patronuns;  }
}
