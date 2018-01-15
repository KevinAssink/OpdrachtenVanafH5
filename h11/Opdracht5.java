package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5 extends Applet {

    public void paint (Graphics g){
        int X = 20;
        int Y = 20;

        for (int i = 0; i < 5 ; i++) {
            g.drawRect(X,Y,20,20);

            X += 20;
            Y += 20;
        }
    }
}
