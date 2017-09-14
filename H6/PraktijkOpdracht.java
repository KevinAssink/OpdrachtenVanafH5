package H6;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht extends Applet {
    double a;
    double b;
    double c;
    int d;
    double uitkomst;

    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;
        uitkomst = (a + b + c) / d ;

    }
    public void paint (Graphics g) {
        g.drawString("" + uitkomst, 20,20);
        g.drawString("Het gemiddelde is 6.3", 20, 40);
    }

}