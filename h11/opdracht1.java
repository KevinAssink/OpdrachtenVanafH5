package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht1 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 0;
        int y = 0;

        do {
            y += 20;
            g.drawLine(50 , y, 300, y );
            g.drawString("" + teller, 305, y );
            teller++;
        } while (teller < 10);
    }
}


