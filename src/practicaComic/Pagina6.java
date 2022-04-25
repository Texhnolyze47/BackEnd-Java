package practicaComic;

import imonsh.Screen;

public class Pagina6 extends Comic implements PaginaPaneles6 {


    public Pagina6(String nombreComic, String numPaginas) {
        super(nombreComic, numPaginas);
    }

    @Override
    public void panel1(Screen s) {
        s.setVisible(true);
        s.showImage("src/practicaComic/img/pagina6/panel1.jpeg");
        s.out("\n");
        s.setBounds(200,100, 1100, 1000);


    }

    @Override
    public void panel2(Screen s) {
        s.showImage("src/practicaComic/img/pagina6/panel2.jpeg");

    }

    @Override
    public void panel3(Screen s) {
        s.showImage("src/practicaComic/img/pagina6/panel3.jpeg");
        s.out("\n");

    }

    @Override
    public void panel4(Screen s) {
        s.showImage("src/practicaComic/img/pagina6/panel4.jpeg");

    }

    @Override
    public void panel5(Screen s) {
        s.showImage("src/practicaComic/img/pagina6/panel5.jpeg");

    }


}
