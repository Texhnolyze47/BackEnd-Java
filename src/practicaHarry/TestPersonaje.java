package practicaHarry;

public class TestPersonaje {
    public static void main(String[] args) {
        HarryPotter();
        DracoMalfoy();
        RonaldWeasley();
        ServerusSnape();
        TomRiddle();
    }

    //metodos donde se inician y construyen los diferentes objetos que se ponen a prueba en el ejercicio
    public static void HarryPotter(){
        //Creación y construcción del objeto
        HarryPotter harryPotter = new HarryPotter("Gryffindor","Male","Harry Potter","Dementor","Stag");

        //variable con la información del objeto
        //usando los metodos getters
        String msg = "La info de Harry Potter es: ";
        msg += "\nCasa: " +harryPotter.getCasa();
        msg += "\nGenero: " +harryPotter.getGenero();
        msg += "\nNombre: " +harryPotter.getNombre();
        msg += "\nBoggart: " +harryPotter.getBoggart();
        msg += "\nPatronouns: " +harryPotter.getPatronuns();

        System.out.println(msg+"\n");
    }

    public static  void DracoMalfoy(){
        DracoMalfoy dracoMalfoy = new DracoMalfoy("Slytherin","Male","Draco Malfoy","Lord Voldemort","Ninguno");
        String msg = "La info de Draco Malfoy es: ";

        msg += "\nCasa: " +dracoMalfoy.getCasa();
        msg += "\nGenero: " +dracoMalfoy.getGenero();
        msg += "\nNombre: " +dracoMalfoy.getNombre();
        msg += "\nBoggart: " +dracoMalfoy.getBoggart();
        msg += "\nPatronouns: " +dracoMalfoy.getPatronuns();

        System.out.println(msg+"\n");
    }


    public static void RonaldWeasley(){
        RonaldWeasley ronaldWeasley = new RonaldWeasley("Gryffindor","Male","Ronald Weasley","Aragog","Jack Russell terrier");
        String msg = "La info de Ronald Weasley es: ";

        msg += "\nCasa: " +ronaldWeasley.getCasa();
        msg += "\nGenero: " +ronaldWeasley.getGenero();
        msg += "\nNombre: " +ronaldWeasley.getNombre();
        msg += "\nBoggart: " +ronaldWeasley.getBoggart();
        msg += "\nPatronouns: " +ronaldWeasley.getPatronuns();

        System.out.println(msg+"\n");
    }

    public static void ServerusSnape(){
        SeverusSnape serverusSnape = new SeverusSnape("Slytherin","Male","Severus Snape",
                "Lord Voldemort",
                "Doe");

        String msg = "La info de Serverus Snape es: ";

        msg += "\nCasa: " +serverusSnape.getCasa();
        msg += "\nGenero: " +serverusSnape.getGenero();
        msg += "\nNombre: " +serverusSnape.getNombre();
        msg += "\nBoggart: " +serverusSnape.getBoggart();
        msg += "\nPatronouns: " +serverusSnape.getPatronuns();

        System.out.println(msg+"\n");
    }

    public static void TomRiddle(){
        TomRiddle tomRiddle = new TomRiddle("Slytherin","Male","Tom Riddle","His own corpse", "Ninguna");

        String msg = "La info de Tom Riddle es: ";

        msg += "\nCasa: " +tomRiddle.getCasa();
        msg += "\nGenero: " +tomRiddle.getGenero();
        msg += "\nNombre: " +tomRiddle.getNombre();
        msg += "\nBoggart: " +tomRiddle.getBoggart();
        msg += "\nPatronouns: " +tomRiddle.getPatronuns();

        System.out.println(msg+"\n");
    }
}
