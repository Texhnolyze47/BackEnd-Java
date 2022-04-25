package practicaMona;

public class TestOctoCat {

    public static void main(String[] args) {
        OctoCat();
        OctoClass();
        OctoObi();
        ChelloCat();
    }
    //metodos donde se inician y construyen los diferentes objetos que se ponen a prueba en el ejercicio
    public static  void OctoCat(){
        OctoCat octoCat = new OctoCat("OctoCat","Simon","Mascota de Github");

        //variable con la información del objeto
        //usando los metodos getters
        String msg = "OctoCat:";
        msg += "\nNombre: "+octoCat.getNombre();
        msg += "\nAutor: "+octoCat.getAutor();
        msg += "\nTematica: "+octoCat.getTematica();

        System.out.println(msg);
        octoCat.doSomething();
    }
    public static  void OctoClass(){
        ClassCat classCat = new ClassCat("OctoCat con clase","Cameron McEfee","OctoCat con clase");

        String msg = "\nOctoCat: ";
        msg += "\nNombre: "+classCat.getNombre();
        msg += "\nAutor: "+classCat.getAutor();
        msg += "\nTematica: "+classCat.getTematica();

        System.out.println(msg);
        classCat.doSomething();
    }

    public static  void OctoObi(){
        OctobiWan octoObi = new OctobiWan("Octobi Wan Catnobi","Cameron McEfee","OctoCat Obi Wan");

        String msg = "\nOctoCat: ";
        msg += "\nNombre: "+octoObi.getNombre();
        msg += "\nAutor: "+octoObi.getAutor();
        msg += "\nTematica: "+octoObi.getTematica();

        System.out.println(msg);
        octoObi.doSomething();
    }

    public static  void ChelloCat(){
        ChelloCat chelloCat = new ChelloCat("Chellocat","Cameron McEfee","OctoCat Chel ");

        String msg = "\nOctoCat: ";
        msg += "\nNombre: "+chelloCat.getNombre();
        msg += "\nAutor: "+chelloCat.getAutor();
        msg += "\nTematica: "+chelloCat.getTematica();

        System.out.println(msg);
        chelloCat.doSomething();

    }


}
