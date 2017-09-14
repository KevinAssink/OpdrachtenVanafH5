package H5;

import java.applet.Applet;
import java.awt.*;

;

public class Opdracht1 extends Applet {

    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;
    int fuck;
    int kut;


    public void init() {
        opvulkleur = Color.magenta;
        lijnkleur = Color.black;
        breedte = 200;
        hoogte = 100;
        fuck = 30;
        kut = 100;
    }

    public void paint(Graphics g) {
        g.drawRect(100, 100, breedte, hoogte);
        g.drawLine(100, 75,300,75);
        g.drawRoundRect(100, 225, breedte, hoogte, fuck, fuck);
        g.setColor(opvulkleur);
        g.fillRect(315, 100, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawOval(315, 100, breedte, hoogte);
        g.setColor(opvulkleur);
        g.fillOval(315, 225, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawOval(315, 225, breedte, hoogte);
        g.drawOval(530, 100, breedte, hoogte);
        g.setColor(opvulkleur);
        g.fillArc(530,100, 200,100,0, 45);
        g.setColor(lijnkleur);
        g.drawOval(560, 225,kut, kut);


    }
}
