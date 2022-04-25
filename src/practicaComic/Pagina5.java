package practicaComic;

import imonsh.Screen;

public class Pagina5  extends Comic implements PaginaPaneles5{

    public Pagina5(String nombreComic, String numPaginas) {
        super(nombreComic, numPaginas);
    }

    @Override
    public void panel1(Screen s) {
    s.setVisible(true);
    s.showImage("src/practicaComic/img/pagina5/panel1.jpeg");
        s.setBounds(200,100, 1100, 1000);

        s.out("\n");
    }

    @Override
    public void panel2(Screen s) {
        s.showImage("src/practicaComic/img/pagina5/panel2.jpeg");
        s.out("\n");
    }

    @Override
    public void panel3(Screen s) {
        s.showImage("src/practicaComic/img/pagina5/panel3.jpeg");
        s.out("\n");
    }

    @Override
    public void panel4(Screen s) {
        s.showImage("src/practicaComic/img/pagina5/panel4.jpeg");
        s.out("\n");
    }
}
