package practicaMona;

public class ClassCat extends OctoCat {


    //herencia de los atributos de la clase de padre
    public ClassCat(String nombre, String autor, String tematica) {
        super(nombre, autor, tematica);
    }
    //clase hija usa el poliformismo para tener su propia implentacion del metodo de la clase
    //padre
    @Override
    public void doSomething() {
        System.out.println("OctoCat hace un brindis");
    }
}
