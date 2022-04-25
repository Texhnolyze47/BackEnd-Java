package practicaMona;

public class OctobiWan extends OctoCat {

    public OctobiWan(){

    }
    //herencia de los atributos de la clase de padre
    public OctobiWan(String nombre,String autor, String tematica){
        super(nombre,autor,tematica);
    }
    //clase hija usa el poliformismo para tener su propia implentacion del metodo de la clase
    //padre
    @Override
    public void doSomething() {
        System.out.println("Octobi usa la fuerza");
    }
}
