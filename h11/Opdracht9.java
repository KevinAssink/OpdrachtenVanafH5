package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht9 extends Applet {
    int x;
    int y;
    int B;
    int H;
    Color Zwart;
    Color Wit;


    public void init() {
        B = 30;
        H = 30;
        Zwart = Color.black;
        Wit = Color.white;

    }


    public void paint(Graphics g) {

        int x = 50;
        int y = 50;
        for (int k1 = 0; k1 < 8; k1++) {

            if (k1 == 0 || k1 == 2 || k1 == 4 || k1 == 6) {
                g.setColor(Zwart);
                g.fillRect(x, y, B, H);
            } else {
                g.setColor(Wit);
                g.fillRect(x, y, B, H);
            }
            x += B;
        }
        x = 50;
        y += H;
        for (int k2 = 0; k2 < 8; k2++) {
            if (k2 == 0 || k2 == 2 || k2 == 4 || k2 == 6) {
                g.setColor(Wit);
                g.fillRect(x, y, B, H);
            } else {
                g.setColor(Zwart);
                g.fillRect(x, y, B, H);
            }
            x += B;
        }
        x = 50;
        y += H;
        for (int k3 = 0; k3 < 8; k3++) {
            if (k3 == 0 || k3 == 2 || k3 == 4 || k3 == 6) {
                g.setColor(Zwart);
                g.fillRect(x, y, B, H);
            } else {
                g.setColor(Wit);
                g.fillRect(x, y, B, H);
            }
            x += B;
        }
        x = 50;
        y += H;
        for (int k4 = 0; k4 < 8; k4++) {
            if (k4 == 0 || k4 == 2 || k4 == 4 || k4 == 6) {
                g.setColor(Wit);
                g.fillRect(x, y, B, H);
            } else {
                g.setColor(Zwart);
                g.fillRect(x, y, B, H);
            }
            x += B;
        }
        x = 50;
        y += H;
        for (int k5 = 0; k5 < 8; k5++) {
            if (k5 == 0 || k5 == 2 || k5 == 4 || k5 == 6) {
                g.setColor(Zwart);
                g.fillRect(x, y, B, H);
            } else {
                g.setColor(Wit);
                g.fillRect(x, y, B, H);
            }
            x += B;
        }
        x = 50;
        y += H;
        for (int k6 = 0; k6 < 8; k6++) {
            if (k6 == 0 || k6 == 2 || k6 == 4 || k6 == 6) {
                g.setColor(Wit);
                g.fillRect(x, y, B, H);
            } else {
                g.setColor(Zwart);
                g.fillRect(x, y, B, H);
            }
            x += B;
        }
        x = 50;
        y += H;
        for (int k7 = 0; k7 < 8; k7++) {
            if (k7 == 0 || k7 == 2 || k7 == 4 || k7 == 6) {
                g.setColor(Zwart);
                g.fillRect(x, y, B, H);
            } else {
                g.setColor(Wit);
                g.fillRect(x, y, B, H);
            }
            x += B;
        }
        x = 50;
        y += H;
        for (int k8 = 0; k8 < 8; k8++) {
            if (k8 == 0 || k8 == 2 || k8 == 4 || k8 == 6) {
                g.setColor(Wit);
                g.fillRect(x, y, B, H);
            } else {
                g.setColor(Zwart);
                g.fillRect(x, y, B, H);
            }
            x += B;
        }
        g.setColor(Zwart);
        g.drawLine(50,50,50,290);
        g.drawLine(50,290,289,290);
        g.drawLine(289,50,289,290);
        g.drawLine(50,50,289,50);
    }
}

