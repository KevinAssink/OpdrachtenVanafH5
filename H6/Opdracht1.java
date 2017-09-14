package H6;

import java.applet.Applet;
import java.awt.*;

    public class Opdracht1 extends Applet {
        int a;
        int b;
        double uitkomst;

        public void init() {
            a = 113;
            b = 4;
            uitkomst = (a / b);
        }

        public void paint(Graphics g) {
            g.drawString("De uitkomst is: " + uitkomst, 20, 20);

            g.drawString("Jan = 28,25", 20, 40);
            g.drawString("Ali = 28,25", 20, 60);
            g.drawString("Jeannette = 28,25", 20, 80);
            g.drawString("Kevin = 28,25", 20, 100);
        }





}
