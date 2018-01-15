package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijdH10 extends Applet {
    TextField VakieI;
    Button Knopje;
    String Result;
    Label LabelI;

    public void init(){
        VakieI = new TextField(15);
        Knopje = new Button("Press the Button");
        Knopje.addActionListener(new KnopjeListener());
        Result = "";
        LabelI = new Label("Alleen hele getallen AUB!");
        add(LabelI);
        add(VakieI);
        add(Knopje);
    }

    public void paint (Graphics g){
        g.drawString("Het cijfer is: " + Result, 100,75);
    }

    class KnopjeListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String a = VakieI.getText();
            int input = Integer.parseInt(a);
            if (input == 1 || input == 2 || input == 3 ) {
                Result = "slecht";
            } else if (input == 4) {
                Result = "onvoldoende";
            } else if (input == 5) {
                Result = "matig";
            } else if (input == 6|| input == 7) {
                Result = "voldoende";
            } else if (input == 8 || input == 9 || input == 10){
                Result = "goed!";
            } else
                Result = "Error:404, Cijfer niet gevonden.";
                repaint();
            }
        }
    }

