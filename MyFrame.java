import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    private MyPanel drawingPanel; // a panel to draw polygons
    public MyFrame() {
        // set size, position and location, write your own code for this
        setSize(600,600);
        // designate centre panel for drawing and add it to the frame
        Container contentPane = this.getContentPane();
        drawingPanel = new MyPanel();
        contentPane.add(drawingPanel, BorderLayout.CENTER);
        // create a column of buttons to the right (east) of the frame.
        // we don’t need any extra functionality for this panel so just use JPanel
        // without extending it, and we can use the GridLayout to specify the way
        // the eight buttons are laid out
        JPanel columnOfButtons = new JPanel(new GridLayout(8,1));

        // use a factory method to create buttons
        for (int i=3; i<10; i++)
            makeButton(columnOfButtons, String.valueOf(i), this);

        makeButton(columnOfButtons, "Exit", this);
        contentPane.add(columnOfButtons, BorderLayout.EAST);
    }

    private void makeButton(JPanel p, String name, ActionListener target) {
        JButton b = new JButton(name);    // make a new button and give it a name
        p.add(b);                // add it to the JPanel
        b.addActionListener(target);
    }

    public void actionPerformed(ActionEvent e) {
        // do things depending on which button is pressed.
// use the getActionCommand() method to identify which button has been pressed
        if (e.getActionCommand().equals("3")){
            drawingPanel.sides = 3;

        } else if (e.getActionCommand().equals("4")) {
            drawingPanel.sides = 4;

        }else if (e.getActionCommand().equals("5")) {
            drawingPanel.sides = 5;

        }else if (e.getActionCommand().equals("6")) {
            drawingPanel.sides = 6;

        }else if (e.getActionCommand().equals("7")) {
            drawingPanel.sides = 7;
        }else if (e.getActionCommand().equals("8")) {
            drawingPanel.sides = 8;

        }else if (e.getActionCommand().equals("9")) {
            drawingPanel.sides = 9;
        }else if (e.getActionCommand().equals("Exit")) {
            System.exit(0);
        }

        getContentPane().revalidate();
        getContentPane().repaint();
    }

    public static void main(String args[]) {
        JFrame frm = new MyFrame();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }
}
