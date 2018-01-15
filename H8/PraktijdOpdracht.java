package H8;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijdOpdracht extends Applet {
    Button Plus;
    Button Minus;
    Button Delen;
    Button Maal;
    TextField tekstvakje1;
    TextField tekstvakje2;
    double getal;


    public void init() {
        tekstvakje1 = new TextField("", 20);
        tekstvakje2 = new TextField("", 20);
        Plus = new Button("+");
        PlusListener Pl = new PlusListener();
        Plus.addActionListener(Pl);
        add(Plus);
        Minus = new Button("-");
        MinusListener Ml = new MinusListener();
        Minus.addActionListener(Ml);
        add(Minus);
        Delen = new Button("/");
        DelenListener Dl = new DelenListener();
        Delen.addActionListener(Dl);
        add(Delen);
        Maal = new Button("*");
        MaalListener Xl = new MaalListener();
        Maal.addActionListener(Xl);
        add(Maal);
        add(tekstvakje1);
        add(tekstvakje2);
    }


    public void paint (Graphics g) {
    g. drawString("Het antwoord is " + getal, 150,100);
    this.setSize(450, 100);
    }


    class PlusListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            double number1 = Double.parseDouble(tekstvakje1.getText());
            double number2 = Double.parseDouble(tekstvakje2.getText());

            getal = round(number1 + number2, 2);
            repaint();
        }
    }


    class MinusListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            double number1 = Double.parseDouble(tekstvakje1.getText());
            double number2 = Double.parseDouble(tekstvakje2.getText());

            getal = round(number1 - number2, 2);
            repaint();
        }
    }


    class DelenListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            double number1 = Double.parseDouble(tekstvakje1.getText());
            double number2 = Double.parseDouble(tekstvakje2.getText());

            getal = round(number1 / number2, 2);
            repaint();
        }
    }


    class MaalListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            double number1 = Double.parseDouble(tekstvakje1.getText());
            double number2 = Double.parseDouble(tekstvakje2.getText());

            getal = round(number1 * number2, 2);
            repaint();
        }
    }


    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }



}






