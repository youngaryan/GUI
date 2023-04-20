import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    int sides ;
    public MyPanel(){
        setBackground(Color.WHITE);
    }

    public MyPanel(int sides){
        this.sides = sides;
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int radius = Math.min(centerX, centerY) - 20;

        int[] xPoints = new int[sides];
        int[] yPoints = new int[sides];

        double angle = 2 * Math.PI / sides;
        for (int i = 0; i < sides; i++) {
            int x = (int) (centerX + radius * Math.cos(i * angle));
            int y = (int) (centerY + radius * Math.sin(i * angle));
            xPoints[i] = x;
            yPoints[i] = y;
        }
        g.drawPolygon(xPoints, yPoints, sides);
    }


}
