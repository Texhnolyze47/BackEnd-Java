package practicaComic;

import imonsh.Screen;


public class Pagina1 extends Comic implements PaginaPaneles1 {

    public Pagina1(String nombreComic, String numPaginas) {
        super(nombreComic, numPaginas);
    }

    @Override
    public void panel1(Screen s) {
        s.setVisible(true);
        s.showImage("src/practicaComic/img/pagina1/panel1.jpeg");
        s.out("\n");
        s.setBounds(200,100, 1100, 900);
    }

    @Override
    public void panel2(Screen s) {
        s.showImage("src/practicaComic/img/pagina1/panel2.jpeg");
        s.out("\n");
        s.setBounds(200,100, 1100, 900);

    }

}
