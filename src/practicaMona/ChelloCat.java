package practicaMona;

public class ChelloCat extends OctoCat {
    //herencia de los atributos de la clase de padre
    public  ChelloCat(String name, String autor, String tematica){
        super(name,autor,tematica);
    }

    //clase hija usa el poliformismo para tener su propia implentacion del metodo de la clase
    //padre
    @Override
    public void doSomething() {
        System.out.println("Creando portales");
    }
}
