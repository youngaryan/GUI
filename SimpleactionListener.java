import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleactionListener extends JFrame implements ActionListener{
    JButton jButton;
    String[] label = {"click me ", "click me again"};
    int currentLabel = 0;

    public SimpleactionListener (){
        jButton = new JButton(label[0]);
        jButton.addActionListener(this);
        setTitle("simple action listener");
        setSize(500,500);
        jButton.setSize(100,100);
        getContentPane().add(jButton);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        currentLabel++;
        if (currentLabel>1)
            currentLabel = 0;
        jButton.setText(label[currentLabel]);
    }

    public static void main(String[] args) {

        new SimpleactionListener();
    }
}
