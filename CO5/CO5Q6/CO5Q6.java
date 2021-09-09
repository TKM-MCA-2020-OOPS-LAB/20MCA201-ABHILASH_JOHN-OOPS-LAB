import java.awt.*;
import java.applet.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Graphics;

public class CO5Q6 extends Applet implements ItemListener {
    Choice ch;
    int n;

    public void init(){
        Label l1;

        l1=new Label("Select an Option");
        l1.setBounds(50, 80, 100, 20);
        add(l1);
        ch =new Choice();
        ch.addItem("choose shape");
        ch.addItem("Rectangle");
        ch.addItem("Triangle");
        ch.addItem("Square");
        ch.addItem("Circle");
        ch.addItemListener(this);
        add(ch);


    }


    public void paint(Graphics d){
        if(n==0){

        }
        if(n==1){
            d.drawRect(280, 100, 160, 40);
            d.setColor(Color.blue);
            d.fillRect(280,100,160,40);
            d.setColor(Color.pink);

        }
        if(n==2) {
            int[] x = new int[]{50, 50, 200};
            int[] y = new int[]{500, 400, 500};
            d.drawPolygon(x,y,3);
            d.setColor(Color.yellow);
            d.fillPolygon(x,y,3);

        }
        if(n==3) {
            d.drawRect(100, 100, 100, 100);
            d.setColor(Color.pink);
            d.fillRect(100,100,100,100);
            d.setColor(Color.gray);

        }
        if(n==4) {
            d.setColor(Color.blue);
            d.drawOval(400, 300, 150, 175);
            d.fillOval(400,300,150,175);
            d.setColor(Color.green);

        }


    }
    public void itemStateChanged (ItemEvent e)
    {

        n = ch.getSelectedIndex();
        repaint();
    }
}
