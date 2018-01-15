package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet{
    int sommy;
    int number1;
    int number2;

    public void init() {
    number1 = 0;
    number2= 1;
    sommy = number1 + number2;
    }
    public void paint (Graphics g){
        int x = 0;
        int y = 20;
        for (int i = 0; i < 20; i++) {
            g.drawString("" + sommy, x, y);
            number1 = number2;
            number2 = sommy;
            sommy = number1 + number2;
            x += 30;
        }
    }
}
