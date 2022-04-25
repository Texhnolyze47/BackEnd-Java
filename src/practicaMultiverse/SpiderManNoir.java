package practicaMultiverse;

//framework que se usa para realizar interfaz grafica
import imonsh.Screen;
import imonsh.Colors;

public class SpiderManNoir extends Spiderman implements SpiderManNoirAbilities{

    public SpiderManNoir(String name, String spiderman, String tierraOrigen, String sexo, String estatura) {
        super(name,spiderman ,tierraOrigen, sexo, estatura);
    }

    @Override
    public void organicWebbing(Screen s) {
        s.setVisible(true);
        s.out(showMessage()+"\nLanza telearaña\n","Arial",28, Colors.red);
        s.showImage("src/practicaMultiverse/img/spidernoir/organic-web.jpeg");
        s.setBounds(200,100, 1100,900);
        System.out.println("Lanza telearaña");
    }

    @Override
    public void superStrength(Screen s) {
        s.repaint();
        s.out("\nSuper fuerza\n","Arial",20,Colors.red );
        s.showImage("src/practicaMultiverse/img/spidernoir/super-strenght.jpeg");
        s.setBounds(200,100, 1100,900);
        System.out.println("Lanza coche");
    }

    @Override
    public void superVelocity(Screen s) {
        s.repaint();
        s.out("\nSuper velocidad\n","Arial",20,Colors.red );
        s.showImage("src/practicaMultiverse/img/spidernoir/super-velocity.jpeg");
        s.setBounds(200,100, 1100,900);
        System.out.println("Corre rápido");
    }

    @Override
    public void marksMan(Screen s) {
        s.repaint();
        s.out("\nTirador profesional\n","Arial",20,Colors.red );
        s.showImage("src/practicaMultiverse/img/spidernoir/marksman.png");
        s.setBounds(200,100, 1100,900);
        System.out.println("Usa pistola");
    }
}
