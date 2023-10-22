package AWT;

import java.awt.*;  //imports awt classes
class MyFrame extends Frame {
    MyFrame() {
        FlowLayout layout = new FlowLayout();
        setLayout(layout);
        Button ok = new Button("OK");
        Button cancel = new Button("Cancel");
        add(ok);
        add(cancel);
    }
}

public class MyAwtFrame {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setTitle("Create frame and add components"); //sets title
        frame.setSize(350, 150);
        frame.setVisible(true);
    }
}
