package practicaMona;

public class ChelloCat extends OctoCat {

    public  ChelloCat(String name, String autor, String tematica){
        super(name,autor,tematica);
    }

    @Override
    public void doSomething() {
        System.out.println("Creando portales");
    }
}
