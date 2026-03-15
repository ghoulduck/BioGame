import java.awt.*;
import javax.swing.*;

public class Interface {
    private JFrame gameFrame;
    private GraphicsEnvironment ge;
    private GraphicsDevice gd;
    private GraphicsConfiguration gc;



    public Interface() {
        gameFrame = new JFrame("BioFactory");
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        gameFrame.setSize(800, 600);
        // gameFrame.
        gameFrame.setResizable(false);

        gameFrame.setAlwaysOnTop(true);
        gameFrame.setVisible(true);
        System.out.println(gameFrame.isShowing());
    }
}
