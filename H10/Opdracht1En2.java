package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1En2 extends Applet{
    TextField vakjetext;
    int max;
    int number;
    int min;
    Label labal;


    public void init(){
        vakjetext = new TextField("", 20);
        vakjetextListener tvl = new vakjetextListener();
        vakjetext.addActionListener(tvl);
        labal = new Label("Typ een getal en druk op enter");
        add(labal);
        add(vakjetext);
    }


    public void paint (Graphics g){
        g.drawString("Hoogste Getal = " + max, 50,45);
        g.drawString("Laagste Getal = " + min, 50,55);
    }


    class vakjetextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            number = Integer.parseInt(vakjetext.getText());
            if (number > max){
                max = number;
                repaint();
            }
            else if (number < max){
                min = number;
                repaint();
            }
        }
    }


}


