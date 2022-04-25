package practicaComic;

import imonsh.Screen;

public class ComicTest {

    public static void main(String[] args) throws InterruptedException {
                    pagina1();
                    pagina2();
                    pagina3();
                    pagina4();
                    pagina5();
                    pagina6();
    }

    public static void pagina1() throws InterruptedException {
        Screen s = new Screen();
        Pagina1 pagina1 = new Pagina1("Spongebob freeStyles funnies","9");
        Runnable show = new Runnable() {
            @Override
            public void run() {
                try {
                    pagina1.panel1(s);
                    Thread.sleep(3000);

                    pagina1.panel2(s);
                    Thread.sleep(3000);

                    //4000
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread showpanel = new Thread(show);
        showpanel.start();
        showpanel.join();
    }

    public static void pagina2() throws InterruptedException {
        Screen s = new Screen();
        Pagina2 pagina2 = new Pagina2("Spongebob freeStyles funnies","9");
        Runnable show = new Runnable() {
            @Override
            public void run() {
                try {
                    pagina2.panel1(s);
                    Thread.sleep(5000);

                    pagina2.panel2(s);
                    Thread.sleep(5000);

                    pagina2.panel3(s);
                    Thread.sleep(5000);

                    pagina2.panel4(s);
                    Thread.sleep(5000);

                    pagina2.panel5(s);
                    Thread.sleep(2000);

                    pagina2.panel6(s);
                    Thread.sleep(2000);
                    //12000
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread showpanel = new Thread(show);
        showpanel.start();
        showpanel.join();

    }

    public static void pagina3() throws InterruptedException {
        Screen s = new Screen();
        Pagina3 pagina3 = new Pagina3("Spongebob freeStyles funnies","9");
        Runnable show = new Runnable() {
            @Override
            public void run() {
                try {
                    pagina3.panel1(s);
                    Thread.sleep(3000);

                    pagina3.panel2(s);
                    Thread.sleep(3000);

                    pagina3.panel3(s);
                    Thread.sleep(3000);

                    pagina3.panel4(s);
                    Thread.sleep(3000);

                    //8000

                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread showpanel = new Thread(show);
        showpanel.start();
        showpanel.join();

    }

    public static void pagina4() throws InterruptedException {
        Screen s = new Screen();
        Pagina4 pagina4 = new Pagina4("Spongebob freeStyles funnies","9");
        Runnable show = new Runnable() {
            @Override
            public void run() {
                try {
                pagina4.panel1(s);
                Thread.sleep(3000);

                pagina4.panel2(s);
                Thread.sleep(3000);

                //4000

                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        } ;

        Thread showpanel = new Thread(show);
        showpanel.start();
        showpanel.join();

    }

    public static void pagina5() throws InterruptedException {
        Screen s = new Screen();
        Pagina5 pagina5 = new Pagina5("Spongebob freeStyles funnies","9");
        Runnable show = new Runnable() {
            @Override
            public void run() {
                try {
                    pagina5.panel1(s);
                    Thread.sleep(5000);

                    pagina5.panel2(s);
                    Thread.sleep(5000);

                    pagina5.panel3(s);
                    Thread.sleep(5000);

                    pagina5.panel4(s);
                    Thread.sleep(5000);

                    //8000

                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        } ;

        Thread showpanel = new Thread(show);
        showpanel.start();
        showpanel.join();

    }

    public static void pagina6() throws InterruptedException {
        Screen s = new Screen();
        Pagina6 pagina6 = new Pagina6("Spongebob freeStyles funnies","9");
        Runnable show = new Runnable() {
            @Override
            public void run() {
                try {
                    pagina6.panel1(s);
                    Thread.sleep(8000);

                    pagina6.panel2(s);
                    Thread.sleep(8000);

                    pagina6.panel3(s);
                    Thread.sleep(8000);

                    pagina6.panel4(s);
                    Thread.sleep(8000);

                    pagina6.panel5(s);
                    Thread.sleep(8000);

                    //10000

                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        } ;

        Thread showpanel = new Thread(show);
        showpanel.start();
        showpanel.join();

    }


}
