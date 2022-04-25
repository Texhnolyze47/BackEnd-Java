package practicaComic;

import imonsh.Screen;

public class Pagina4 extends  Comic implements PaginaPaneles4{
    public Pagina4(String nombreComic, String numPaginas) {
        super(nombreComic, numPaginas);
    }

    @Override
    public void panel1(Screen s) {
    s.setVisible(true);
    s.showImage("src/practicaComic/img/pagina4/panel1.jpeg");
        s.setBounds(200,100, 1100, 1000);

        s.out("\n");
    }

    @Override
    public void panel2(Screen s) {
    s.showImage("src/practicaComic/img/pagina4/panel2.jpeg");
    s.out("\n");
    }
}
