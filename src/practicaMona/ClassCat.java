package practicaMona;

public class ClassCat extends OctoCat {

    public ClassCat() {
    }

    public ClassCat(String nombre, String autor, String tematica) {
        super(nombre, autor, tematica);
    }

    @Override
    public void doSomething() {
        System.out.println("OctoCat hace un brindis");
    }
}
