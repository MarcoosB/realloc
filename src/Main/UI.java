package Main;

import back.ReproducirMusica;
import imagenes.Fondos;
import imagenes.Personajes;
import imagenes.Varios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;


public class UI {

    GameManager gm;
    JFrame window;
    public JTextArea messageText;
    public JPanel bgPanel[] = new JPanel[1000];
    public JLabel bgLabel[] = new JLabel[1000];
    public ReproducirMusica reproductorUI;
    public Timer timer;

    public UI(GameManager gm) {
        this.gm = gm;
        createMainField();
        reproductorUI= new ReproducirMusica();




    }

    public UI() {

    }


    public void createMainField() {
        /// Config. de la ventana
        window = new JFrame("Realoc: TimeLine");
        window.setSize(1250, 750);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(null);
        window.setLayout(null);
        window.setResizable(false);

    }
    

    public void crearFlechaSig(int IndiceFondo, String rutaFlecha, String comandoButtons) { /// Recibe un string con la ruta a la imagen de la flecha{

        ImageIcon flechita = new ImageIcon(Varios.class.getResource(rutaFlecha));
        JButton FlechaSig = new JButton();
        FlechaSig.setBounds(1115, 550, 100, 100);
        FlechaSig.setBackground(null);
        FlechaSig.setFocusPainted(false);
        FlechaSig.setContentAreaFilled(false);
        FlechaSig.setIcon(flechita);
        FlechaSig.addActionListener(gm.ControladorA);
        FlechaSig.setActionCommand(comandoButtons);
        FlechaSig.setBorderPainted(false);
        bgPanel[IndiceFondo].add(FlechaSig);


    }
    public void crearFlechaAnte(int IndiceFondo, String rutaFlechaIzq, String comandoButtons) { /// Recibe un string con la ruta a la imagen de la flecha{

        if(comandoButtons!=null) {
            ImageIcon flechita = new ImageIcon(Varios.class.getResource(rutaFlechaIzq));
            JButton FlechaAnte = new JButton();
            FlechaAnte.setBounds(30, 550, 100, 100);
            FlechaAnte.setBackground(null);
            FlechaAnte.setFocusPainted(false);
            FlechaAnte.setContentAreaFilled(false);
            FlechaAnte.setIcon(flechita);
            FlechaAnte.addActionListener(gm.ControladorB);
            FlechaAnte.setActionCommand(comandoButtons);
            FlechaAnte.setBorderPainted(false);
            bgPanel[IndiceFondo].add(FlechaAnte);
        }
    }

    public void crearTexto(String textoParrafo, int indice)
    {
        messageText = new JTextArea(textoParrafo);
        //messageText.setBounds(120,500,1000,200);
        //messageText.setBackground(new Color(255,255,255,100));
        messageText.setForeground(Color.black);
        messageText.setEditable(false);

        messageText.setLineWrap(true);
        messageText.setWrapStyleWord(true);
        messageText.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
        messageText.setVisible(true);
        JScrollPane jp = new JScrollPane(messageText);
        jp.setBounds(120,500,1000,200);
        jp.setBackground(new Color(255,255,255,100));
        jp.setOpaque(false);
        jp.getViewport().setOpaque(false);
        jp.setBorder(BorderFactory.createEmptyBorder());
        bgPanel[indice].add(jp);


        // Inicializar el Timer para la animación del texto por caracteres
        timer = new Timer(18, null);  // Intervalo de 18 milisegundos para suavidad
        final StringBuilder currentText = new StringBuilder();
        final int[] currentIndex = {0};

        timer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentIndex[0] < textoParrafo.length()) {
                    char currentChar = textoParrafo.charAt(currentIndex[0]++);

                    // Agregar el carácter actual al texto
                    currentText.append(currentChar);
                    messageText.setText(currentText.toString());
                } else {
                    // Detener el timer cuando se haya mostrado todo el texto
                    timer.stop();
                }
            }
        });

        // Iniciar la animación
        timer.start();

        // Agregar un MouseListener al JTextArea para detener el timer al hacer clic
        messageText.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (timer.isRunning()) {
                    // Detener el Timer
                    timer.stop();

                    // Mostrar el texto completo instantáneamente
                    messageText.setText(textoParrafo);
                }
            }
        });
    }
    // Método para detener el Timer cuando cambies de panel
    public void detenerAnimacion() {
        if (timer != null && timer.isRunning()) {
            timer.stop();  // Detener el Timer
        }
    }

    public void createBackground(int indice, String rutaDeImagenFondo) /// Esta funcion recibe el numero de indice del array y el path de la imagen
    {
        // Espacio del fondo
        bgPanel[indice] = new JPanel();
        bgPanel[indice].setBounds(0,0,1250,750);
        bgPanel[indice].setBackground(null);
        bgPanel[indice].setLayout(null);


        window.add(bgPanel[indice]);

        // config del fondo.

        bgLabel[indice] = new JLabel();
        bgLabel[indice].setBounds(0,0,1250,750);
        ImageIcon bgIcon = new ImageIcon(Fondos.class.getResource(rutaDeImagenFondo));
        bgLabel[indice].setIcon(bgIcon);


    }


    public void crearObjeto(int indice, String rutaImagenPersonaje) /// Esta funcion pide por parametro X,Y,Alto y Ancho del ImageIcon y la ruta de la imagen. Ademas del indice del fondo
    {
        JLabel objeto = new JLabel();
        objeto.setBounds(500,10,500,500);

        ImageIcon ManuelIcon = new ImageIcon(Personajes.class.getResource(rutaImagenPersonaje));
        objeto.setIcon(ManuelIcon);

        /// esto hace que el objeto no quede abajo del fondo jeje
        bgPanel[indice].add(objeto); // el numero es el indice del fondo

    }

    public void crearObjetoDosPersonajes(int indice, String rutaImagenPersonajeIzquierda, String rutaPersonajeDerecha){

        JLabel objeto = new JLabel();
        JLabel objeto2= new JLabel();
        objeto.setBounds(400,10,500,500);
        objeto2.setBounds(700, 10, 500, 500);

        ImageIcon ManuelIcon = new ImageIcon(Personajes.class.getResource(rutaImagenPersonajeIzquierda));
        ImageIcon PazIcon= new ImageIcon(Personajes.class.getResource(rutaPersonajeDerecha));
        objeto.setIcon(ManuelIcon);
        objeto2.setIcon(PazIcon);

        /// esto hace que el objeto no quede abajo del fondo jeje

        bgPanel[indice].add(objeto); // el numero es el indice del fondo
        bgPanel[indice].add(objeto2);

    }

    public void crearDosConquistadores(int indice, String rutaImagenPersonajeIzquierda, String rutaPersonajeDerecha){

        JLabel objeto = new JLabel();
        JLabel objeto2= new JLabel();
        objeto.setBounds(200,25,500,500);
        objeto2.setBounds(700, 25, 500, 500);

        ImageIcon ManuelIcon = new ImageIcon(Personajes.class.getResource(rutaImagenPersonajeIzquierda));
        ImageIcon PazIcon= new ImageIcon(Personajes.class.getResource(rutaPersonajeDerecha));
        objeto.setIcon(ManuelIcon);
        objeto2.setIcon(PazIcon);

        /// esto hace que el objeto no quede abajo del fondo jeje

        bgPanel[indice].add(objeto); // el numero es el indice del fondo
        bgPanel[indice].add(objeto2);

    }

    public void crearGabrielArchurado(int indice, String rutaImagen) /// Esta funcion pide por parametro X,Y,Alto y Ancho del ImageIcon y la ruta de la imagen. Ademas del indice del fondo
    {
        JLabel objeto = new JLabel();
        objeto.setBounds(650,180,500,500);

        ImageIcon ManuelIcon = new ImageIcon(Personajes.class.getResource(rutaImagen));
        objeto.setIcon(ManuelIcon);

        /// esto hace que el objeto no quede abajo del fondo jeje
        bgPanel[indice].add(objeto); // el numero es el indice del fondo

    }

    public void crearGabrielPoderos(int indice, String rutaImagen) /// Esta funcion pide por parametro X,Y,Alto y Ancho del ImageIcon y la ruta de la imagen. Ademas del indice del fondo
    {
        JLabel objeto = new JLabel();
        objeto.setBounds(450,-700,2000,2000);

        ImageIcon ManuelIcon = new ImageIcon(Personajes.class.getResource(rutaImagen));
        objeto.setIcon(ManuelIcon);

        /// esto hace que el objeto no quede abajo del fondo jeje
        bgPanel[indice].add(objeto); // el numero es el indice del fondo

    }

    public void crearConquistador(int indice, String rutaImagenPersonaje) /// Esta funcion pide por parametro X,Y,Alto y Ancho del ImageIcon y la ruta de la imagen. Ademas del indice del fondo
    {
        JLabel objeto = new JLabel();
        objeto.setBounds(398,25,500,500);

        ImageIcon ManuelIcon = new ImageIcon(Personajes.class.getResource(rutaImagenPersonaje));
        objeto.setIcon(ManuelIcon);

        /// esto hace que el objeto no quede abajo del fondo jeje
        bgPanel[indice].add(objeto); // el numero es el indice del fondo

    }
    public void crearJinetes(int indice, String rutaImagenPersonaje) /// Esta funcion pide por parametro X,Y,Alto y Ancho del ImageIcon y la ruta de la imagen. Ademas del indice del fondo
    {
        JLabel objeto = new JLabel();
        objeto.setBounds(0,-59,2000,800);

        ImageIcon ManuelIcon = new ImageIcon(Personajes.class.getResource(rutaImagenPersonaje));
        objeto.setIcon(ManuelIcon);

        /// esto hace que el objeto no quede abajo del fondo jeje
        bgPanel[indice].add(objeto); // el numero es el indice del fondo

    }
    public void ponerLaMesaza(int indice, String rutaImagenPersonaje) /// Esta funcion pide por parametro X,Y,Alto y Ancho del ImageIcon y la ruta de la imagen. Ademas del indice del fondo
    {
        JLabel objeto = new JLabel();
        objeto.setBounds(0,-58,2000,800);

        ImageIcon ManuelIcon = new ImageIcon(Personajes.class.getResource(rutaImagenPersonaje));
        objeto.setIcon(ManuelIcon);

        /// esto hace que el objeto no quede abajo del fondo jeje
        bgPanel[indice].add(objeto); // el numero es el indice del fondo

    }

    public void crearEscenarioUnConquistador(int indice, String textoParrafo, String rutaFondo, String rutaPersonaje, String comandoButtons1, String comandoButtons2){

        if(bgPanel[indice -1] == null)
        {
            createBackground(indice, rutaFondo);
            crearConquistador(indice, rutaPersonaje);
            crearTexto(textoParrafo,indice);
            crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons1);
            crearFlechaAnte(indice, Varios.FLECHA_I,comandoButtons2);
            bgPanel[indice].add(gm.ui.bgLabel[indice]);
        }
        else
        {
            bgPanel[indice-1].setVisible(false);

            createBackground(indice, rutaFondo);
            crearConquistador(indice, rutaPersonaje);
            crearTexto(textoParrafo,indice);
            crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons1);
            crearFlechaAnte(indice, Varios.FLECHA_I,comandoButtons2);
            bgPanel[indice].add(gm.ui.bgLabel[indice]);
        }

    }

    public void crearEscenarioJinetes(int indice, String textoParrafo, String rutaFondo, String rutaPersonaje, String comandoButtons1, String comandoButtons2){

        if(bgPanel[indice -1] == null)
        {
            createBackground(indice, rutaFondo);
            crearJinetes(indice, rutaPersonaje);
            crearTexto(textoParrafo,indice);
            crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons1);
            crearFlechaAnte(indice, Varios.FLECHA_I,comandoButtons2);
            bgPanel[indice].add(gm.ui.bgLabel[indice]);
        }
        else
        {
            bgPanel[indice-1].setVisible(false);

            createBackground(indice, rutaFondo);
            crearJinetes(indice, rutaPersonaje);
            crearTexto(textoParrafo,indice);
            crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons1);
            crearFlechaAnte(indice, Varios.FLECHA_I,comandoButtons2);
            bgPanel[indice].add(gm.ui.bgLabel[indice]);
        }

    }
    public void crearEscenarioMesaza(int indice, String textoParrafo, String rutaFondo, String rutaPersonaje, String comandoButtons1, String comandoButtons2){

        if(bgPanel[indice -1] == null)
        {
            createBackground(indice, rutaFondo);
            ponerLaMesaza(indice, rutaPersonaje);
            crearTexto(textoParrafo,indice);
            crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons1);
            crearFlechaAnte(indice, Varios.FLECHA_I,comandoButtons2);
            bgPanel[indice].add(gm.ui.bgLabel[indice]);
        }
        else
        {
            bgPanel[indice-1].setVisible(false);

            createBackground(indice, rutaFondo);
            ponerLaMesaza(indice, rutaPersonaje);
            crearTexto(textoParrafo,indice);
            crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons1);
            crearFlechaAnte(indice, Varios.FLECHA_I,comandoButtons2);
            bgPanel[indice].add(gm.ui.bgLabel[indice]);
        }

    }



    public void crearEscenarioUnPersonaje(int indice, String textoParrafo, String rutaFondo, String rutaPersonaje, String comandoButtons1, String comandoButtons2){



        if(bgPanel[indice -1] == null)
        {
            createBackground(indice, rutaFondo);
            crearObjeto(indice, rutaPersonaje);
            crearTexto(textoParrafo,indice);
            crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons1);
            crearFlechaAnte(indice, Varios.FLECHA_I,comandoButtons2);
            bgPanel[indice].add(gm.ui.bgLabel[indice]);
        }
        else
        {
            bgPanel[indice-1].setVisible(false);

            createBackground(indice, rutaFondo);
            crearObjeto(indice, rutaPersonaje);
            crearTexto(textoParrafo,indice);
            crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons1);
            crearFlechaAnte(indice, Varios.FLECHA_I,comandoButtons2);
            bgPanel[indice].add(gm.ui.bgLabel[indice]);
        }

    }

    public void crearEscenarioSolo(int indice, String textoParrafo, String rutaFondo, String comandoButtons1, String comandoButtons2){

        if(bgPanel[indice -1] == null)
        {

            createBackground(indice, rutaFondo);
            crearTexto(textoParrafo,indice);
            crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons1);
            crearFlechaAnte(indice, Varios.FLECHA_I,comandoButtons2);
            bgPanel[indice].add(gm.ui.bgLabel[indice]);
        }
        else
        {
            bgPanel[indice-1].setVisible(false);

            createBackground(indice, rutaFondo);
            crearTexto(textoParrafo,indice);
            crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons1);
            crearFlechaAnte(indice, Varios.FLECHA_I,comandoButtons2);
            bgPanel[indice].add(gm.ui.bgLabel[indice]);
        }

    }




    public void crearEscenarioGabrielAchurado(int indice, String textoParrafo, String rutaFondo, String rutaPersonaje, String comandoButtons, String comandoButtons2)
    {

        if(indice != 1)
        {
            if(bgPanel[indice -1] == null)
            {
                createBackground(indice, rutaFondo);
                crearGabrielArchurado(indice, rutaPersonaje);
                crearTexto(textoParrafo,indice);
                crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons);
                crearFlechaAnte(indice, Varios.FLECHA_I,comandoButtons2);
                bgPanel[indice].add(gm.ui.bgLabel[indice]);
            }
            else
            {
                bgPanel[indice-1].setVisible(false);

                createBackground(indice, rutaFondo);
                crearGabrielArchurado(indice, rutaPersonaje);
                crearTexto(textoParrafo,indice);
                crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons);
                crearFlechaAnte(indice, Varios.FLECHA_I,comandoButtons2);
                bgPanel[indice].add(gm.ui.bgLabel[indice]);
            }
        }
        else
        {
            createBackground(indice, rutaFondo);
            crearGabrielArchurado(indice, rutaPersonaje);
            crearTexto(textoParrafo, indice);
            crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons);
            bgPanel[indice].add(gm.ui.bgLabel[indice]);
        }

    }

    public void crearEscenarioGabrielPoderos(int indice, String textoParrafo, String rutaFondo, String rutaPersonaje, String comandoButtons,String comandoButtons2){


        if(bgPanel[indice -1] == null){

            createBackground(indice, rutaFondo);

            crearTexto(textoParrafo,indice);
            crearGabrielPoderos(indice, rutaPersonaje);
            crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons);
            crearFlechaAnte(indice,Varios.FLECHA_I,comandoButtons2);
            bgPanel[indice].add(gm.ui.bgLabel[indice]);

        }
        else {
            gm.ui.bgPanel[indice - 1].setVisible(false);

            createBackground(indice, rutaFondo);

            crearTexto(textoParrafo, indice);
            crearGabrielPoderos(indice, rutaPersonaje);
            crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons);
            crearFlechaAnte(indice, Varios.FLECHA_I, comandoButtons2);
            bgPanel[indice].add(gm.ui.bgLabel[indice]);
        }

    }

    public void crearEscenarioDosPersonajes(int indice, String textoParrafo, String rutaFondo, String rutaPersonajeIzquierda, String rutaPersonajeDerecha, String comandoButtons,String comandoButtons2){


        if(bgPanel[indice -1] == null)
        {
            createBackground(indice, rutaFondo);
            crearObjetoDosPersonajes(indice,rutaPersonajeIzquierda,rutaPersonajeDerecha);
            crearTexto(textoParrafo,indice);
            crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons);
            crearFlechaAnte(indice, Varios.FLECHA_I,comandoButtons2);
            bgPanel[indice].add(gm.ui.bgLabel[indice]);
        }
        else
        {
            bgPanel[indice-1].setVisible(false);

            createBackground(indice, rutaFondo);
            crearObjetoDosPersonajes(indice,rutaPersonajeIzquierda,rutaPersonajeDerecha);
            crearTexto(textoParrafo,indice);
            crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons);
            crearFlechaAnte(indice, Varios.FLECHA_I,comandoButtons2);
            bgPanel[indice].add(gm.ui.bgLabel[indice]);
        }

    }

    public void crearEscenarioDosConquistadores(int indice, String textoParrafo, String rutaFondo, String rutaPersonajeIzquierda, String rutaPersonajeDerecha, String comandoButtons,String comandoButtons2)
    {
        if(bgPanel[indice -1] == null)
        {
            createBackground(indice, rutaFondo);
            crearDosConquistadores(indice,rutaPersonajeIzquierda,rutaPersonajeDerecha);
            crearTexto(textoParrafo,indice);
            crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons);
            crearFlechaAnte(indice, Varios.FLECHA_I,comandoButtons2);
            bgPanel[indice].add(gm.ui.bgLabel[indice]);
        }
        else
        {
            bgPanel[indice-1].setVisible(false);

            createBackground(indice, rutaFondo);
            crearDosConquistadores(indice,rutaPersonajeIzquierda,rutaPersonajeDerecha);
            crearTexto(textoParrafo,indice);
            crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons);
            crearFlechaAnte(indice, Varios.FLECHA_I,comandoButtons2);
            bgPanel[indice].add(gm.ui.bgLabel[indice]);
        }

    }


    public void JbotonIzq (int IndiceFondo, String comandoButtons)
    {

        JButton botonIzq = new JButton();
        botonIzq.setBounds(1122, 600, 100, 40);
        botonIzq.setBackground(null);
        botonIzq.setFocusPainted(false);
        botonIzq.setContentAreaFilled(true);
        botonIzq.setText("Thomas");
        botonIzq.addActionListener(gm.ControladorA); /// controlador nuevo para estos buttons
        botonIzq.setActionCommand(comandoButtons);
        botonIzq.setBorderPainted(false);
        bgPanel[IndiceFondo].add(botonIzq);
    }

    public void JbotonMid(int IndiceFondo, String comandoButtons)
    {

        JButton botonMid = new JButton();
        botonMid.setBounds(1122, 550, 100, 40);
        botonMid.setBackground(null);
        botonMid.setFocusPainted(false);
        botonMid.setContentAreaFilled(true);
        botonMid.setText("Steven");
        botonMid.addActionListener(gm.ControladorA); /// controlador nuevo para estos buttons
        botonMid.setActionCommand(comandoButtons);
        botonMid.setBorderPainted(false);
        bgPanel[IndiceFondo].add(botonMid);
    }

    public void JbotonDer (int IndiceFondo,String comandoButtons)
    {

        JButton botonDer = new JButton();
        botonDer.setBounds(1122, 500, 100, 40);
        botonDer.setBackground(null);
        botonDer.setFocusPainted(false);
        botonDer.setContentAreaFilled(true);
        botonDer.setText("Matthew");
        botonDer.addActionListener(gm.ControladorA); /// controlador nuevo para estos buttons
        botonDer.setActionCommand(comandoButtons);
        botonDer.setBorderPainted(false);
        bgPanel[IndiceFondo].add(botonDer);
    }

    public void ventanaJBotones(int indice, String textoParrafo, String rutaFondo, String comando1, String comando2, String comando3, String rutaPersonajeIzquierda, String rutaPersonajeDerecha)
    {
        if(bgPanel[indice -1] == null){
            createBackground(indice, rutaFondo);
            crearObjetoDosPersonajes(indice,rutaPersonajeIzquierda,rutaPersonajeDerecha);
            crearTexto(textoParrafo,indice);
            JbotonIzq(indice,comando1);
            JbotonMid(indice,comando2);
            JbotonDer(indice,comando3);
            bgPanel[indice].add(gm.ui.bgLabel[indice]);
        }
        else{

            bgPanel[indice-1].setVisible(false);
            createBackground(indice, rutaFondo);
            crearObjetoDosPersonajes(indice,rutaPersonajeIzquierda,rutaPersonajeDerecha);
            crearTexto(textoParrafo,indice);
            JbotonIzq(indice,comando1);
            JbotonMid(indice,comando2);
            JbotonDer(indice,comando3);
            bgPanel[indice].add(gm.ui.bgLabel[indice]);

        }
    }

    public void JBotonTorre(int IndiceFondo, String comandoButtons)
    {

        JButton botonTorre = new JButton();
        botonTorre.setBounds(617, 209, 100, 100);
        botonTorre.setBackground(Color.red);
        botonTorre.setFocusPainted(false);
        botonTorre.setContentAreaFilled(false);
        botonTorre.setText("Torre");
        botonTorre.setFont(Font.getFont("Verdana"));
        botonTorre.addActionListener(gm.ControladorA); /// controlador nuevo para estos buttons
        botonTorre.setActionCommand(comandoButtons);
        botonTorre.setBorderPainted(false);
        bgPanel[IndiceFondo].add(botonTorre);

    }

    public void JBotonRey(int IndiceFondo, String comandoButtons)
    {
        JButton botonRey = new JButton();
        botonRey.setBounds(480, 55, 100, 100);
        botonRey.setBackground(new Color(255,255,255,100));
        botonRey.setFocusPainted(false);
        botonRey.setContentAreaFilled(false);
        botonRey.setText("rey");
        botonRey.setFont(Font.getFont("Verdana"));
        botonRey.addActionListener(gm.ControladorA); /// controlador nuevo para estos buttons
        botonRey.setActionCommand(comandoButtons);
        botonRey.setBorderPainted(false);
        bgPanel[IndiceFondo].add(botonRey);
    }


    public void JBotonOscuridad(int IndiceFondo, String comandoButtons)
    {
        JButton botonOscuridad = new JButton();
        botonOscuridad.setBounds(515, 132, 100, 100);
        botonOscuridad.setBackground(new Color(255,255,255,100));
        botonOscuridad.setFocusPainted(false);
        botonOscuridad.setContentAreaFilled(false);
        botonOscuridad.setText("Oscuridad");
        botonOscuridad.setFont(Font.getFont("Verdana"));
        botonOscuridad.addActionListener(gm.ControladorA); /// controlador nuevo para estos buttons
        botonOscuridad.setActionCommand(comandoButtons);
        botonOscuridad.setBorderPainted(false);
        bgPanel[IndiceFondo].add(botonOscuridad);
    }

    public void generarEscenaHojasTorre(int indice, String textoParrafo, String rutaFondo, String comandoTorre,String rutaHoja)
    {
        if(bgPanel[indice -1] == null){
            JBotonTorre(indice,comandoTorre);
            createBackground(indice, rutaFondo);
            crearTexto(textoParrafo,indice);
            crearObjeto(indice, rutaHoja);

            bgPanel[indice].add(gm.ui.bgLabel[indice]);
        }
        else{

            bgPanel[indice-1].setVisible(false);
            createBackground(indice, rutaFondo);
            JBotonTorre(indice,comandoTorre);
            crearObjeto(indice, rutaHoja);
            crearTexto(textoParrafo,indice);

            bgPanel[indice].add(gm.ui.bgLabel[indice]);

        }
    }

    public void generarEscenaHojasRey(int indice, String textoParrafo, String rutaFondo, String comandoRey,String rutaHoja)
    {
        if(bgPanel[indice -1] == null){
        JBotonRey(indice,comandoRey);
        createBackground(indice, rutaFondo);
        crearTexto(textoParrafo,indice);
        crearObjeto(indice, rutaHoja);

        bgPanel[indice].add(gm.ui.bgLabel[indice]);
    }
    else{

        bgPanel[indice-1].setVisible(false);
        createBackground(indice, rutaFondo);
        JBotonRey(indice,comandoRey);
        crearObjeto(indice, rutaHoja);
        crearTexto(textoParrafo,indice);

        bgPanel[indice].add(gm.ui.bgLabel[indice]);

    }
    }

    public void generarEscenaHojasOscuridad(int indice, String textoParrafo, String rutaFondo, String comandoOscuridad,String rutaHoja)
    {
        if(bgPanel[indice -1] == null){
            JBotonOscuridad(indice,comandoOscuridad);
            createBackground(indice, rutaFondo);
            crearTexto(textoParrafo,indice);
            crearObjeto(indice, rutaHoja);

            bgPanel[indice].add(gm.ui.bgLabel[indice]);
        }
        else{

            bgPanel[indice-1].setVisible(false);
            createBackground(indice, rutaFondo);
            JBotonOscuridad(indice,comandoOscuridad);
            crearObjeto(indice, rutaHoja);
            crearTexto(textoParrafo,indice);

            bgPanel[indice].add(gm.ui.bgLabel[indice]);

        }
    }

    public void crearEscenaPortalCartas(int indice, String rutaFondo, String comandoButtons, String comandoButtons2){

        if(bgPanel[indice -1] == null)
        {
            createBackground(indice, rutaFondo);

            reproductorUI.cargarSonido("SoundFX/13 Portal Azul Con Silencio 1.wav");
            reproductorUI.reproducirSonidoEnBucle();
            crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons);
            crearFlechaAnte(indice, Varios.FLECHA_I,comandoButtons2);
            bgPanel[indice].add(gm.ui.bgLabel[indice]);
        }
        else
        {
            bgPanel[indice-1].setVisible(false);

            createBackground(indice, rutaFondo);
            reproductorUI.cargarSonido("SoundFX/13 Portal Azul Con Silencio 1.wav");
            reproductorUI.reproducirSonidoEnBucle();
            crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons);
            crearFlechaAnte(indice, Varios.FLECHA_I,comandoButtons2);
            bgPanel[indice].add(gm.ui.bgLabel[indice]);


        }


    }

    public void crearEscenaPortalYTP(int indice, String rutaFondo, String comandoButtons, String comandoButtons2){

        if(bgPanel[indice -1] == null)
        {
            createBackground(indice, rutaFondo);

            reproductorUI.cargarSonido("SoundFX/portalGoTo.wav");
            reproductorUI.reproducirSonidoEnBucle();
            crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons);
            crearFlechaAnte(indice, Varios.FLECHA_I,comandoButtons2);
            bgPanel[indice].add(gm.ui.bgLabel[indice]);
        }
        else
        {
            bgPanel[indice-1].setVisible(false);

            createBackground(indice, rutaFondo);
            reproductorUI.cargarSonido("SoundFX/portalGoTo.wav");
            reproductorUI.reproducirSonidoEnBucle();
            crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons);
            crearFlechaAnte(indice, Varios.FLECHA_I,comandoButtons2);
            bgPanel[indice].add(gm.ui.bgLabel[indice]);


        }


    }

    public void crearEscenarioCuadro(int indice, String textoParrafo, String rutaFondo, String rutaCuadro, String comandoButtons, String comandoButtons2){

        if(bgPanel[indice -1] == null){
            createBackground(indice, rutaFondo);
            crearObjeto(indice, rutaCuadro);
            crearTexto(textoParrafo,indice);
            crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons);
            crearFlechaAnte(indice, Varios.FLECHA_I, comandoButtons2);

            bgPanel[indice].add(gm.ui.bgLabel[indice]);
        }
        else{

            bgPanel[indice-1].setVisible(false);
            createBackground(indice, rutaFondo);
            crearObjeto(indice, rutaCuadro);
            crearTexto(textoParrafo,indice);
            crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons);
            crearFlechaAnte(indice, Varios.FLECHA_I, comandoButtons2);

            bgPanel[indice].add(gm.ui.bgLabel[indice]);

        }


    }

    public void crearObjetoCredencial(int indice, String rutaImagenPersonaje) /// Esta funcion pide por parametro X,Y,Alto y Ancho del ImageIcon y la ruta de la imagen. Ademas del indice del fondo
    {
        JLabel objeto = new JLabel();
        objeto.setBounds(300,-20,500,500);

        ImageIcon ManuelIcon = new ImageIcon(Personajes.class.getResource(rutaImagenPersonaje));
        objeto.setIcon(ManuelIcon);

        /// esto hace que el objeto no quede abajo del fondo jeje
        bgPanel[indice].add(objeto); // el numero es el indice del fondo

    }

    public void crearEscenarioCredencial(int indice, String textoParrafo, String rutaFondo, String rutaCuadro, String comandoButtons, String comandoButtons2){

        if(bgPanel[indice -1] == null){
            createBackground(indice, rutaFondo);
            crearObjetoCredencial(indice, rutaCuadro);
            crearTexto(textoParrafo,indice);
            crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons);
            crearFlechaAnte(indice, Varios.FLECHA_I, comandoButtons2);

            bgPanel[indice].add(gm.ui.bgLabel[indice]);
        }
        else{

            bgPanel[indice-1].setVisible(false);
            createBackground(indice, rutaFondo);
            crearObjetoCredencial(indice, rutaCuadro);
            crearTexto(textoParrafo,indice);
            crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons);
            crearFlechaAnte(indice, Varios.FLECHA_I, comandoButtons2);

            bgPanel[indice].add(gm.ui.bgLabel[indice]);

        }


    }

    public void crearObjetoFigura(int indice, String rutaImagenPersonaje) /// Esta funcion pide por parametro X,Y,Alto y Ancho del ImageIcon y la ruta de la imagen. Ademas del indice del fondo
    {
        JLabel objeto = new JLabel();
        objeto.setBounds(510,-300,1000,1000);

        ImageIcon ManuelIcon = new ImageIcon(Personajes.class.getResource(rutaImagenPersonaje));
        objeto.setIcon(ManuelIcon);

        /// esto hace que el objeto no quede abajo del fondo jeje
        bgPanel[indice].add(objeto); // el numero es el indice del fondo

    }

    public void crearEscenarioFiguraVolteada(int indice, String textoParrafo, String rutaFondo, String rutaCuadro, String comandoButtons, String comandoButtons2){

        if(bgPanel[indice -1] == null){
            createBackground(indice, rutaFondo);
            crearObjetoFigura(indice, rutaCuadro);
            crearTexto(textoParrafo,indice);
            crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons);
            crearFlechaAnte(indice, Varios.FLECHA_I, comandoButtons2);

            bgPanel[indice].add(gm.ui.bgLabel[indice]);
        }
        else{

            bgPanel[indice-1].setVisible(false);
            createBackground(indice, rutaFondo);
            crearObjetoFigura(indice, rutaCuadro);
            crearTexto(textoParrafo,indice);
            crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons);
            crearFlechaAnte(indice, Varios.FLECHA_I, comandoButtons2);

            bgPanel[indice].add(gm.ui.bgLabel[indice]);

        }


    }

    public void crearObjetoFiguraCostado(int indice, String rutaImagenPersonaje) /// Esta funcion pide por parametro X,Y,Alto y Ancho del ImageIcon y la ruta de la imagen. Ademas del indice del fondo
    {
        JLabel objeto = new JLabel();
        objeto.setBounds(510,-295,1000,1000);

        ImageIcon ManuelIcon = new ImageIcon(Personajes.class.getResource(rutaImagenPersonaje));
        objeto.setIcon(ManuelIcon);

        /// esto hace que el objeto no quede abajo del fondo jeje
        bgPanel[indice].add(objeto); // el numero es el indice del fondo

    }

    public void crearEscenarioFiguraCostado(int indice, String textoParrafo, String rutaFondo, String rutaCuadro, String comandoButtons, String comandoButtons2){

        if(bgPanel[indice -1] == null){
            createBackground(indice, rutaFondo);
            crearObjetoFiguraCostado(indice, rutaCuadro);
            crearTexto(textoParrafo,indice);
            crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons);
            crearFlechaAnte(indice, Varios.FLECHA_I, comandoButtons2);

            bgPanel[indice].add(gm.ui.bgLabel[indice]);
        }
        else{

            bgPanel[indice-1].setVisible(false);
            createBackground(indice, rutaFondo);
            crearObjetoFiguraCostado(indice, rutaCuadro);
            crearTexto(textoParrafo,indice);
            crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons);
            crearFlechaAnte(indice, Varios.FLECHA_I, comandoButtons2);

            bgPanel[indice].add(gm.ui.bgLabel[indice]);

        }


    }

    public void crearObjetoConquistadorPrincipal(int indice, String rutaImagenPersonajeIzquierda, String rutaPersonajeDerecha){

        JLabel objeto = new JLabel();
        JLabel objeto2= new JLabel();
        objeto.setBounds(200,25,500,500);
        objeto2.setBounds(700, 25, 500, 500);

        ImageIcon ManuelIcon = new ImageIcon(Personajes.class.getResource(rutaImagenPersonajeIzquierda));
        ImageIcon PazIcon= new ImageIcon(Personajes.class.getResource(rutaPersonajeDerecha));
        objeto.setIcon(ManuelIcon);
        objeto2.setIcon(PazIcon);

        /// esto hace que el objeto no quede abajo del fondo jeje

        bgPanel[indice].add(objeto); // el numero es el indice del fondo
        bgPanel[indice].add(objeto2);


    }

    public void crearEscenarioConquistadorPersonajeUno(int indice, String textoParrafo, String rutaFondo, String rutaConquistador, String rutaPrincipal, String comandoButtons,String comandoButtons2) {

        if (bgPanel[indice - 1] == null) {
            createBackground(indice, rutaFondo);
            crearObjetoConquistadorPrincipal(indice, rutaConquistador, rutaPrincipal);
            crearTexto(textoParrafo, indice);
            crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons);
            crearFlechaAnte(indice, Varios.FLECHA_I, comandoButtons2);
            bgPanel[indice].add(gm.ui.bgLabel[indice]);
        } else {
            bgPanel[indice - 1].setVisible(false);

            createBackground(indice, rutaFondo);
            crearObjetoConquistadorPrincipal(indice, rutaConquistador, rutaPrincipal);
            crearTexto(textoParrafo, indice);
            crearFlechaSig(indice, Varios.FLECHA_D, comandoButtons);
            crearFlechaAnte(indice, Varios.FLECHA_I, comandoButtons2);
            bgPanel[indice].add(gm.ui.bgLabel[indice]);
        }

    }

}
