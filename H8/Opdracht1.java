package H8;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht1 extends Applet {
    TextField tekstvak;
    Label label;
    String s;
    Button knop;

    public void init() {
        tekstvak = new TextField("", 17);
        label = new Label("Type iets en druk op 'Ok' ;)");
        knop = new Button("Reset");
        knop.addActionListener(new KnopListener());
        add(label);
        add(tekstvak);
        s = "";
        add(knop);
        knop = new Button("Ok");
        knop.addActionListener(new ResetListener());
        add(knop);

    }

    public void paint(Graphics g) {
        g.drawString(s, 50, 70);
    }

    class KnopListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");

            repaint();

        }

    }

    class ResetListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();

            repaint();

        }
    }
}