package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht7 extends Applet{
    public void paint (Graphics g){
        int XX = 100;
        int YY2 = 20;
        int YY = 100;
        int XX2 = 20;

        for (int i = 0; i < 50 ; i++) {
            g.drawOval(XX,YY, XX2,YY2);

            XX2 += 10;
            YY2 += 10;
            XX -= 5;
            YY -= 5;
        }
    }
}

