package practicaMultiverse;

import imonsh.Screen;

public class TestSpiderman {

    public static void main(String[] args) {
        spidermanNoir();
        spidermanMilesMorales();
        spidermanSPdr();
    }
    //metodos donde se inician y construyen los diferentes objetos que se ponen a prueba en el ejercicio
    public static void spidermanNoir(){
        Screen s = new Screen();
        SpiderManNoir spiderManNoir = new SpiderManNoir("Peter Parker","Spiderman Noir","Tierra 90214",
                "Masculino","1.78");

        //variable con la información del objeto
        //usando los metodos getters
        String msg = "Las características de " + spiderManNoir.getSpiderman() + " son";
        msg += "\nNombre: " + spiderManNoir.getName();
        msg += "\nTierra Origen: " + spiderManNoir.getTierraOrigen();
        msg += "\nSexo: " + spiderManNoir.getSexo();
        msg += "\nEstatura: " + spiderManNoir.getEstatura();
        msg += "\nLas habilidades de "+ spiderManNoir.getName() +" son: ";


        System.out.println(msg);

        spiderManNoir.organicWebbing(s);
        spiderManNoir.superStrength(s);
        spiderManNoir.superVelocity(s);
        spiderManNoir.marksMan(s);
    }

    public static void spidermanMilesMorales(){
        Screen s = new Screen();
        SpiderManMilesMorales spiderManMilesMorales =  new SpiderManMilesMorales("Miles Morales","Spiderman Miles Morales","Tierra 1610",
                "Masculino", "1.73");

        String msg = "Las características de " + spiderManMilesMorales.getName()  + " son";
        msg += "\nNombre: " + spiderManMilesMorales.getName();
        msg += "\nTierra Origen: " + spiderManMilesMorales.getTierraOrigen();
        msg += "\nSexo: " + spiderManMilesMorales.getSexo();
        msg += "\nEstatura: " + spiderManMilesMorales.getEstatura();
        msg += "\nLas habilidades de "+ spiderManMilesMorales.getName() +" son: ";

        System.out.println(msg);
        spiderManMilesMorales.camouflage(s);
        spiderManMilesMorales.bioElectric(s);
        spiderManMilesMorales.venomStrike(s);
        spiderManMilesMorales.wristWebShooters(s);
    }

    public static void spidermanSPdr(){
        Screen s = new Screen();
        SPdr sPdr = new SPdr("Peni Parker", "Spiderman SPdr","Tierra 14512",
                "Femenino","No data");

        String msg = "Las características de " + sPdr.getName()  + " son";
        msg += "\nNombre: " + sPdr.getName();
        msg += "\nTierra Origen: " + sPdr.getTierraOrigen();
        msg += "\nSexo: " + sPdr.getSexo();
        msg += "\nEstatura: " + sPdr.getEstatura();
        msg += "\nLas habilidades de "+ sPdr.getName() +" son: ";

        System.out.println(msg);
        sPdr.drPsychicLink(s);
        sPdr.spiderWebs(s);
        sPdr.spiderSense(s);
        sPdr.technologicalProwess(s);
    }

}
