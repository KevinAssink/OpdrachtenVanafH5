package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht8 extends Applet {
    public void paint(Graphics g) {
        int xI = 500;
        int xII = 20;
        int yII = 20;
        int yI = 500 ;

        for (int Cirkel = 0; Cirkel < 100 ; Cirkel++) {
            g.drawOval(xI,yI,xII, yII);

            xI -= 5;
            yI -= 5;
            yII += 10;
            xII += 10;
        }
    }

}
