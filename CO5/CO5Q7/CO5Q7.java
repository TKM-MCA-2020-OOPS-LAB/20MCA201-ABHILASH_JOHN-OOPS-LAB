//Develop a program to handle all mouse events and window events
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Mouse extends Frame implements MouseMotionListener, MouseListener {

    static JLabel label1, label2, label3, label4, label5;

    Mouse()
    {
    }

    public static void main(String[] args)
    {

        JFrame f = new JFrame("all mouse events and window events");

        f.setSize(900, 300);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();
        JPanel p1 = new JPanel();

        f.setLayout(new FlowLayout());

        JLabel l1, l2;

        l1 = new JLabel("MouseMotionListener events  :");

        l2 = new JLabel("MouseLIstener events  :");

        label1 = new JLabel("no event  ");

        label2 = new JLabel("no event  ");

        label3 = new JLabel("no event  ");

        label4 = new JLabel("no event  ");

        label5 = new JLabel("no event  ");

        Mouse m = new Mouse();

        f.addMouseMotionListener(m);
        f.addMouseListener(m);

        p.add(l1);
        p.add(label1);
        p.add(label2);
        p1.add(l2);
        p1.add(label3);
        p1.add(label4);
        p1.add(label5);

        f.add(p);
        f.add(p1);

        f.show();
    }


    public void mouseDragged(MouseEvent e)
    {

        label1.setText("mouse is dragged through point "
                + e.getX() + " " + e.getY());
    }

    public void mouseMoved(MouseEvent e)
    {

        label2.setText("mouse is moved to point "
                + e.getX() + " " + e.getY());
    }
    public void mousePressed(MouseEvent e)
    {

        label3.setText("mouse pressed at point:"
                + e.getX() + " " + e.getY());
    }

    public void mouseReleased(MouseEvent e)
    {

        label3.setText("mouse released at point:"
                + e.getX() + " " + e.getY());
    }

    public void mouseExited(MouseEvent e)
    {

        label4.setText("mouse exited through point:"
                + e.getX() + " " + e.getY());
    }
    public void mouseEntered(MouseEvent e)
    {

        label4.setText("mouse entered at point:"
                + e.getX() + " " + e.getY());
    }

    public void mouseClicked(MouseEvent e)
    {

        label5.setText("mouse clicked at point:"
                + e.getX() + " "
                + e.getY() + "mouse clicked :" + e.getClickCount());
    }
}