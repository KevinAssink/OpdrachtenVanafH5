package H6;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    int a;
    int b;
    int c;
    int uitkomst;

    public void init() {
        a = 60;
        b = 24;
        c = 365;

        //Uur

        uitkomst = a * a;
    }

    public void paint(Graphics g) {
        g.drawString("de uitkomst is: " + uitkomst + " Seconden in een uur", 20, 20);

        //Dag
        uitkomst = a * a * b;
        g.drawString("de uitkomst is: " + uitkomst + " Seconden in een dag", 20, 40);

        //Jaar
        uitkomst = c * a * a * b;
        g.drawString("de uitkomst is: " + uitkomst + " Seconden in een jaar", 20, 60);

    }

}
