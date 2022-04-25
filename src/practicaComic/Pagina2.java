package practicaComic;

import imonsh.Screen;

public class Pagina2 extends Comic implements PaginaPaneles2  {

    public Pagina2(String nombreComic, String numPaginas) {
        super(nombreComic, numPaginas);
    }

    @Override
    public void panel1(Screen s) {
        s.setVisible(true);
        s.showImage("src/practicaComic/img/pagina2/panel1.jpeg");
        s.setBounds(200,100, 1100, 900);

    }

    @Override
    public void panel2(Screen s) {
        s.showImage("src/practicaComic/img/pagina2/panel2.jpeg");
        s.out("\n");

    }

    @Override
    public void panel3(Screen s) {
        s.showImage("src/practicaComic/img/pagina2/panel3.jpeg");
    }

    @Override
    public void panel4(Screen s) {
        s.showImage("src/practicaComic/img/pagina2/panel4.jpeg");
        s.out("\n");
    }

    @Override
    public void panel5(Screen s) {
        s.showImage("src/practicaComic/img/pagina2/panel5.jpeg");
    }

    @Override
    public void panel6(Screen s) {
        s.showImage("src/practicaComic/img/pagina2/panel6.jpeg");
        s.out("\n");
    }
}
