package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht5 extends Applet {
    TextField VakjeI;
    Button Knoppje;
    Label LabalI;
    Label LabalII;
    String Tekst;
    String Result;
    String gemiddel;


    public void init() {
        VakjeI = new TextField("", 15);
        VakjeI.addActionListener(new VakjeIListener());
        Tekst = "";
        Knoppje = new Button("Ok");
        LabalI = new Label("Druk op enter om te zien of Cijfer voldoende of onvoldoende is!");
        LabalII = new Label("Druk op Ok voor het gemiddelde");
        add(VakjeI);
        add(Knoppje);
    }


    public void paint(Graphics g) {

        g.drawString(Result, 50, 45);
        g.drawString(gemiddel, 50, 55);

    }

    class VakjeIListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = VakjeI.getText();
            int input = Integer.parseInt(s);
            if (input == 1 || input == 2 || input == 3 || input == 4 || input == 5) {
                Result = "Onvoldoende";
            } else if (input == 6 || input == 7 || input == 8 || input == 9 || input == 10) {
                Result = "Voldoende";
            }
            repaint();
        }
    }

}

