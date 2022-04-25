package practicaMultiverse;

//framework que se usa para realizar interfaz grafica
import imonsh.Colors;
import imonsh.Screen;

public class SPdr extends Spiderman implements SPdrAbilities{

    public SPdr(String name, String spiderman ,String tierraOrigen, String sexo, String estatura) {
        super(name,spiderman,tierraOrigen, sexo, estatura);
    }

    @Override
    public void drPsychicLink(Screen s) {
        s.setVisible(true);
        s.out(showMessage()+"\nInvocar SP//dr\n","Arial",28, Colors.red);
        s.showImage("src/practicaMultiverse/img/SPdr/Invocar.png");
        s.setBounds(200,100, 1100,900);
        System.out.println("Invocar SP//dr");
    }

    @Override
    public void spiderSense(Screen s) {
        s.repaint();
        s.out("\nSentido Aracnido\n","Arial",28, Colors.red);
        s.showImage("src/practicaMultiverse/img/SPdr/spider-sense.jpeg");
        s.setBounds(200,100, 1100,900);
        System.out.println("Sentido araña");
    }

    @Override
    public void spiderWebs(Screen s) {
        s.repaint();
        s.out("\nLanza telearaña\n","Arial",28, Colors.red);
        s.showImage("src/practicaMultiverse/img/SPdr/webshooters.png");
        System.out.println("Lanza de telearaña");
    }

    @Override
    public void technologicalProwess(Screen s) {
        s.repaint();
        s.out("\nCreacion de artefactos\n", "Arial",28,Colors.red);
        s.showImage("src/practicaMultiverse/img/SPdr/technologicalProwess.png");
        System.out.println("Creacion artefactos");
    }
}
