package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3En4 extends Applet {
    TextField VakieI;
    TextField VakieII;
    String Textje;
    String Textje2;
    Button Knoppy;
    int maand;
    int jaar;
    Label LabelI;
    Label LabelII;
    String l;
    String k;


    public void init() {
        this.setSize(550,200);
        VakieI = new TextField("", 15);
        add(VakieI);
        LabelI = new Label ("<- Jaar - Maand ->");
        add(LabelI);
        VakieII = new TextField("", 15);
        add(VakieII);
        Knoppy = new Button ("Ok");
        KnoppyListener KIL = new KnoppyListener();
        Knoppy.addActionListener(KIL);
        add(Knoppy);
    }


    public void paint (Graphics g){
        //Maand
        g.drawString(Textje2, 180, 115);
        //jaar
        g.drawString(Textje, 180, 80);
    }


    class KnoppyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            l = VakieI.getText();
            int DagFeb = 28;
            jaar = Integer.parseInt( l );
            if ( (jaar % 4 == 0 && !(jaar % 100 == 0)) ||
                    jaar % 400 == 0 ) {
                Textje = ""+ jaar + " is een schrikkeljaar";
                DagFeb = 29;
            }
            else {
                Textje = ""+ jaar + " is geen schrikkeljaar";
            }
            k = VakieII.getText();
            maand = Integer.parseInt( k );
            switch (maand) {
                case 1:
                    Textje2 = "Januari, 31 dagen";
                    break;
                case 2:
                    Textje2 = "Februari " + DagFeb + " dagen";
                    break;
                case 3:
                    Textje2 = "Maart, 31 dagen";
                    break;
                case 4:
                    Textje2 = "April, 30 dagen";
                    break;
                case 5:
                    Textje2 = "Mei, 31 dagen";
                    break;
                case 6:
                    Textje2 = "Juni, 310 dagen";
                    break;
                case 7:
                    Textje2 = "Juli, 31 dagen";
                    break;
                case 8:
                    Textje2 = "Augustus, 31 dagen";
                    break;
                case 9:
                    Textje2 = "September, 30 dagen";
                    break;
                case 10:
                    Textje2 = "Oktober, 31 dagen";
                    break;
                case 11:
                    Textje2 = "November, 30 dagen";
                    break;
                case 12:
                    Textje2 = "December, 31 dagen";
                    break;
                default:
                    Textje = "Je kan alleen tot en met 12 gebruiken!";
            }

            repaint();

        }


    }
}