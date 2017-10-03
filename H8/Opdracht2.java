package H8;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht2 extends Applet {
    int man;
    int vrouw;
    int Potententialboy;
    int Potententialgirl;
    int Totaal;
    Button Man;
    Button Vrouw;
    Button PotententialBoy;
    Button PotententialGirl;



    public void init(){
        man = 0;
        Man = new Button("Man");
        ManListener Ml = new ManListener();
        Man.addActionListener( Ml );
        add (Man);
        vrouw = 0;
        Vrouw = new Button("Vrouw");
        VrouwListener Vl = new VrouwListener();
        Vrouw.addActionListener( Vl );
        add (Vrouw);
        Potententialboy = 0;
        PotententialBoy = new Button("Potentiele Jongens");
        PotententialBoyListener Bl = new PotententialBoyListener();
        PotententialBoy.addActionListener( Bl );
        add (PotententialBoy);
        Potententialgirl = 0;
        PotententialGirl = new Button("Potentiele Meisjes");
        PotententialGirlListener Gl = new PotententialGirlListener();
        PotententialGirl.addActionListener( Gl );
        add (PotententialGirl);


    }

    public void paint (Graphics g){
        g.drawString("aantal mannen:" + man, 50, 60);
        g.drawString("aantal vrouw:" + vrouw, 50, 70);
        g.drawString("potentiele jongens:" + Potententialboy, 50, 80);
        g.drawString("potentiele meisjes:" + Potententialgirl, 50, 90);
        Totaal = man + vrouw + Potententialgirl + Potententialboy;
        g.drawString("Totaal :" + Totaal, 50, 102);
    }



    class ManListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            man++;
            repaint();
        }
    }
    class  VrouwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouw++;
            repaint();
        }
    }
    class PotententialBoyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Potententialboy++;
            repaint();
        }
    }
    class PotententialGirlListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Potententialgirl++;
            repaint();
        }
    }










}