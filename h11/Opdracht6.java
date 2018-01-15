package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6 extends Applet {

    public void paint (Graphics g){
        int X = 190;
        int Y2 = 20;
        int Y = 150;
        int X2 = 20;

        for (int i = 0; i < 5 ; i++) {
            g.drawOval(X,Y, X2,Y2);

            X2 += 10;
            Y2 += 10;
            X -= 5;
            Y -= 5;
        }
    }
}

