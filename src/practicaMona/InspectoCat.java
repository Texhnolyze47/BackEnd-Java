package practicaMona;

public class InspectoCat extends  OctoCat{

    public InspectoCat(String name, String autor, String temantica){
        super(name,autor,temantica);
    }

    @Override
    public void doSomething() {
        System.out.println("Haciendo review de codigo");
    }
}
