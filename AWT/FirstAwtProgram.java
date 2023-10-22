import java.awt.*;
import java.awt.event.*;

class FirstAwtProgram {
    public static void main(String[] args) {
        //create a frame
        Frame frame = new Frame("Swing Program");

        Button button = new Button("OK");

        //set the size of the frame
        frame.setSize(300, 250);

        frame.add(button);

        frame.addWindowListener(new WindowAdapter() {
            public void  windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.setVisible(true); //display the frame
    }
}