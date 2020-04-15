package peliculas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Interfaz extends JFrame implements ActionListener{
    Pelicula peli1 = new Pelicula("COCO", "Lee Unkrich, Adrián Molina", 2017, 0, "Miguel es un niño humilde que se gana la vida boleando zapatos en la plaza. Su gran sueño es ser un gran músico, pero este sueño se encuentra detenido por su familia. Miguel decide demostrar su talento en el concurso de músicos en la plaza el dos de noviembre, pero al tomar sin permiso la guitarra del mítico cantante que añoraba se realiza un hechizo donde llega al mundo de los muertos.");
    Pelicula peli2 = new Pelicula("BLOODSHOT", "David S. F. Wilson", 2020, 0, "Murray Ray Garrison es resucitado por un equipo de científicos. Mejorado con nanotecnología, se convierte en una máquina de matar biotecnológica sobrehumana. Cuando Ray entrena por primera vez con otros super soldados, no recuerda nada de su vida anterior. Pero cuando recuerda que lo mataron, sale de las instalaciones para vengarse, solo para descubrir que la conspiración va más allá de lo que pensaba.");
    Pelicula peli3 = new Pelicula("BIRDS OF PREY", "Cathy Yan", 2020, 0, "Después de separarse de Joker, Harley Quinn y otras tres heroínas, Canario Negro, Cazadora y Renée Montoya, unen sus fuerzas para salvar a una niña del malvado rey del crimen Máscara Negra.");
    Pelicula peli4 = new Pelicula("JUMANJI: THE NEXT LEVEL", "Jake Kasdan", 2019, 0, "Las aventuras continúan en el fantástico mundo del juego Jumanji, donde nada es lo que parece. En esta ocasión, los jugadores vuelven al juego, pero sus personajes se han intercambiado entre sí, lo que ofrece un curioso plantel: los mismos héroes con distinta apariencia.");
    Pelicula peli5 = new Pelicula("DOCTOR SLEEP", "Mike Flanagan", 2019, 0, "Dan, alcohólico y traumatizado por lo que le pasó siendo un niño en el hotel Overlook, conoce a Abra, una adolescente que posee el mismo don que él. Dan tratará de salvar a Abra de un grupo de siniestros personajes que ansían la inmortalidad y aspiran alcanzarla alimentándose de los poderes psíquicos de gente como ellos.");
    Pelicula peli6 = new Pelicula("THE CALL OF THE WILD", "Chris Sanders", 2020, 0, "En el Yukón canadiense en la década de 1890 se está produciendo la fiebre del oro. Los perros de trineo que pueden cubrir el terreno difícil a lo largo del río Klondike son codiciados por muchos y se convierten en un activo valioso. Como resultado, Buck es robado y vendido.");
    Pelicula peli7 = new Pelicula("BAD BOYS FOR LIFE", "Bilall Fallah, Adil El Arbi", 2020, 0, "Los policías de la vieja escuela Mike Lowery y Marcus Burnett vuelven a patrullar juntos para derrotar al líder vicioso de un cartel de drogas de Miami. El recién creado equipo de élite AMMO del departamento de policía de Miami junto con Mike y Marcus se enfrentan al despiadado Armando Armas.");
    Pelicula peli8 = new Pelicula("BOMBSHELL", "Jay Roach", 2020, 0, "Cuando Gretchen Carlson golpea al fundador de Fox News, Roger Ailes, con una demanda alegando acoso sexual, nadie podía predecir lo que sucedería después. Su decisión lleva a la corresponsal de Fox News, Megyn Kelly, a presentar su propia historia, así como a muchas otras mujeres, incitando a un movimiento que reverbera en todo el mundo."); 
    Pelicula peli9 = new Pelicula("ZOMBIELAND: DOUBLE TAP", "Ruben Fleischer", 2020, 0, "Los cazadores de zombis viajan desde la Casa Blanca hasta el corazón de los Estados Unidos, donde tendrán que defenderse de nuevas clases de muertos vivientes que han evolucionado. Mientras intentan salvar el mundo, los miembros de la pandilla también tendrán que aprender a convivir.");
    Pelicula peli10 = new Pelicula("CHARLIE’S ANGELS", "Elizabeth Banks", 2020, 0, "La agencia de detectives Townsend es conocida por los servicios ofrecidos por sus Ángeles: un trío de mujeres que cambia de una generación a otra. La agencia se ha hecho internacional y ahora tiene varios equipos de Ángeles en todo el mundo. Una tecnología peligrosa está a punto de ser lanzada, por lo que varios ángeles son enviados a investigar. Reboot de \"Los ángeles de Charlie\", basada en la popular serie de los años 70.");
    
   JTextArea ta1;
   JLabel l1, l2, l3; 
   JPanel p1, p2, p3;
   JTextField t1, t2;
   JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11;
    public Interfaz(){
        
        ArrayList lista = new ArrayList(); 
        
        lista.add(peli1);
        lista.add(peli2);
        lista.add(peli3);
        lista.add(peli4);
        lista.add(peli5);
        lista.add(peli6);
        lista.add(peli7);
        lista.add(peli8);
        lista.add(peli9);
        lista.add(peli10);
        
        setBounds(500,100,500,700);
        
        b1 = new JButton("COCO");
        b2 = new JButton("BLOODSHOT");
        b3 = new JButton("BIRDS OF PREY");
        b4 = new JButton("JUMANJI: THE NEXT LEVEL");
        b5 = new JButton("DOCTOR SLEEP");
        b6 = new JButton("THE CALL OF THE WILD");
        b7 = new JButton("BAD BOYS FOR LIFE");
        b8 = new JButton("BOMBSHELL");
        b9 = new JButton("ZOMBIELAND: DOUBLE TAP");
        b10 = new JButton("CHARLIE’S ANGELS");
        l1= new JLabel("Seleccione la pelicula que quiere ver: ");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        
        b1.setActionCommand("COCO");
        b2.setActionCommand("BLOODSHOT");
        b3.setActionCommand("BIRDS OF PREY");
        b4.setActionCommand("JUMANJI: THE NEXT LEVEL");
        b5.setActionCommand("DOCTOR SLEEP");
        b6.setActionCommand("THE CALL OF THE WILD");
        b7.setActionCommand("BAD BOYS FOR LIFE");
        b8.setActionCommand("BOMBSHELL");
        b9.setActionCommand("ZOMBIELAND: DOUBLE TAP");
        b10.setActionCommand("CHARLIE’S ANGELS");

        ta1=new JTextArea();
        ta1.setLineWrap(true);
        ta1.setWrapStyleWord(true);
        b11 = new JButton("Comprar");

        l2= new JLabel("Entradas vendidas de estas pelicula: ");
        t1= new JTextField(40);
        l3= new JLabel("Entradas vendidas en total: ");
        t2= new JTextField(40);
        
        p1.add(l1,BorderLayout.CENTER);
        p1.add(b1,BorderLayout.CENTER);
        p1.add(b2,BorderLayout.CENTER);
        p1.add(b3,BorderLayout.CENTER);
        p1.add(b4,BorderLayout.CENTER);
        p1.add(b5,BorderLayout.CENTER);
        p1.add(b6,BorderLayout.CENTER);
        p1.add(b7,BorderLayout.CENTER);
        p1.add(b8,BorderLayout.CENTER);
        p1.add(b9,BorderLayout.CENTER);
        p1.add(b10,BorderLayout.CENTER);
        
        p1.add(ta1);
        p1.add(b11);
        
        p1.add(l2);
        p1.add(t1);
        p1.add(l3);
        p1.add(t2);
        
        add(p1, BorderLayout.SOUTH);
        
        String p;
        java.util.Iterator it = lista.iterator();
        for(int i=1; i<n; i++){
        Pelicula peli = (Pelicula)it.next(); 
        p = it.toString(peli);
        }

        ta1.append(p);
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
       String p;
     
        int n = 0;
        if(e.getActionCommand().equals(1)){
            n=1;
        }else if (e.getActionCommand().equals("BLOODSHOT")) {
            n=2;
        } else if (e.getActionCommand().equals("BIRDS OF PREY")) {
            n=3;
        }else if (e.getActionCommand().equals("JUMANJI: THE NEXT LEVEL")) {
            n=4;
        }else if (e.getActionCommand().equals("DOCTOR SLEEP")){   
            n=5;
        } else if (e.getActionCommand().equals("THE CALL OF THE WILD")){
            n=6;
        } else if (e.getActionCommand().equals("BAD BOYS FOR LIFE")){
            n=7;
        } else if (e.getActionCommand().equals("BOMBSHELL")){
            n=8;
        } else if (e.getActionCommand().equals("ZOMBIELAND: DOUBLE TAP")){
            n=9;
        } else if (e.getActionCommand().equals("CHARLIE’S ANGELS")){
            n=10; 
        }

    }
    
     public static void main(String[] args) {
         
        Interfaz Cartelera = new Interfaz();
    } 


 
 
}
