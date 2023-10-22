package AWT;

import java.awt.*;

public class LabelFrame extends Frame {
    LabelFrame() {
        setLayout(new FlowLayout()); //set frame's layout manager
        Label lblText = new Label("Label with Text");
        Label lblTextAlign = new Label("RightAlign", Label.RIGHT);
        add(lblText);
        add(lblTextAlign);
    }
}
