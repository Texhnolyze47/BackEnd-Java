package practicaMona;

public class OctobiWan extends OctoCat {

    public OctobiWan(){

    }
    public OctobiWan(String nombre,String autor, String tematica){
        super(nombre,autor,tematica);
    }

    @Override
    public void doSomething() {
        System.out.println("Octobi usa la fuerza");
    }
}
