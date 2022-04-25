package practicaMona;

public class InspectoCat extends  OctoCat{

    //herencia de los atributos de la clase de padre
    public InspectoCat(String name, String autor, String temantica){
        super(name,autor,temantica);
    }
    //clase hija usa el poliformismo para tener su propia implentacion del metodo de la clase
    //padre
    @Override
    public void doSomething() {
        System.out.println("Haciendo review de codigo");
    }
}
