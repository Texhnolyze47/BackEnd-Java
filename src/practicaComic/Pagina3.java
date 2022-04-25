package practicaComic;

import imonsh.Screen;

public class Pagina3 extends Comic implements PaginaPaneles3 {

    public Pagina3(String nombreComic, String numPaginas) {
        super(nombreComic, numPaginas);
    }

    @Override
    public void panel1(Screen s){
        s.setVisible(true);
        s.showImage("src/practicaComic/img/pagina3/panel1.jpeg");
        s.out("\n");
        s.setBounds(200,100, 1100, 1000);

    }
    @Override
    public void panel2(Screen s){
        s.showImage("src/practicaComic/img/pagina3/panel2.jpeg");
        s.out("\n");
    }

    @Override
   public void panel3(Screen s){
       s.showImage("src/practicaComic/img/pagina3/panel3.jpeg");
   }

    @Override
    public void panel4(Screen s){
        s.showImage("src/practicaComic/img/pagina3/panel4.jpeg");
        s.out("\n");
    }
}
