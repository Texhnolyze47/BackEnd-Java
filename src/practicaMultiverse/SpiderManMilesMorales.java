package practicaMultiverse;

//framework que se usa para realizar interfaz grafica
import imonsh.Colors;
import imonsh.Screen;


public class SpiderManMilesMorales extends Spiderman implements  SpiderManMilesMoralesAbilities{

    public SpiderManMilesMorales(String name,String spiderman ,String tierraOrigen, String sexo, String estatura) {
        super(name, spiderman,tierraOrigen, sexo, estatura);
    }

//implementaciones de la interfaz de SpiderManMilesMorales
    @Override
    public void camouflage(Screen s) {
        s.setVisible(true);
        s.out(showMessage()+"\nModo Insivible\n","Arial",28, Colors.red);
        s.showImage("src/practicaMultiverse/img/spidermilesmorales/inv.png");
        s.setBounds(200,100, 1100,900);
        System.out.println("Modo invisible");
    }

    @Override
    public void venomStrike(Screen s) {
        s.repaint();
        s.out("\nVenom Strike\n","Arial",28, Colors.red);
        s.showImage("src/practicaMultiverse/img/spidermilesmorales/venomStrike.jpeg");
        s.setBounds(200,100, 1100,900);
        System.out.println("Veneno Paralizante");
    }

    @Override
    public void wristWebShooters(Screen s) {
        s.out("\nTelearaña\n","Arial",28, Colors.red);
        s.showImage("src/practicaMultiverse/img/spidermilesmorales/webshooters.png");
        s.setBounds(200,100, 1100,900);
        System.out.println("Telearaña");
    }

    @Override
    public void bioElectric(Screen s) {
        s.out("\nBio electric\n","Arial",28, Colors.red);
        s.showImage("src/practicaMultiverse/img/spidermilesmorales/bio-electricity.jpeg");
        s.setBounds(200,100, 1100,900);
        System.out.println("Ataque Bio-eletrico");
    }
}
