package h11;

import javafx.scene.AmbientLight;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {
    int No1;
    int Answer;


    public void init() {
    No1 = 3;
    }

    public void paint(Graphics g) {
        int X = 0;
        int Y = 20;

        for (int No2 = 0; No2 < 30 ; No2++) {
        g.drawString("" + Answer, X, Y );
        No1 = 3;
        Answer = No1*No2;

        X += 20;
        }
    }
}